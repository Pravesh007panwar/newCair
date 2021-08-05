package manageuser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import login.Authlogin;

public class associate extends Authlogin {
  @Test
  public void Associate() throws InterruptedException {
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  driver.findElement(By.linkText("User")).click();
	  driver.findElement(By.linkText("Manage User")).click();
	  driver.findElement(By.linkText("Associate")).click();
	 Select WebElement = new Select(driver.findElement(By.id("associate_deassociate")));
	 WebElement.selectByVisibleText("Associate");
	 Thread.sleep(20000);
	 driver.findElement(By.xpath("//*[@id=\"auth\"]/label[4]")).click();
	 
	   
	
	 driver.findElement(By.cssSelector("input#associate_deassociate_btn")).click();
	 
	 Select page = new Select(driver.findElement(By.id("pageId_assRandom")));
	 page.selectByValue("5000");

	 Thread.sleep(10000);
	 
	
     driver.findElement(By.cssSelector("input#idcheckboxSelectAssociateRandom")).click();
     driver.findElement(By.id("idSubmitButtonAssociateRandom")).click();

	   String alert = driver.findElement(By.id("alertBox")).getText();
	   System.out.println("========Associate push Token");
	   System.out.println(alert);
	    driver.findElement(By.id("closeBtn")).click();
	   //driver.close();
	    
	    
	    int i=1;  
	    do{  
	        System.out.println(i);  
	    i++;  
	    Thread.sleep(5000);
	 driver.findElement(By.xpath("//*[@id=\"footer\"]/div/span/i")).click();
	 
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"associate_deassociate_btn\"]")).click();
	 Select page1 = new Select(driver.findElement(By.id("pageId_assRandom")));
	 page1.selectByValue("5000");

	 Thread.sleep(10000);
     driver.findElement(By.cssSelector("input#idcheckboxSelectAssociateRandom")).click();
     Thread.sleep(3000);
     driver.findElement(By.id("idSubmitButtonAssociateRandom")).click();
     Thread.sleep(3000);
	   String alert2 = driver.findElement(By.id("alertBox")).getText();
	   Thread.sleep(3000);
	   System.out.println("========Associate push Token");
	   Thread.sleep(3000);
	   System.out.println(alert2);
	   Thread.sleep(3000);
	    driver.findElement(By.id("closeBtn")).click();
	    }while(i<=43);  
	}  
	  
	  } 
	 
  
  

