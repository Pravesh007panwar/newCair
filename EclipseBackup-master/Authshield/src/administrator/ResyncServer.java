package administrator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import login.Authlogin;

public class ResyncServer extends Authlogin {
  @Test
  public void ResyncServer1() {
	  
	  driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	  
	    driver.findElement(By.linkText("Administration")).click();
	    driver.findElement(By.linkText("Resync Server")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"resync_model1\"]")).click();
	    
	   System.out.println(driver.switchTo().alert().getText());
	    driver.switchTo().alert().accept();
	    
	    
	  
	  
  }
}
