package policy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import login.Authlogin;

public class addpolicy extends Authlogin{
	  
	  @Test
	  
	  public void AddAllPolicy() throws Exception {
		     
		    driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		  
	    
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.linkText("Policy")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Common Policy")).click();
	   
	    driver.findElement(By.id("sample_1_addNew")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("policyDesc")).clear();
	    
	    driver.findElement(By.id("policyDesc")).sendKeys("MyTesting");
	    
	    new Select(driver.findElement(By.id("reuseFlag"))).selectByVisibleText("No");
	    
	    new Select(driver.findElement(By.id("addTo"))).selectByVisibleText("Domain");
	    
	    driver.findElement(By.id("saveBtn")).click();
	    
	    Thread.sleep(1000);
	    System.out.println("TestCase: ADD COMMON POLICY");
	    Thread.sleep(5000);
	    String acceptResult1 = driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText();
		  
	    System.out.println("==== "+acceptResult1);
	    
	    driver.findElement(By.id("closeBtn")).click();


	    
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Offline Policy")).click();
	   
	    driver.findElement(By.id("sample_1_addNew")).click();
	  
	    driver.findElement(By.id("policyDesc")).sendKeys("MyTesting");
	    driver.findElement(By.id("numberOfDays")).clear();
	    driver.findElement(By.id("numberOfDays")).sendKeys("10");
	    new Select(driver.findElement(By.id("addTo"))).selectByVisibleText("Domain");
	    driver.findElement(By.id("saveBtn")).click();
	    String acceptResult11 = driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText();
		  
	    System.out.println("==== "+acceptResult11);
	    
	    driver.findElement(By.id("closeBtn")).click();
	    
	    driver.findElement(By.linkText("Emergency Policy")).click();
	    
	    driver.findElement(By.id("sample_1_addNew")).click();
	 
	    driver.findElement(By.id("policyDesc")).sendKeys("MyTesting");
	    driver.findElement(By.id("numberOfHours")).clear();
	    driver.findElement(By.id("numberOfHours")).sendKeys("10");
	    new Select(driver.findElement(By.id("addTo"))).selectByVisibleText("Domain");
	    driver.findElement(By.id("saveBtn")).click();
	    Thread.sleep(1000);
	    System.out.println("TestCase: ADD EMERGENCY POLICY");
	    String acceptResult111 = driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText();
	    System.out.println("==== "+acceptResult111);
	    driver.findElement(By.id("closeBtn")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Token Activation Policy")).click();
	    
	    driver.findElement(By.id("sample_1_addNew")).click();
	  
	    driver.findElement(By.id("policyDesc")).sendKeys("Mytesting");
	    driver.findElement(By.id("numberOfDays")).clear();
	    driver.findElement(By.id("numberOfDays")).sendKeys("10");
	    new Select(driver.findElement(By.id("addTo"))).selectByVisibleText("Domain");
	    driver.findElement(By.id("saveBtn")).click();
	    Thread.sleep(1000);
	    System.out.println("TestCase: ADD TOKEN ACTIVATION POLICY");
	    
	    String acceptResult1111 = driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText();
	    System.out.println("==== "+acceptResult1111);
	    driver.findElement(By.id("closeBtn")).click();
	    
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("LockoutAttempt Policy")).click();
	  
	    driver.findElement(By.id("sample_1_addNew")).click();

	    driver.findElement(By.id("policyDesc")).sendKeys("Mytesting");
	    driver.findElement(By.id("numberOfAttempts")).clear();
	    driver.findElement(By.id("numberOfAttempts")).sendKeys("10");
	    driver.findElement(By.id("durationOfLock")).clear();
	    driver.findElement(By.id("durationOfLock")).sendKeys("1");
	    new Select(driver.findElement(By.id("addTo"))).selectByVisibleText("Application");
	    new Select(driver.findElement(By.id("domain"))).selectByVisibleText("default_domain");
	    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	    driver.findElement(By.xpath("//input[@value='0']")).click();
	    driver.findElement(By.id("policyAddForm")).click();
	    driver.findElement(By.id("saveBtn")).click();
	    Thread.sleep(1000);
	    System.out.println("TestCase: ADD LOCKOUTATTEMPT POLICY");
	    String acceptResult11111 = driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText();
	    System.out.println("==== "+acceptResult11111);
	    driver.findElement(By.id("closeBtn")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.linkText("Network Time Policy")).click();
	   
	    driver.findElement(By.id("sample_1_addNew")).click();
	    driver.findElement(By.id("policyDesc")).clear();
	    driver.findElement(By.id("policyDesc")).sendKeys("MyTesting");
	    driver.findElement(By.cssSelector("#lblNttime > span > #uniform-undefined > span")).click();
	    driver.findElement(By.cssSelector("#lblNttime > span > #uniform-undefined > span > input[name=\"ntp_radio\"]")).click();
	    new Select(driver.findElement(By.xpath("//*[@id=\"lblNttime\"]/span/div/span"))).selectByVisibleText("IP Time Range");
	    driver.findElement(By.id("ipRange1")).clear();
	    driver.findElement(By.id("ipRange1")).sendKeys("192.168.1.1");
	    
	    driver.findElement(By.id("ipRange2")).clear();
	    driver.findElement(By.id("ipRange2")).sendKeys("192.168.1.200");
	    driver.findElement(By.xpath(".//*[@id='dateIP1']")).sendKeys("2016-05-26");
	    driver.findElement(By.xpath(".//*[@id='dateIP2']")).sendKeys("2016-05-30");
	    driver.findElement(By.xpath(".//*[@id='timeIP1']")).sendKeys("9:30 AM");
	    driver.findElement(By.xpath(".//*[@id='timeIP2']")).sendKeys("7:00 PM");
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("(//input[@name='ip_radio'])[3]")).click();
	    
