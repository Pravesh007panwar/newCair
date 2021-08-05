package manageuser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import login.Authlogin;

public class deassignapp extends Authlogin {
  @Test
  public void assign() {
	  
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  driver.findElement(By.linkText("User")).click();
	  driver.findElement(By.linkText("Manage User")).click();
	  driver.findElement(By.cssSelector("a#tab_1")).click();
	 Select WebElement = new Select(driver.findElement(By.id("assign_deassign")));
	 WebElement.selectByVisibleText("Deassign");
	 Select Web = new Select(driver.findElement(By.id("application")));
	 Web.selectByVisibleText("Windows_Authentication");
	Select id = new Select(driver.findElement(By.id("pageId_assign")));
	id.selectByValue("5000");
	 driver.findElement(By.cssSelector("input#idcheckboxSelectAssignDeassign")).click();
	 driver.findElement(By.id("submitbtn")).click();
	   String alert1 = driver.findElement(By.id("alertBox")).getText();
	   System.out.println(alert1);
	    driver.findElement(By.cssSelector("a#closeBtn")).click();
	    driver.close();
	    
	  
  }
}
