package administrator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import login.Authlogin;

public class UserDeviceDetails extends Authlogin {
  @Test
  public void UserDeviceDetailsmodule() throws InterruptedException {
	  
	  
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  
	    driver.findElement(By.linkText("Administration")).click();
	    driver.findElement(By.linkText("User Device Details")).click();
	    
	    
	    Select appid =new Select(driver.findElement(By.cssSelector("select#userAppId")));
	    appid.selectByVisibleText("Windows");
	    driver.findElement(By.cssSelector("input#userLoginID")).clear();
	    driver.findElement(By.cssSelector("input#userLoginID")).sendKeys("s2");
	    
	    driver.findElement(By.cssSelector("button#updateTemplateButtonId")).click();
	    
	    driver.findElement(By.cssSelector("input.shadow_radio")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//*[@id=\"block_show_User_Search_Data\"]/button[1]")).click();
	    
	    System.out.println("Assign Country");
	    
	    driver.findElement(By.cssSelector("a.icon-chevron-down")).click();
	    
	    driver.findElement(By.cssSelector("input.checkboxes4")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("sample_editable_1_multi_delete")).click();
	    Thread.sleep(3000);
	    System.out.print(driver.findElement(By.xpath("/html/body/div[9]/div/div/div[1]")).getText());
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/button[1]")).click();
	    
	    String acceptResult1=driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText();
	    System.out.println("Delete Only One Country ");
	    System.out.println("==== "+acceptResult1);
	    driver.findElement(By.id("closeBtn")).click();
	    
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("button#sample_1_addNew")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"policyAddForm\"]/div[1]/div/div/button")).click();
	    driver.findElement(By.xpath("//*[@id=\"policyAddForm\"]/div[1]/div/div/ul/li[1]/div/input")).sendKeys("China");
	    driver.findElement(By.xpath("//*[@id=\"policyAddForm\"]/div[1]/div/div/ul/li[2]/a/label/input")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input#myInput")).click();
	    driver.findElement(By.cssSelector("button#http://192.168.2.240/mfid/login_showLogin.action")).click();
	    
	    String acceptResult11=driver.findElement(By.xpath("//*[@id='alertBox']/p")).getText();
	    System.out.println("Add Country Policy");
	    System.out.println("==== "+acceptResult11);
	    driver.findElement(By.id("closeBtn")).click();
	    
	   
	}
	  @AfterClass
	  public void tearDown() throws Exception {
	    driver.quit();
	   
	  
  }
}
