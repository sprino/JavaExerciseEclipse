package it.begear.corsi.corsosdet.uitest;

import java.io.FilenameFilter;
import java.util.Map;
import java.util.Properties;

public interface MultiPropertiesInterface {
	/*
	 * Load all properties found in the properties. Validate propertiesKeys list as mandatory properties.
	 */
	public Map<String,Properties> loadAndCheck(FilenameFilter filenameFilter,String...propertieskeys);

}
