package excelsearch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import login.Authlogin;

public class usersearch extends Authlogin {
	@Test
	public void search() {
		
	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	
	driver.findElement(By.linkText("User")).click();
	  driver.findElement(By.linkText("Manage User")).click();
	  driver.findElement(By.cssSelector("a#tab_1")).click();
	 Select WebElement = new Select(driver.findElement(By.id("assign_deassign")));
	 WebElement.selectByVisibleText("Assign");
	 Select Web = new Select(driver.findElement(By.id("application")));
	 Web.selectByVisibleText("Windows_Authentication");
	Select id = new Select(driver.findElement(By.id("pageId_assign")));
	id.selectByValue("5000");
	
	
		
		
	
	}

}
