package it.begear.corsi.corsosdet.uitest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Utility {

	private static final Logger LOGGER = LoggerFactory.getLogger(Utility.class);

	public static final String DRIVER_TARGET_URL = "driver.target.url";

	/**
	 * Driver type. [firefox|chrome|iexplorer|electron|mobile]
	 */
	private static final String DRIVER_TYPE = "driver.type";

	public static final String DRIVER_TYPE_CHROME = "chrome";
	public static final String DRIVER_TYPE_FIREFOX = "firefox";
	public static final String DRIVER_TYPE_ELECTRON = "electron";
	public static final String DRIVER_TYPE_IEXPLORER = "iexplorer";
	public static final String DRIVER_TYPE_MOBILE = "mobile";
	public static final String CHROME_DRIVER = "chrome.driver";
	public static final String IE_DRIVER = "ie.driver";
	public static final String ELECTRON_BINARY = "electron.binary";
	public static final String ELECTRON_APP_ARGS = "electron.app.args";
	public static final String REPORT_IMAGES_DIR = "report.images.dir";
	public static final String DEFAULT_REPORT_IMAGES_DIR = "embedded-images";
	public static final String SCENARIO_ID = "scenario.calculated.id";

	private static final long defaultImplicitWaitTimeout = 10L;

	private static Utility instance;

	private Map<String, Properties> properties = null;

	protected WebDriver currentDriver = null;

	private Properties p = null;

	private Utility() {
		MultiPropertiesInterface multiPropertiesLoader = new MultiProperties(
				(file) -> file.getName().split("-")[0]);
		
		properties = multiPropertiesLoader.loadAndCheck((d, name) -> name.endsWith("-ui.properties"));
	}

	public synchronized static Utility ui() {
		if (instance == null) {
			instance = new Utility();
		}
		return instance;
	}

	/**
	 * Build a SeleniumWebDriver configured using
	 * <configurationType>-ui.properties If the properties 'driver.target.url'
	 * is set, the driver will point to that URL.
	 * 
	 * @param configurationType
	 * @return the Selenium WebDriver configured. The implicit wait is 10
	 *         seconds.
	 */
	public WebDriver driver(String configurationType) {
		this.currentDriver = buildDriverWith(configurationType);
		return currentDriver;
	}

	/**
	 * Build a SeleniumWebDriver configured using default-ui.properties
	 *
	 * @return the Selenium WebDriver configured
	 */
	public WebDriver driver() {
		return driver("default");
	}

	/**
	 * Quits this driver, closing every associated window.
	 */
	public void closeDriver(WebDriver driver) {

		MarkContext context = LocalThread.get();
		if (driver != null) {
			if (context != null) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("dynaTrace.endVisit();");
			}
			driver.quit();
		}
	}

	private WebDriver buildDriverWith(String configurationType) {
		p = properties.get(configurationType);

		if (p == null) {
			throw new IllegalArgumentException("Unable to find configuration for type: " + configurationType);
		}

		String driverType = p.getProperty(DRIVER_TYPE);

		if (!driverType.equals(DRIVER_TYPE_ELECTRON))
			throw new UnsupportedOperationException("Unsupported driver type: " + driverType);

		WebDriver driverBuilt = null;
		driverBuilt = buildElectronDriver(p);

		// performUiMonitoring(driverBuilt);
		driverBuilt.manage().timeouts().implicitlyWait(defaultImplicitWaitTimeout, TimeUnit.SECONDS);

		return driverBuilt;

	}

	// private void performUiMonitoring(WebDriver driverBuilt) {
	// UiBenchmarkableContext context = (UiBenchmarkableContext)
	// AutomationThreadLocal.get();
	// if (context != null) {
	// List<BenchmarkableAnnotationObject> benchmarkableObjectList =
	// context.getBenchmarkableObjectList();
	// JavascriptExecutor js = (JavascriptExecutor) driverBuilt;
	//
	// BenchmarkableAnnotationObject benchmarkableObject =
	// benchmarkableObjectList.get(0);
	// String testRunId = context.getTestRunId();
	//
	// js.executeScript("sessionStorage.DT_TESTRUNID = \"" + testRunId + "\";");
	// js.executeScript("sessionStorage.DT_TESTNAME = \"" +
	// benchmarkableObject.getName() + "\";");
	//
	// context.setDriver(driverBuilt);
	// AutomationThreadLocal.unset();
	// AutomationThreadLocal.set(context);
	//
	// }
	// }

	private WebDriver buildElectronDriver(Properties p) {
		String chromeDriver = extractMandatoryPropertyValue(CHROME_DRIVER, p);
		String electronBinary = extractMandatoryPropertyValue(ELECTRON_BINARY, p);

		// mandatory for selenium
		System.setProperty("webdriver.chrome.driver", chromeDriver);
		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		ChromeOptions options = new ChromeOptions();
		options.setBinary(electronBinary);
		String appArgs = p.getProperty(ELECTRON_APP_ARGS);

		if (StringUtils.isNotBlank(appArgs)) {

			// The value of property electron.app.args must be enclosed in
			// single curly braces.
			// You need to set a comma-separated list of key and value pairs.
			int lastIndex = appArgs.length() - 1;
			char first = appArgs.charAt(0);
			char last = appArgs.charAt(lastIndex);

			if ((first == '{') && (last == '}')) {
				String arguments = appArgs.substring(1, lastIndex);
				String[] args = arguments.split(",");
				List<String> argsList = Arrays.asList(args);

				for (String arg : argsList) {

					// To start Electron application using custom command line
					// arguments
					// you need to specify arguments in the format
					// <Key>=<value>.
					Pattern keyValuePattern = Pattern.compile("(.+?)=(.+?)");
					Matcher matcherKeyValuePattern = keyValuePattern.matcher(arg);

					if (!matcherKeyValuePattern.find()) {
						throw new IllegalArgumentException("The argument " + arg
								+ " of list specified in electron.app.args property must be in the format <Key>=<value>!");
					}

					// The property electron.app.args cannot take the key of
					// each
					// custom argument in camelCase format but with hyphens
					// syntax
					String key = arg.split("=")[0];
					Pattern camelCasePattern = Pattern.compile("[a-z]+[A-Z0-9][a-z0-9]+[A-Za-z0-9]*");
					Matcher matcherCamelCasePattern = camelCasePattern.matcher(key);

					if (matcherCamelCasePattern.find()) {
						throw new IllegalArgumentException(
								"The property electron.app.args cannot take the key of argument " + arg
										+ " in camelCase format but with hyphens syntax! E.g., the key electronPort needs to be changed in electron-port!");
					}

				}
				options.addArguments(argsList);

			} else {

				throw new IllegalArgumentException(
						"The value of property electron.app.args must be enclosed in single curly braces! It must be a comma-separated list of key and value pairs that represents the custom command line arguments of electron application! E.g., {webpack-port=3000,electron-port=8000}");

			}

		}

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		capabilities.setBrowserName("electron");
		return new ChromeDriver(capabilities);

	}

	/**
	 * Check if the element find by this locator is contained in the DOM
	 * 
	 * @param locator
	 * The locator used to find the element
	 * @return true if the element is not present, false otherwise
	 */
	public ExpectedCondition<Boolean> elementNotPresent(By locator) {
		return new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
				List<WebElement> findElements = driver.findElements(locator);
				driver.manage().timeouts().implicitlyWait(defaultImplicitWaitTimeout, TimeUnit.SECONDS);
				return findElements.size() == 0;
			}
		};
	}

	protected String extractMandatoryPropertyValue(String propertyKey, Properties dictionary) {
		if (dictionary == null) {
			throw new IllegalArgumentException("Property dictionary null!");
		}
		if (StringUtils.isBlank(propertyKey)) {
			throw new IllegalArgumentException("Property key is blank!");
		}
		String property = dictionary.getProperty(propertyKey);
		if (StringUtils.isBlank(property)) {
			throw new IllegalArgumentException("Unable to find property '" + propertyKey + "'. It is mandatory! ");
		}
		return property;

	}

	/**
	 * for internal use only
	 * 
	 * @return
	 */
	public WebDriver getCurrentDriver() {
		return this.currentDriver;
	}

	/**
	 * for internal use only
	 * 
	 * @return
	 */
	public Properties getCurrentProperties() {
		return this.p;
	}

}
