package manageAdministration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import login.Authlogin;

public class domain extends Authlogin {
  
  @Test
  
  public void addDomain() throws Exception {
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	  
     
      
   
    driver.findElement(By.linkText("Administration")).click();
   
    driver.findElement(By.linkText("Manage Admin")).click();

    driver.findElement(By.cssSelector("span > div")).click();
   
    driver.findElement(By.xpath(".//*[@id='tab_1']/span")).click();
   
    driver.findElement(By.xpath(".//*[@id='domain_tbl_new']")).click();
    driver.findElement(By.xpath(".//*[@id='domain_tbl']/tbody/tr/td[1]/input")).clear();
    driver.findElement(By.xpath(".//*[@id='domain_tbl']/tbody/tr/td[1]/input")).sendKeys("MFID");
   
    driver.findElement(By.xpath(".//*[@id='domain_tbl']/tbody/tr[1]/td[3]/a[1]")).click();
    
    Thread.sleep(3000);
    
    System.out.println("TC0001: ADD DOMAIN'");
    
    String acceptResult1 = driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText();
    System.out.println("==== "+acceptResult1);
    
    driver.findElement(By.id("closeBtn")).click();
    
    
    
    driver.findElement(By.xpath(".//*[@id='tab_1']/span")).click();
    
    driver.findElement(By.xpath(".//*[@id='domain_tbl_new']")).click();
    driver.findElement(By.xpath(".//*[@id='domain_tbl']/tbody/tr/td[1]/input")).clear();
    driver.findElement(By.xpath(".//*[@id='domain_tbl']/tbody/tr/td[1]/input")).sendKeys("Innefu");
   
    driver.findElement(By.xpath(".//*[@id='domain_tbl']/tbody/tr[1]/td[3]/a[1]")).click();
    
    Thread.sleep(3000);
    
    System.out.println("TC0001: ADD DOMAIN'");
    
    String acceptResult12 = driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText();
    System.out.println("==== "+acceptResult12);
    
    driver.findElement(By.id("closeBtn")).click();
    
     //**********Click on Edit button, enter updated domain name which you want to update and click on save button******//
    
   //driver.findElement(By.xpath(".//*[@id='domain_tbl_filter']/label/input")).sendKeys("MFID");
    Thread.sleep(1000);
    
    driver.findElement(By.cssSelector("a.edit")).click();
    driver.findElement(By.cssSelector("input.m-wrap.small")).clear();
    driver.findElement(By.cssSelector("input.m-wrap.small")).sendKeys("MFID_edit");
   
    driver.findElement(By.xpath(".//*[@id='domain_tbl']/tbody/tr/td[3]/a[1]")).click();
    Thread.sleep(3000);
    System.out.println("TC0002: EDIT DOMAIN'");
    
    String acceptResult11= driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText();
    System.out.println("==== "+acceptResult11);
    
    driver.findElement(By.id("closeBtn")).click();
    
    driver.findElement(By.xpath("//input[@type='text']")).click();
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("MFID_edit");
    driver.findElement(By.cssSelector("a.delete")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("button.confirm.btn.btn-primary")).click();
    
    System.out.println("==== Delete Domain");
    String accept= driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText();
    System.out.println("==== "+accept);
    
    driver.findElement(By.id("closeBtn")).click();
    
    
    
    
    //*********Click on delete button, domain which you want to delete*******//
    
    
    //*********Click on delete button, domain which you want to delete********//
    
    
    
    //*******On delete domain screen, click on "Cancel" button
    
    
    //*********Click on search button , enter valid domain name
    
    
    
    //*********Click on Add button, leave domain blank and click on submit button 
    
    
    //********Click on Add button, enter only numeric or special character in domain and ckick on submit button
    
    
    //******Click on Edit button, leave domain blank and click on submit button 
    
    //******Click on Edit button, enter only numeric or special character in domain and ckick on submit button
    
    
   
  }


  @AfterClass
  public void tearDown() throws Exception {
	 
    driver.quit();
   
  }
}


