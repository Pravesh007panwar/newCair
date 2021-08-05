package administrator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import login.Authlogin;

public class LDAPADUserSearch extends Authlogin {
  @Test
  public void f() throws InterruptedException {
	  
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  
	    driver.findElement(By.linkText("Administration")).click();
	    driver.findElement(By.linkText("LDAP / AD User Search")).click();
	   
	    driver.findElement(By.cssSelector("input#userLoginID")).clear();
	    driver.findElement(By.cssSelector("input#userLoginID")).sendKeys("s2");
	    driver.findElement(By.cssSelector("button#updateTemplateButtonId")).click();
	   Select size = new Select(driver.findElement(By.xpath("//*[@id=\"sample_1_1_length\"]/label/select")));
	   size.selectByValue("5000");
	   
	   //driver.findElement(By.cssSelector("//*[@id=\"sample_1_1_filter\"]/label/input")).sendKeys("covid");
	   driver.close();
  }
}
