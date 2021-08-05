package Naukri.comUpdate;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class profileUpdate {

	private WebDriver driver;

	@Test
	public void NaukriLogin() throws InterruptedException {

		driver.get("https://login.naukri.com/nLogin/Login.php");
		driver.findElement(By.cssSelector("input#usernameField")).clear();
		driver.findElement(By.cssSelector("input#usernameField")).sendKeys("pravesh256@gmail.com");
		driver.findElement(By.cssSelector("input#passwordField")).clear();
		driver.findElement(By.cssSelector("input#passwordField")).sendKeys("Innefu@123");
		driver.findElement(By.cssSelector("input#passwordField")).sendKeys(Keys.ENTER);

		Thread.sleep(3000);
		driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("input#attachCV")).sendKeys("D:\\selenium\\pravesh_QA-CV-2021.docx");
		
		Thread.sleep(10000);

	}

	@BeforeTest
	public void beforeTest() {

		DesiredCapabilities ch = new DesiredCapabilities();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		// local browser handling.
		ChromeOptions c = new ChromeOptions();

		c.merge(ch);

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver(c);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.naukri.com/browse-jobs");
		System.out.println("Welcome to Naukri.com Portal!");
		driver.navigate().refresh();

	}

	@AfterTest
	public void afterTest() {

		driver.quit();
	}

}
