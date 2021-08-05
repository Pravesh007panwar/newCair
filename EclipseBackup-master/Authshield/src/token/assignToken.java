package token;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import login.Authlogin;

public class assignToken extends Authlogin {
	
	
	@Test
	public void assign() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		  
		  driver.findElement(By.linkText("Tokens")).click();
		  driver.findElement(By.linkText("Manage Tokens")).click();
		driver.findElement(By.cssSelector("a#tab_1")).click();
		driver.findElement(By.xpath("//*[@id=\"block_assign_token\"]/div[2]/div/div[1]/label[1]/div/span")).click();
		
		Select domain =new Select(driver.findElement(By.cssSelector("select#domain_id")));
		domain.selectByVisibleText("mfid");
		
		Select domain2 =new Select(driver.findElement(By.cssSelector("select#assign_deassign")));
		domain2.selectByVisibleText("Assign");
		
		driver.findElement(By.cssSelector("input#assignToken_btn")).click();
		
		Select page =new Select(driver.findElement(By.cssSelector("select#pageId_assTokenDoamin")));
		page.selectByValue("5000");
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#checkBoxAssignAndDeassignToken")).click();
		
		driver.findElement(By.cssSelector("button#submitForAssignToken")).click();
		
		System.out.println("**Hard Token Assign**");
		try {
		String alert = driver.findElement(By.id("alertBox")).getText();
		System.out.println(alert);
		
		driver.findElement(By.id("closeBtn")).click();
		} catch (Exception e) {
			driver.navigate().refresh();
			
			}
	
		//************ Deassign Hard Token*************************
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        
	

       driver.findElement(By.xpath("//*[@id=\"block_assign_token\"]/div[2]/div/div[1]/label[1]/div/span")).click();
		
		Select mobile =new Select(driver.findElement(By.cssSelector("select#domain_id")));
		mobile.selectByVisibleText("mfid");
		
		Select mobile1 =new Select(driver.findElement(By.cssSelector("select#assign_deassign")));
		mobile1.selectByVisibleText("Deassign");
		
		driver.findElement(By.cssSelector("input#assignToken_btn")).click();
		
		Select page1 =new Select(driver.findElement(By.cssSelector("select#pageId_assTokenDoamin")));
		page1.selectByValue("5000");
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input#checkBoxAssignAndDeassignToken")).click();
		
		driver.findElement(By.cssSelector("button#submitForAssignToken")).click();
		System.out.println("** Deassign Hard Token**");
		System.out.println("====Hard Token Assign");
		String alert1 = driver.findElement(By.id("alertBox")).getText();
		System.out.println(alert1);
		
		driver.findElement(By.id("closeBtn")).click();
		
		
		
	}
	

}