package manageAdministration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import login.Authlogin;

public class Application extends Authlogin {
	
 
	  @Test(priority=1)
	  
	      public void addApplication() throws InterruptedException {
		   
		    driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		    
    driver.findElement(By.linkText("Administration")).click();
   
    driver.findElement(By.linkText("Manage Admin")).click();

    driver.findElement(By.cssSelector("span > div")).click();
   
    driver.findElement(By.xpath(".//*[@id='tab_2']/span/div")).click();
   
    new Select(driver.findElement(By.xpath(" .//*[@id='selectedDomain']"))).selectByVisibleText("default_domain");
   
    driver.findElement(By.xpath(".//*[@id='application_tbl_new']")).click();
    driver.findElement(By.xpath(".//*[@id='editApp']")).clear();
    driver.findElement(By.xpath(".//*[@id='editApp']")).sendKeys("Innefu");
   
    driver.findElement(By.xpath(".//*[@id='application_tbl']/tbody/tr[1]/td[3]/a[1]")).click();
    
    
    String acceptResult1 = driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText();
    System.out.println(" TC0001,TC0002,TC0003,TC0004: ADD APPLICATION");
    System.out.println("==== "+acceptResult1);
    
    driver.findElement(By.id("closeBtn")).click();
	
	//********Edit new application name and click on submit button
	   driver.findElement(By.xpath(".//*[@id='application_tbl_new']")).click();
	   
	    driver.findElement(By.xpath(".//*[@id='application_tbl_filter']/label/input")).clear();
	    driver.findElement(By.xpath(".//*[@id='application_tbl_filter']/label/input")).sendKeys("Innefu");
	    driver.findElement(By.xpath(".//*[@id='application_tbl']/tbody/tr/td[3]/a[1]")).click();
	    
	    driver.findElement(By.id("editApp")).clear();
	
	    driver.findElement(By.id("editApp")).sendKeys("Innefu_EDIT");
	   
	    driver.findElement(By.xpath(".//*[@id='application_tbl']/tbody/tr[1]/td[3]/a[1]")).click();
	    System.out.println(" TC0005: EDIT APPLICATION");
	    String acceptResult11 = driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText();
	  
	    System.out.println("==== "+acceptResult11);
	    
	    driver.findElement(By.id("closeBtn")).click();
		
	//*******Click on delete button
		
	   
		
		
	//******Click on delete button and select "Ok"
		driver.findElement(By.xpath(".//*[@id='application_tbl_filter']/label/input")).clear();
	    driver.findElement(By.xpath(".//*[@id='application_tbl_filter']/label/input")).sendKeys("Innefu");
	    driver.findElement(By.xpath(".//*[@id='application_tbl']/tbody/tr/td[3]/a[2]")).click();
	    driver.findElement(By.xpath("html/body/div[5]/div/div/div[2]/button[1]")).click();
	   
	    System.out.println(" TC0007: DELETE APPLICATION");
	    String acceptResult1111 = driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText();
		  
	    System.out.println("==== "+acceptResult1111);
	    
	    driver.findElement(By.id("closeBtn")).click();
		
	/*//**********Click on delete button and select "Cancel"
		driver.findElement(By.xpath(".//*[@id='application_tbl_filter']/label/input")).clear();
	    driver.findElement(By.xpath(".//*[@id='application_tbl_filter']/label/input")).sendKeys("Innefu");
	    driver.findElement(By.xpath(".//*[@id='application_tbl']/tbody/tr/td[3]/a[2]")).click();
	    
	    System.out.println("TC0008: Click on delete button and select Cancel");
	    String acceptResult1112 = driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText();
		  
	    System.out.println("==== "+acceptResult1112);
	    
	    driver.findElement(By.id("closeBtn")).click();
		
	//******Click on ADD button and select "Cancel"
		driver.findElement(By.xpath(".//*[@id='application_tbl_new']")).click();
	    driver.findElement(By.xpath(".//*[@id='editApp']")).clear();
	    driver.findElement(By.xpath(".//*[@id='editApp']")).sendKeys("Innefu");
	   
	    driver.findElement(By.xpath(".//*[@id='application_tbl']/tbody/tr/td[3]/a[2]")).click();
	    
	    System.out.println("TC0009:Click on ADD button and select Cancel");
	   
	  
	    String acceptResult11111 = driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText();
		  
	    System.out.println("==== "+acceptResult11111);
	    
	    driver.findElement(By.id("closeBtn")).click();*/
	 
	 
	 
  }
  

  

}