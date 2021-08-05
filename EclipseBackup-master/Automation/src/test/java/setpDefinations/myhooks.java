package setpDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class myhooks {

	WebDriver driver = null;

	@Before(order = 1)
	public void Authstep() {

		System.out.println("Welcome to Authshield Login Panel");

		DesiredCapabilities ch = new DesiredCapabilities();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ChromeOptions c = new ChromeOptions();

		c.merge(ch);

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver(c);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://192.168.2.163/mfid");

	}
	/*
	 * @Before(order =2) public void setup() {
	 * System.out.println("Launch facebook");
	 * 
	 * DesiredCapabilities ch =new DesiredCapabilities();
	 * ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true); ChromeOptions c
	 * =new ChromeOptions();
	 * 
	 * c.merge(ch);
	 * 
	 * System.setProperty("webdriver.chrome.driver",
	 * "D:\\selenium\\chromedriver.exe"); driver =new ChromeDriver(c);
	 * driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 * driver.manage().window().maximize(); driver.get("https://facebook.com");
	 */

	@After(order = 1)
	public void teardown2() {

		driver.close();
		System.out.println("close the browser");
	}
}