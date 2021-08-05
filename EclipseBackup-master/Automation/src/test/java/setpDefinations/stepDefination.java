package setpDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class stepDefination {

	public static WebDriver driver;

	@Given("^user navigates to the website https://(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)/mfid$")
	public void user_navigates_to_the_website_https_mfid1(int arg1, int arg2, int arg3, int arg4) throws Throwable {

		DesiredCapabilities ch = new DesiredCapabilities();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		// local browser handling.
		ChromeOptions c = new ChromeOptions();

		c.merge(ch);

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver(c);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@When("^User Navigate to Login Page$")
	public void user_Navigate_to_Login_Page1() throws Throwable {
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

	@When("^user logs in through Login Window by using <Username> as \"([^\"]*)\"$")
	public void user_logs_in_through_Login_Window_by_using_Username_as(String arg1) throws Throwable {

		driver.findElement(By.id("input-username")).sendKeys(arg1);
	}

	@When("^<Password> as \"([^\"]*)\"$")
	public void password_as(String arg2) throws Throwable {

		driver.findElement(By.id("input-password")).sendKeys(arg2);
		driver.findElement(By.id("login-btn_remove")).click();

		if (driver.getCurrentUrl().equalsIgnoreCase("https://192.168.2.163/mfid/login_showLogin.action#!"))
			System.out.println("User Login Successfully");

		else {
			String alert = driver.findElement(By.id("alertBox")).getText();
			System.out.println(alert);
			driver.findElement(By.id("closeBtn")).click();

		}
	}

	@Then("^login must be successful\\.$")
	public void login_must_be_successful() throws Throwable {

		if (driver.getCurrentUrl().equalsIgnoreCase("https://192.168.2.163/mfid/login_showLogin.action#!"))
			System.out.println("Test Pass");

		else {
			System.out.println("Test Failed");
		}

	}

	@After
	public void cleanUp() {
		driver.close();
	}
}
