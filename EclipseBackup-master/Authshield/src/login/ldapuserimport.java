package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ldapuserimport extends Authlogin {
	
	
  @Test(priority=1)
  
  public void ldapimp() {
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  driver.findElement(By.cssSelector("a.icon-btn.span2")).click();
	  
	  driver.findElement(By.id("tab_1")).click();
	  
	  Select imp =new Select(driver.findElement(By.id("importSource")));
	  
			imp.selectByVisibleText("LDAP Data Source");
	
			driver.findElement(By.cssSelector("input#domain")).clear();
			
			 driver.findElement(By.id("domain")).sendKeys("192.168.2.210:389");
			 driver.findElement(By.id("principle")).clear();
			 driver.findElement(By.id("principle")).sendKeys("uid=zimbra,cn=admins,cn=zimbra");
			driver.findElement(By.id("basedn")).clear();
			//driver.findElement(By.id("basedn")).sendKeys("");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("redhat@123");
			//driver.findElement(By.id("ou")).clear();
			//driver.findElement(By.id("ou")).sendKeys("dfdf");
			//driver.findElement(By.id("filter")).clear();
			//driver.findElement(By.id("filter")).sendKeys("(mail=elk2@nic.in)");
			driver.findElement(By.id("attributes")).clear();
			driver.findElement(By.id("attributes")).sendKeys("UserLogonId:uid,FirstName:givenName,LastName:sn,Mobile:mobile,Mail:mail");
			driver.findElement(By.id("tad_btn_1")).click();
			
			
			//WebDriverWait wait =new WebDriverWait(driver, );
			 //if (wait.until(ExpectedConditions.alertIsPresent())==null)
			
				 driver.findElement(By.cssSelector("//*[@id=\"header\"]/div/div/div[2]/div/div[2]/ul/li/a")).click();
			 
				
//			/ else {
					
					//driver.findElement(By.id("alertBox")).getText();
					//driver.findElement(By.id("closeBtn")).click();
					
				
				
			
			}	
			
  }
  
