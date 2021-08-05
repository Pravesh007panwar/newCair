package administrator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import login.Authlogin;

public class manageRadius extends Authlogin {
@Test
	public void  Radius() throws InterruptedException {
		
		
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		  
	    driver.findElement(By.linkText("Administration")).click();
	    driver.findElement(By.linkText("Manage Radius")).click();
	    driver.findElement(By.xpath("//*[@id=\"tab_1\"]/span/div")).click();
	    driver.findElement(By.cssSelector("button#radiud_ip_table_new")).click();
	    driver.findElement(By.cssSelector("input#radiusIP")).sendKeys("192.168.2.167");
	    driver.findElement(By.cssSelector("input#secretkey")).sendKeys("testing");
	    driver.findElement(By.cssSelector("input#applId")).sendKeys("0");
	    
	    Select source = new Select(driver.findElement(By.id("sourceType")));
	   source.selectByVisibleText("Active Directory");
	   
	  
	    driver.findElement(By.cssSelector("input#sourceURL")).sendKeys("192.168.2.159:3268");
	    driver.findElement(By.cssSelector("input#domain")).sendKeys("innefu.com");
	    driver.findElement(By.cssSelector("input#adfsUrl")).sendKeys("192.168.2.159:3268");
	    driver.findElement(By.xpath("//*[@id=\"radiud_ip_table_add\"]")).click();
	    
	    String acceptResult1=driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText();
	    System.out.println("Manage Radius");
	    System.out.println("==== "+acceptResult1);
	    driver.findElement(By.id("closeBtn")).click();
	    
	    
	    driver.findElement(By.cssSelector("i.icon-arrow-up")).click();
	    driver.findElement(By.xpath("//*[@id=\"radiud_ip_table_filter\"]/label/input")).clear();
	    driver.findElement(By.xpath("//*[@id=\"radiud_ip_table_filter\"]/label/input")).sendKeys("192.168.2.168");
	    driver.findElement(By.xpath("//*[@id=\"radiud_ip_table\"]/tbody/tr/td[10]/a[1]")).click();
	 driver.findElement(By.xpath("//*[@id=\"radiud_ip_table\"]/tbody/tr/td[2]/input")).clear();
	 driver.findElement(By.xpath("//*[@id=\"radiud_ip_table\"]/tbody/tr/td[2]/input")).sendKeys("192.168.2.168");
	 driver.findElement(By.xpath("//*[@id=\"radiud_ip_table\"]/tbody/tr/td[10]/a[1]")).click();
	    
	    
	    String acceptResult61=driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText();
	    System.out.println("Edit Manage Radius");
	    System.out.println("==== "+acceptResult61);
	    driver.findElement(By.id("closeBtn")).click();
	    Thread.sleep(3000);
	    
	   
	    
	    driver.findElement(By.xpath("//*[@id=\"radiud_ip_table\"]/tbody/tr/td[10]/a[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("button.confirm.btn.btn-primary")).click();
	    String acceptResult611=driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText();
	    System.out.println("Delete Manage Radius");
	    System.out.println("==== "+acceptResult611);
	    driver.findElement(By.id("closeBtn")).click();
	    
	    
	    
	   
	//}
	// @AfterClass
	  //public void tearDown() throws Exception {
	  //driver.quit();
	    
	  	
	  }
	}

