package manageAdministration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import login.Authlogin;

public class Syncuser extends Authlogin {
	
  @Test
  
  public void sync() {
	  
	  
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  
	  driver.findElement(By.linkText("Administration")).click();
	  driver.findElement(By.linkText("Manage Admin")).click();
	  driver.findElement(By.cssSelector("a#tab_6")).click();
	  
	  driver.findElement(By.xpath("//*[@id=\"userSync_data\"]/div[4]/button")).click();
	  
	 String alert = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]")).getText();
	 System.out.println(alert);
	 
	 driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/button[1]")).click();
	 String alert222 = driver.findElement(By.id("alertBox")).getText();
	 System.out.println(alert222);
	 
	 driver.findElement(By.id("closeBtn")).click();
	 driver.close();
	  
  }
}
