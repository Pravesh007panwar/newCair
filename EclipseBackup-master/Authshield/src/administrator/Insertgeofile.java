package administrator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import login.Authlogin;

public class Insertgeofile extends Authlogin {

		
	  @Test
	  
	  public void InsertGeoFile() throws Exception {
		 driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
  
    driver.findElement(By.linkText("Administration")).click();
    driver.findElement(By.linkText("Insert Geo File")).click();
    
    driver.findElement(By.id("geoFile")).clear();
    driver.findElement(By.id("geoFile")).sendKeys("D:\\MFID_CLIENTS\\citius\\New_latest_build_after_migration\\mfid\\db\\geoipv4.zip");
    driver.findElement(By.id("insert_geo_file")).click();
   
    
    String acceptResult=driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText();
    System.out.println("Insert GEO file IPV4");
    System.out.println("==== "+acceptResult);
    driver.findElement(By.id("closeBtn")).click();
    
    
	
	 driver.findElement(By.id("geoFile")).clear();
	 driver.findElement(By.id("geoFile")).sendKeys("D:\\MFID_CLIENTS\\citius\\New_latest_build_after_migration\\mfid\\db\\geoipv6.zip");
	 driver.findElement(By.id("insert_geo_file")).click();
	 
	 String acceptResult1=driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText(); 
	 System.out.println("Insert GEO file IPV6");
	  System.out.println("==== "+acceptResult1);
	 driver.findElement(By.id("closeBtn")).click();
	 
}
  @AfterClass
  public void tearDown() throws Exception {
    driver.quit();
    
  	}
  }