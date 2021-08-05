package Com.Auth.Common;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import AS.ObjectRepository.AuthLoginPage;
import DataProvider.ConfigFileReader;
import Managers.PageObjectManager;
import io.github.bonigarcia.wdm.WebDriverManager;

abstract public class BaseClass {

	
	public static WebDriver driver;
	public static AuthLoginPage AuthLogin;
	public static ConfigFileReader configFileReader;
	public static Select select;
	public static PageObjectManager pom;

	public static void initailizedriver() {

		configFileReader = new ConfigFileReader();

		DesiredCapabilities ch = new DesiredCapabilities();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);

		WebDriverManager.chromedriver().setup();

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

		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);

		driver.get(configFileReader.getAuthApplicationUrl());
		
		pom = new PageObjectManager(driver);
		AuthLogin = pom.getAuthLoginPage();
		select = new Select(AuthLogin.SelectOrganization());
		select.selectByIndex(1);
		select = new Select(AuthLogin.SelectDomain());
		select.selectByIndex(1);
		select = new Select(AuthLogin.SelectApplication());
		select.selectByIndex(1);

	}

	public static void CloseBrowser() {

		driver.quit();
	}
	
	public static void AlertHandler() {

		try {

			String Alerttext = driver.findElement(By.xpath("//*[@id=\"alertBox\"]/h1")).getText();
			System.out.println(Alerttext);
			String Alerttextbody = driver.findElement(By.xpath("//*[@id=\"alertBox\"]/p")).getText();
			System.out.println(Alerttextbody);
			WebElement ele = driver.findElement(By.xpath("//*[@id=\"closeBtn\"]"));
			Actions alertclick = new Actions(driver);
			alertclick.moveToElement(ele).click().build().perform();
		}

		finally {

			System.out.println("Closing Browser");
			driver.quit();
		}
}
}
