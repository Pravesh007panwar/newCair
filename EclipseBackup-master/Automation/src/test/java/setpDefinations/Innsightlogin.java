package setpDefinations;



import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Innsightlogin {
	public static WebDriver driver;

	@Given("^User Navigates to login page$")
	public void user_navigates_to_login_page() {
		
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
		System.out.println("Welcome to INNSIGHT");
		
		
		driver.get("http://office.authshieldserver.com:8081/innsight/login_validateCredential");

	}

	@When("^user enter valid (.+) as \"([^\"]*)\" and  (.+) as \"([^\"]*)\"$")
	public void user_enter_valid_as_something_and_as_something(String username, String password, String strArg1,
			String strArg2)  {
		driver.findElement(By.name("userName")).sendKeys(strArg1);
		driver.findElement(By.className("password")).sendKeys("password");
		
	}

	@And("^click on login button$")
	public void click_on_login_button() {
		driver.findElement(By.className("loginbtn")).sendKeys(Keys.ENTER);

	}

	@Then("^user should Login successfully$")
	public void user_should_login_successfully() {
		System.out.println("Login Success");
	}

	@BeforeTest

	public void beforeTest() {

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
		System.out.println("Welcome to INNSIGHT");

	}
}