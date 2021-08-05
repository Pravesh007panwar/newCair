package setpDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition {
	WebDriver driver = null;

	@Given("^user navigates to Authshield$")
	public void user_navigates_to_Authshield() {

		DesiredCapabilities ch = new DesiredCapabilities();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		// local browser handling.
		ChromeOptions c = new ChromeOptions();

		c.merge(ch);

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver(c);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://192.168.2.163/mfid/");
		System.out.println("Welcome to Authshield Login");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Select login = new Select(driver.findElement(By.name("organisationName")));
		login.selectByVisibleText("MEITY");
		Select login1 = new Select(driver.findElement(By.name("domain")));
		login1.selectByVisibleText("NIC");
		Select login2 = new Select(driver.findElement(By.name("application")));
		login2.selectByVisibleText("webmail");

	}

	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void i_enter_Username_as_and_Password_as(String username, String password) {
		driver.findElement(By.id("input-username")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("login-btn_remove")).click();
	}

	@Then("^login should be unsuccessful$")
	public void login_should_be_unsuccessful() {
		driver.close();
	}

}
