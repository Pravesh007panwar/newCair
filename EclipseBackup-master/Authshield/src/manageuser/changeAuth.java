package manageuser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import login.Authlogin;

public class changeAuth extends Authlogin {
	
  @Test
  public void changeauth() throws InterruptedException {
	  

	  
	  driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	  driver.findElement(By.linkText("User")).click();
	  driver.findElement(By.linkText("Manage User")).click();
	  driver.findElement(By.cssSelector("a#tab_2")).click();
	  Select id = new Select(driver.findElement(By.id("pageId_changeauth")));
		id.selectByValue("5000");
		 	     
		Thread.sleep(35000);
	   
	
		driver.findElement(By.xpath("//*[@id=\"sample_2\"]/thead/tr[2]/th[8]/input")).click();
		driver.findElement(By.xpath(".//*[@id='idSubmitButtonChangeAuth']")).click();
		System.out.println(driver.findElement(By.xpath("/html/body/div[6]/div/div/div[1]")).getText());
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button.confirm.btn.btn-primary")).click();
		System.out.println("Push Token Change Auth");
		Thread.sleep(30000);
		 System.out.println(driver.findElement(By.id("alertBox")).getText());
		 driver.findElement(By.id("closeBtn")).click();
		 
		 for (int i=267; i<100;i++) {
			 System.out.println(i);
			 
			
	    int myint = i;
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"footer\"]/div/span/i")).click();
		 Thread.sleep(13000);
		 
		 driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/div/input")).clear();
		 Thread.sleep(3000); 
		 //driver.findElement(By.xpath("//*[@id=\"closeBtn\"]")).click();
		 driver.findElement(By.id("pageNum_changeauth")).sendKeys(String.valueOf(myint++));
		
		 	
		 driver.findElement(By.cssSelector("input#pageNum_changeauth")).sendKeys(Keys.ENTER);
		 Thread.sleep(20000);
		 //driver.findElement(By.xpath("//*[@id=\"footer\"]/div/span/i")).click();
		
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"sample_2\"]/thead/tr[2]/th[8]/input")).click();
		 Thread.sleep(3000);
		 //driver.findElement(By.xpath("//*[@id=\"idcheckboxSelectChangeAuth\"]")).click();
		
	     Thread.sleep(13000);
			driver.findElement(By.xpath(".//*[@id='idSubmitButtonChangeAuth']")).click();
			Thread.sleep(13000);
			System.out.println(driver.findElement(By.xpath("/html/body/div[6]/div/div/div[1]")).getText());
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("button.confirm.btn.btn-primary")).click();
			System.out.println("Push Token Change Auth");
			Thread.sleep(20000);
			 System.out.println(driver.findElement(By.id("alertBox")).getText());
			 driver.findElement(By.id("closeBtn")).click();
		 }
  }
}
