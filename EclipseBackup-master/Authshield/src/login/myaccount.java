package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class myaccount extends Authlogin {
	

	

	
	@Test(priority=1)
    public void account() {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)	;
	
	driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
	driver.findElement(By.xpath("//a[@href='/mfid/admin_showMyAccount.action?a=admin']")).click();
	driver.findElement(By.id("firstName")).clear();
	driver.findElement(By.id("firstName")).sendKeys("Panwar");
	driver.findElement(By.id("lastName")).clear();
	driver.findElement(By.id("lastName")).sendKeys("prav");
	driver.findElement(By.id("mobile")).clear();
	driver.findElement(By.id("mobile")).sendKeys("9999628574");
	driver.findElement(By.id("email")).clear();
	driver.findElement(By.id("email")).sendKeys("pravesh.panwar@inenfu.com");
	driver.findElement(By.cssSelector("a.btn.btn-primary.pull-right")).click();
    System.out.println("Account changes" +driver.findElement(By.cssSelector("a#closeBtn")).getText());
	driver.findElement(By.cssSelector("a#closeBtn")).click();
	driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
	
	driver.findElement(By.xpath("//a[@href='/mfid/logout_logOut.action']")).click();
	driver.quit();
	
	
	
	
	
}
}