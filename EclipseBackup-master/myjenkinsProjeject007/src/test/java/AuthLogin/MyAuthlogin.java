package AuthLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MyAuthlogin {
	public static WebDriver driver;

	@Test

	public void AuthshieldLogin() {

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
		driver.findElement(By.id("input-username")).sendKeys("usermfid");
		driver.findElement(By.id("input-password")).sendKeys("UP11BZ5484");
		driver.findElement(By.id("login-btn_remove")).click();
	
		if(driver.getCurrentUrl().equalsIgnoreCase("https://192.168.2.163/mfid/login_showLogin.action#!"))
			System.out.println("Login Successfull !");
		
	    else { 
	      
	    	String alert = driver.findElement(By.id("alertBox")).getText();
			 System.out.println(alert);
			 driver.quit();
		        
		        System.out.println("Browser Closed Successfully !");
		
     }    
   
}}
				
				
				
				
				
	
