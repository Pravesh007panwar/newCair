package manageuser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import login.Authlogin;

public class assignapp extends Authlogin {
	@Test
	public void assign() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.findElement(By.linkText("User")).click();
		driver.findElement(By.linkText("Manage User")).click();
		driver.findElement(By.cssSelector("a#tab_1")).click();
		Select WebElement = new Select(driver.findElement(By.id("assign_deassign")));
		WebElement.selectByVisibleText("Assign");
		Select Web = new Select(driver.findElement(By.id("application")));
		Web.selectByVisibleText("imap");
		Select id = new Select(driver.findElement(By.id("pageId_assign")));
		id.selectByValue("5000");
		driver.findElement(By.cssSelector("input#idcheckboxSelectAssignDeassign")).click();
		driver.findElement(By.id("submitbtn")).click();
		Thread.sleep(2000);
		String alert = driver.findElement(By.id("alertBox")).getText();
		System.out.println(alert);
		driver.findElement(By.id("closeBtn")).click();
		
	
		 

		int i = 1;
		do {
			
			System.out.println(i);
			i++;
			
			driver.findElement(By.xpath("//*[@id=\"footer\"]/div/span/i")).click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("input#idcheckboxSelectAssignDeassign")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("submitbtn")).click();
			Thread.sleep(3000);
			String alert3 = driver.findElement(By.id("alertBox")).getText();
			Thread.sleep(3000);
			System.out.println(alert3);
			Thread.sleep(3000);
			driver.findElement(By.id("closeBtn")).click();
			
		} while (i <= 2);
	} 
	
}
