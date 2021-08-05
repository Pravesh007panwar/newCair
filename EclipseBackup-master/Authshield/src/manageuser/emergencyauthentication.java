package manageuser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import login.Authlogin;

public class emergencyauthentication  extends Authlogin {
	
  @Test
  public void EA() throws InterruptedException {
	  
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  driver.findElement(By.linkText("User")).click();
	  driver.findElement(By.linkText("Manage User")).click();
	    driver.findElement(By.linkText("Emergency Authentication")).click(); 
	    
	    Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"uniform-undefined\"]/span/div/span")).click();
	  driver.findElement(By.id("emergency_btn")).click();
	  Select webelement = new Select(driver.findElement(By.id("pageId_emergencyauth")));
	  webelement.selectByValue("5000");
	  
	  Select webelement1 = new Select(driver.findElement(By.id("id1")));
	  webelement1.selectByVisibleText("Both");
	  driver.findElement(By.id("idcheckboxSelectEmergencyAuth")).click();
	  driver.findElement(By.id("idSubmitButtonEmergencyAuth")).click();
	  Thread.sleep(5000);
	  System.out.println(driver.findElement(By.xpath("/html/body/div[6]/div/div/div[1]")).getText());
		 driver.findElement(By.xpath("//button[@class='confirm btn btn-primary']")).click();
		   String alert = driver.findElement(By.id("alertBox")).getText();
		   System.out.println(alert);
		    driver.findElement(By.id("closeBtn")).click();
		  driver.close();
  }
}
