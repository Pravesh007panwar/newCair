package myfirstprgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class parallel {
public static WebDriver driver;
	
	@Test
	
	public void browser1()
	
	
	{
		
		DesiredCapabilities ch =new   DesiredCapabilities();
		   ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		   // local browser handling.
		   ChromeOptions c =new ChromeOptions();
		   
		   c.merge(ch);
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		   driver =new ChromeDriver(c);
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   
		   driver.get("http://192.168.2.177/mfid/");
		
	}
	
	@Test
	
	public void browser2()
	
	
{
		
		DesiredCapabilities ch =new   DesiredCapabilities();
		   ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		   // local browser handling.
		   ChromeOptions c =new ChromeOptions();
		   
		   c.merge(ch);
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		   driver =new ChromeDriver(c);
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   
		   driver.get("http://192.168.2.163/mfid/");
	
}

}
