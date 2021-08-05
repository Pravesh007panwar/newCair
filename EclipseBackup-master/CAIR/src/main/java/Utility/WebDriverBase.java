package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public abstract class WebDriverBase {

	public static WebDriver driver;
	public static Properties prop;
	private static Logger log = LogManager.getLogger(WebDriverBase.class.getName());

	public WebDriver initializedriver() throws IOException {

		prop = new Properties();
		String path = System.getProperty("user.dir") + "\\src\\main\\java\\BrowserName.properties";
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		String browser = prop.getProperty("browser");

		if (browser.equals("Chrome")) {

			DesiredCapabilities ch = new DesiredCapabilities();
			ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			ChromeOptions c = new ChromeOptions();
			c.merge(ch);
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chromedriver.exe");
			c.setExperimentalOption("useAutomationExtension", false);
			c.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));

			c.addArguments("--start-maximized");
			c.addArguments("--disable-web-security");
			c.addArguments("--no-proxy-server");

			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			c.setExperimentalOption("prefs", prefs);

			driver = new ChromeDriver(c);

			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		}

		else if (browser.equals("firefox")) {

			driver = new FirefoxDriver();

		} else if (browser.equals("IE")) {

			driver = new InternetExplorerDriver();

		}

		String urlName = prop.getProperty("url");
		driver.get(urlName);

		return driver;

	}

	public void logs() {

		log.info("Welcome To Innsight");
		log.info("Test Cases Executing");

	}

	public void CloseBrowser()

	{
		if (driver != null)
			driver.quit();
	}

}