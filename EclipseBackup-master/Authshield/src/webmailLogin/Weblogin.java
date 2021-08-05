package webmailLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Weblogin {
	
	
	
  @Test
  public void weblogin() {
	  
	 
	   //Desired capabilities for Handle insecure certificate
	  
	   DesiredCapabilities ch =new   DesiredCapabilities();
	   ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	   // local browser handling.
	   ChromeOptions c =new ChromeOptions();
	   c.merge(ch);
	   System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(c);
		  
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		   
		   driver.get("https://dummy.nic.in");
	   
	   // verify the login of webmail using push token authentication
		   
		   
		  // ******* Enter  valid username and valid password
  
		   
		   int i = 0;
		while (i < 10) {
	   driver.findElement(By.id("username")).sendKeys("kavach-test4@nic.in");
	   driver.findElement(By.id("password")).sendKeys("Admin@#3214");
	   driver.findElement(By.xpath("//*[@type='submit']")).click();
	   System.out.println(driver.findElement(By.id("ZLoginErrorPanel")).getText());
	   driver.quit();
  
		   }
  
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	  
  }
}
