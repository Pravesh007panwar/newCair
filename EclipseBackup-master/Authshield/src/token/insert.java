package token;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import login.Authlogin;

public class insert extends Authlogin {
  @Test
  public void token() throws InterruptedException {
	  
	  driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	  
	  driver.findElement(By.linkText("Tokens")).click();
	    driver.findElement(By.linkText("Manage Tokens")).click();
	    driver.findElement(By.xpath(".//*[@id='tab_6']/span/div")).click();
	    driver.findElement(By.xpath(".//*[@id='block_insert_token']/div[2]/div/div[1]/label[1]")).click();
	    driver.findElement(By.name("inserTokenType")).click();
	    driver.findElement(By.id("insert_token_type_btn")).click();
	    driver.findElement(By.id("insert_file")).clear();
	    driver.findElement(By.id("insert_file")).sendKeys("D:\\Tokens\\HT25.encrypted");
	    driver.findElement(By.id("insert_file_btn")).click();
	   
	      
	    String acceptResult1=driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText();
	    
	    System.out.println("==== "+acceptResult1);
	    driver.findElement(By.id("closeBtn")).click();
	    driver.findElement(By.xpath(".//*[@id='block_insert_token']/div[2]/div/div[1]/label[2]")).click();
	    driver.findElement(By.id("insert_token_type_btn")).click();
	    driver.findElement(By.id("insert_file")).clear();
	    driver.findElement(By.id("insert_file")).sendKeys("D:\\Tokens\\MT100.encrypted");
	    driver.findElement(By.id("insert_file_btn")).click();
	    
	    String acceptResult=driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText();
	    System.out.println("==== "+acceptResult);
	    driver.findElement(By.id("closeBtn")).click();


	    driver.findElement(By.xpath(".//*[@id='block_insert_token']/div[2]/div/div[1]/label[3]")).click();
	    driver.findElement(By.id("insert_token_type_btn")).click();
	    driver.findElement(By.id("insert_file")).clear();
	    driver.findElement(By.id("insert_file")).sendKeys("D:\\Tokens\\biotoken.encrypted");
	    driver.findElement(By.id("insert_file_btn")).click();
	    
	    //WebDriverWait wait = new WebDriverWait(driver, 30);
	    //wait.until(ExpectedConditions.alertIsPresent());
	    
	    String acceptResult11=driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText();
	    System.out.println("==== "+acceptResult11);
	    driver.findElement(By.id("closeBtn")).click();

		Thread.sleep(3000);
	    driver.findElement(By.xpath(".//*[@id='block_insert_token']/div[2]/div/div[1]/label[4]")).click();
	    driver.findElement(By.id("insert_token_type_btn")).click();
	    driver.findElement(By.id("insert_file")).clear();
	    driver.findElement(By.id("insert_file")).sendKeys("D:\\Tokens\\PT100.encrypted");
	    driver.findElement(By.id("insert_file_btn")).click();
	    String acceptResult2=driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText();
	    System.out.println("==== "+acceptResult2);
	    driver.findElement(By.id("closeBtn")).click();
	    
	    }
  
  
  @AfterClass
  public void tearDown() throws Exception {
    driver.quit();
  }
  }

