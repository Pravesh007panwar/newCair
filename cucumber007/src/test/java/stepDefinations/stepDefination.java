package stepDefinations;

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

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {
	public static WebDriver driver;

	@Given("^user navigates to Innsight$")
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

	@When("I enter Username as {string} and Password as {string}")
	public void i_enter_username_as_and_password_as(String string, String string2) {

		driver.findElement(By.name("userName")).sendKeys(string);
		driver.findElement(By.className("password")).sendKeys(string2);
	}

	@When("^click on login button$")
	public void click_on_login_button() {
		driver.findElement(By.className("loginbtn")).sendKeys(Keys.ENTER);
	}

	@Then("login should be unsuccessful")
	public void login_should_be_unsuccessful() {
		System.out.println("Login Sucess");
	}

}
