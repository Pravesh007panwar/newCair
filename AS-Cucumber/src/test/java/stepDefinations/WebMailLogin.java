package stepDefinations;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import AS.ObjectRepository.WebmailLoginPage;
import DataProvider.ConfigFileReader;
import Managers.PageObjectManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebMailLogin {
	WebDriver driver;
	WebmailLoginPage LP; 
	PageObjectManager pageObjectManager;
	ConfigFileReader configFileReader;

	@Given("^WebMail Login Page Should be Open$")
	public void webmail_login_page_should_be_open() {
		configFileReader= new ConfigFileReader();
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
		driver.get(configFileReader.getApplicationUrl());
	}

	@When("^User Enters Valid Username and Enters valid Password$")
	public void user_enters_valid_username_and_enters_valid_password() {

		pageObjectManager = new PageObjectManager(driver);
		LP = pageObjectManager.getWebmailLoginPage();
		LP.enterusername();
		LP.enterpassword();

	}

	@And("^Click on Login SingIn Button$")
	public void click_on_login_singin_button() {

		LP.ClickonSignIn();

	}

	@Then("^User should successfully Login $")
	public void user_should_successfully_login() {

		System.out.println("Login Sucessfull");

	}
	
	@When("User Enters Valid {string} and Enters valid {string}")
	public void user_enters_valid_and_enters_valid(String username, String password) {
	   
	  driver.findElement(By.cssSelector("input#username")).sendKeys(username);
	  driver.findElement(By.cssSelector("input#password")).sendKeys(password);
	}
	
	@When("User Enters Valid <usernmae> and Enters valid {int}")
	public void user_enters_valid_usernmae_and_enters_valid(Integer int1) {
	    
	}
}
