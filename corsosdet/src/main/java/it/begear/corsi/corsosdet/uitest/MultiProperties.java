package it.begear.corsi.corsosdet.uitest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.function.Function;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MultiProperties implements MultiPropertiesInterface {

	private static final Logger logger = LoggerFactory.getLogger(MultiProperties.class);

	private final String DEFAULT_RELATIVE_DIR_PATH_PROPERTY = "confPath";
	private final String DEFAULT_ABSOLUTE_DIR_PATH_PROPERTY = "absoluteConfPath";

	private String propertiesDirectoryPath;

	private Function<File, String> bundleKeyExtractor;

	/**
	 * Use system properties to get conf files directory.
	 * 
	 * @param bundleKeyExtractor
	 *            A functional interface containing the bundle key extractor
	 *            from the File
	 */
	public MultiProperties(Function<File, String> bundleKeyExtractor) {
		this.bundleKeyExtractor = bundleKeyExtractor;

		String absolutePath = System.getProperty(DEFAULT_ABSOLUTE_DIR_PATH_PROPERTY);

		if (StringUtils.isBlank(absolutePath)) {
			// absolute path empty. Try relative path
			String relativePath = System.getProperty(DEFAULT_RELATIVE_DIR_PATH_PROPERTY);
			if (StringUtils.isBlank(relativePath)) {
				throw new IllegalArgumentException(
						"Both relative and abosulte system properties are not set. Please use -D"
								+ DEFAULT_ABSOLUTE_DIR_PATH_PROPERTY + " or -D" + DEFAULT_RELATIVE_DIR_PATH_PROPERTY
								+ " .Absolute path take precedence");
			} else {
				// relative path set
				propertiesDirectoryPath = System.getProperty("user.dir") + File.separator + relativePath;
			}
		} else {
			// absolute path set. If not black absolute path always take
			// precedence over relative path
			propertiesDirectoryPath = absolutePath;
		}

	}
	@Override
	public Map<String, Properties> loadAndCheck(FilenameFilter filenameFilter, String... propertieskeys) {
		Map<String, Properties> result = new HashMap<String, Properties>();

		logger.info("Start searching api server properties files into {} directory .....", propertiesDirectoryPath);

		File propertiesDirectory = new File(propertiesDirectoryPath);
		File[] files = propertiesDirectory.listFiles(filenameFilter);

		if (ArrayUtils.isEmpty(files)) {
			throw new IllegalArgumentException(
					"no properties found in the path '" + propertiesDirectoryPath + "' applying filter");
		}

		for (File file : files) {

			/*
			 * use the properties file name prefix as key for the different
			 * servers. expecting to have at least a deafault-api.properties
			 * file
			 */

			String propertiesBundleKey = bundleKeyExtractor.apply(file);

			logger.info("Starting loading properties for {}", propertiesBundleKey);
			Properties properties = new Properties();

			try {
				properties.load(new FileInputStream(file));
			} catch (Exception e) {
				// as we checked early if any file exists. This code branch
				// should never be reached
				throw new IllegalArgumentException("no properties file found for '" + file.getName() + "'");
			}

			validateMandatory(file.getName(), properties, propertieskeys);

			result.put(propertiesBundleKey, properties);
		}
		return result;
	}

	private void validateMandatory(String filename, Properties properties, String... propertieskeys) {

		for (String propertykey : propertieskeys) {
			if (StringUtils.isBlank((String) properties.get(propertykey)))
				throw new IllegalArgumentException(propertykey + " is undefined or empty. Please set " + propertykey
						+ " property in the " + filename + " file");
		}
	}
}
