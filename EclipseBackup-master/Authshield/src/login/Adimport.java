package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Adimport extends Authlogin {
	
	
  @Test(priority=1)
  
  public void ldapimp() throws InterruptedException {
	  
	  driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	  
	  driver.findElement(By.cssSelector("a.icon-btn.span2")).click();
	  
	  driver.findElement(By.id("tab_1")).click();
	  
	  Select imp =new Select(driver.findElement(By.id("importSource")));
	  
			imp.selectByVisibleText("Active Directory");
	
			driver.findElement(By.cssSelector("input#domain")).clear();
			
			 driver.findElement(By.id("domain")).sendKeys("192.168.2.159:389");
			 driver.findElement(By.id("principle")).clear();
			 driver.findElement(By.id("principle")).sendKeys("administrator@innefu.com");
			 driver.findElement(By.id("basedn")).clear();
			driver.findElement(By.id("basedn")).sendKeys("dc=innefu,dc=com");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("sdVi@$%Sv1358");
			//driver.findElement(By.id("ou")).clear();
			//driver.findElement(By.id("ou")).sendKeys("dfdf");
			driver.findElement(By.id("filter")).clear();
			//driver.findElement(By.id("filter")).sendKeys("");
			//driver.findElement(By.id("attributes")).clear();
			//driver.findElement(By.id("attributes")).sendKeys("UserLogonId:uid,FirstName:givenName,LastName:sn,Mobile:mobile,Mail:mail");
			driver.findElement(By.id("tad_btn_1")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"import_user_tab\"]/div[1]/a/button/b")).click();
			
			Thread.sleep(3000);
			
					
			 String alert = driver.findElement(By.id("alertBox")).getText();
			 System.out.println(alert);
			 
			 driver.findElement(By.id("closeBtn")).click();
			 driver.close();
			  
				
				
			
			}	
			
  }
  
