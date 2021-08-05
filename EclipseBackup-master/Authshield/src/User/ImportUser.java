package User;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import login.Authlogin;

public class ImportUser extends Authlogin {
  @Test
  public void importuser() {
	  
driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
driver.findElement(By.linkText("User")).click();
driver.findElement(By.linkText("Import Data")).click();
driver.findElement(By.xpath("//*[@id=\"tab_3\"]/span/div")).click();
driver.findElement(By.id("tab_3_imp_csv")).clear();
driver.findElement(By.id("tab_3_imp_csv")).sendKeys("D:\\Tokens\\deny_by_country_report.csv");

			driver.findElement(By.cssSelector("button#tab_3_btn1")).click();
			
			Select csv = new Select(driver.findElement(By.id("csv_userId")));
			csv.selectByVisibleText("USERID");
			
			Select csv1 = new Select(driver.findElement(By.id("csv_firstName")));
			csv1.selectByVisibleText("Firstname");
			
			Select csv2 = new Select(driver.findElement(By.id("csv_middleName")));
			csv2.selectByVisibleText("Middlename");
			
			Select csv3 = new Select(driver.findElement(By.id("csv_lastName")));
			csv3.selectByVisibleText("lastname");
			
			Select csv23 = new Select(driver.findElement(By.id("csv_email")));
			csv23.selectByVisibleText("emailid");
			
			
			Select csv31 = new Select(driver.findElement(By.id("csv_mobile")));
			csv31.selectByVisibleText("pno");
			
			driver.findElement(By.cssSelector("button#tab_3_btn_2")).click();
			
			 System.out.println(driver.findElement(By.cssSelector("a.accordion-toggle.collapsed")).getText());
			 String alert = driver.findElement(By.id("alertBox")).getText();
			 System.out.println(alert);
			 
			 driver.findElement(By.id("closeBtn")).click();
			 driver.close();
	  
  }
}
