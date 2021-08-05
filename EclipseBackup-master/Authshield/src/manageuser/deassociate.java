package manageuser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import login.Authlogin;

public class deassociate extends Authlogin {
  @Test
  public void Associate() throws InterruptedException {
	  
	  
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  
	  driver.findElement(By.linkText("User")).click();
	  driver.findElement(By.linkText("Manage User")).click();
	  
	  driver.findElement(By.linkText("Deassociate")).click();
	  
	 Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"block_active_deassociate\"]/div[2]/div/div[1]/label[3]")).click();
	  
	
	  driver.findElement(By.id("deassociate_btn")).click();
	 Select WebElement = new Select(driver.findElement(By.id("pageId_deassociate")));
	 WebElement.selectByValue("5000");
	 Select WebElement3 = new Select(driver.findElement(By.id("reasonId")));
	 WebElement3.selectByVisibleText("Token has been submitted as a free token");
	 
	 
	 driver.findElement(By.id("idcheckboxSelectDeassociateToken")).click();
	 driver.findElement(By.id("idSubmitButtonDeassociateToken")).click();
	 
	 System.out.println(driver.findElement(By.xpath("/html/body/div[6]/div/div/div[1]")).getText());
	 
	 driver.findElement(By.xpath("//button[@class='confirm btn btn-primary']")).click();
	 
	   String alert = driver.findElement(By.id("alertBox")).getText();
	   System.out.println(alert);
	    driver.findElement(By.id("closeBtn")).click();
	  driver.close();
	  
  }
  
}
