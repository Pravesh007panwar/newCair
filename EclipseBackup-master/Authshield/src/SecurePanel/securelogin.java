package SecurePanel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class securelogin {
	public static WebDriver driver;
  @Test
  public void f() {
	  
	  
	  DesiredCapabilities ch =new   DesiredCapabilities();
	   ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	   // local browser handling.
	   ChromeOptions c =new ChromeOptions();
	   
	   c.merge(ch);
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	   driver =new ChromeDriver(c);
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   
	   driver.get("http://192.168.2.177:8080/mfid/user");
	   System.out.println("Welcome to Authshield Login");
	  System.out.println(driver.getTitle());
	  System.out.println(driver.getCurrentUrl());
	  Select login = new Select(driver.findElement(By.name("organisationName")));
	   login.selectByVisibleText("AuthShield");
	   Select login1 =new Select(driver.findElement(By.name("domain")));
	   login1.selectByVisibleText("default_domain");
	   Select login2 =new Select(driver.findElement(By.name("application")));
	   login2.selectByVisibleText("defaultApp");
	   driver.findElement(By.id("input-username")).sendKeys("user1");
	   driver.findElement(By.id("input-password")).sendKeys("Innefu@123");
	   driver.findElement(By.id("input-password")).sendKeys(Keys.TAB);
	   driver.findElement(By.id("login-btn_remove")).click();
  }
}