	    new Select(driver.findElement(By.id("addTo"))).selectByVisibleText("Domain");
	    driver.findElement(By.id("saveBtn")).click();
	    System.out.println("TestCase: ADD NETWORKTIME POLICY");
	    String acceptResult11113 = driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText();
	    System.out.println("==== "+acceptResult11113);
	    driver.findElement(By.id("closeBtn")).click();
		
	    //**************FOR DENYY*************************
	    
	    driver.findElement(By.linkText("Network Time Policy")).click();
		   
	    driver.findElement(By.id("sample_1_addNew")).click();
	    driver.findElement(By.id("policyDesc")).clear();
	    driver.findElement(By.id("policyDesc")).sendKeys("MyTesting1");
	    driver.findElement(By.cssSelector("#lblNttime > span > #uniform-undefined > span")).click();
	    driver.findElement(By.cssSelector("#lblNttime > span > #uniform-undefined > span > input[name=\"ntp_radio\"]")).click();
	    new Select(driver.findElement(By.id("addNTRange"))).selectByVisibleText("IP Time Range");
	    driver.findElement(By.id("ipRange1")).clear();
	    driver.findElement(By.id("ipRange1")).sendKeys("192.168.2.12");
	    driver.findElement(By.id("ipRange2")).clear();
	    driver.findElement(By.id("ipRange2")).sendKeys("192.168.2.200");
	    driver.findElement(By.xpath(".//*[@id='dateIP1']")).sendKeys("2016-05-26");
	    driver.findElement(By.xpath(".//*[@id='dateIP2']")).sendKeys("2016-05-30");
	    driver.findElement(By.xpath(".//*[@id='timeIP1']")).sendKeys("9:30 AM");
	    driver.findElement(By.xpath(".//*[@id='timeIP2']")).sendKeys("7:00 PM");
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath(".//*[@id='main-div']/div[4]/label[2]")).click();
	    
	    new Select(driver.findElement(By.id("addTo"))).selectByVisibleText("Domain");
	    driver.findElement(By.id("saveBtn")).click();
	    System.out.println("TestCase: ADD NETWORKTIME POLICY");
	    String acceptResult111111 = driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText();
	    System.out.println("==== "+acceptResult111111);
	    driver.findElement(By.id("closeBtn")).click();
	    
	    //*********IP FOR PROMPT*************
	    driver.findElement(By.linkText("Network Time Policy")).click();
		   
	    driver.findElement(By.id("sample_1_addNew")).click();
	    driver.findElement(By.id("policyDesc")).clear();
	    driver.findElement(By.id("policyDesc")).sendKeys("MyTesting3");
	    driver.findElement(By.cssSelector("#lblNttime > span > #uniform-undefined > span")).click();
	    driver.findElement(By.cssSelector("#lblNttime > span > #uniform-undefined > span > input[name=\"ntp_radio\"]")).click();
	    new Select(driver.findElement(By.id("addNTRange"))).selectByVisibleText("IP Time Range");
	    driver.findElement(By.id("ipRange1")).clear();
	    driver.findElement(By.id("ipRange1")).sendKeys("192.168.1.12");
	    driver.findElement(By.id("ipRange2")).clear();
	    driver.findElement(By.id("ipRange2")).sendKeys("192.168.1.220");
	    driver.findElement(By.xpath(".//*[@id='dateIP1']")).sendKeys("2016-05-26");
	    driver.findElement(By.xpath(".//*[@id='dateIP2']")).sendKeys("2016-05-30");
	    driver.findElement(By.xpath(".//*[@id='timeIP1']")).sendKeys("9:30 AM");
	    driver.findElement(By.xpath(".//*[@id='timeIP2']")).sendKeys("7:00 PM");
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath(".//*[@id='main-div']/div[4]/label[3]")).click();
	    
	    new Select(driver.findElement(By.id("addTo"))).selectByVisibleText("Domain");
	    driver.findElement(By.id("saveBtn")).click();
	    System.out.println("TestCase: ADD NETWORKTIME POLICY");
	    String acceptResult1111111 = driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText();
	    System.out.println("==== "+acceptResult1111111);
	    driver.findElement(By.id("closeBtn")).click();
		
		
		
	  
	  }
    }

	  
	  
	  
	 
	 