package administrator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import login.Authlogin;

public class MailTemplates extends  Authlogin {
	
  @Test
  
        public void mailTemplates() throws Exception {
	  
	    
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Administration")).click();
       
        driver.findElement(By.linkText("Mail Template")).click();
        
        new Select(driver.findElement(By.xpath(".//*[@id='mailTemplateTypeId']"))).selectByVisibleText("ASSIGN_APPLICATION_MAIL");
       
        driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).clear();
       
        driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).sendKeys("Dear\r\n" + 
       "{FIRSTNAME}   <br/> {LASTNAME}<br/>{USERLOGONID}<br/>{MOBILENUMBER}<br/>{EMAILID}<br/>{PASSWORD}<br/>{DOMAINID}<br/>{DOMAINNAME}<br/>{APPLICATIONID}<br/>{APPLICATIONNAME}<br/>{MFIDURL}<br/>{USERURL}<br/>{MAILATTACHMENTFILE1}<br/>{MOBILEAPIPATH}<br/>{IOSAPIPATH}<br/>{WINDOWSAPIPATH}<br/>{BLACKBERRYAPIPATH}<br/><br/>{DESKTOPWIN64APIPATH}<br/>{QRHOST}<br/>{QRPORT}<br/>");
       
        driver.findElement(By.xpath(".//*[@id='updateTemplateButtonId']")).click();
       
        System.out.println("TC001:ASSIGN_APPLICATION_MAIL");
        Alert alert=driver.switchTo().alert();
    	System.out.println(alert.getText());
    	alert.accept();
    	
//**********************SMS_MAIL Tags**************//	
          
          new Select(driver.findElement(By.xpath(".//*[@id='mailTemplateTypeId']"))).selectByVisibleText("SMS_MAIL");
          
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).clear();
     
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).sendKeys("Dear\r\n" + 
         "{FIRSTNAME}   <br/> {LASTNAME}<br/>{USERLOGONID}<br/>{MOBILENUMBER}<br/>{EMAILID}<br/>{PASSWORD}<br/>{DOMAINID}<br/>{DOMAINNAME}<br/>{APPLICATIONID}<br/>{APPLICATIONNAME}<br/>{MFIDURL}<br/>{USERURL}<br/>{MAILATTACHMENTFILE1}<br/>{MOBILEAPIPATH}<br/>{IOSAPIPATH}<br/>{WINDOWSAPIPATH}<br/>{BLACKBERRYAPIPATH}<br/><br/>{DESKTOPWIN64APIPATH}<br/>{QRHOST}<br/>{QRPORT}<br/>");
         
          driver.findElement(By.xpath(".//*[@id='updateTemplateButtonId']")).click();
        
          System.out.println("TC002:SMS_MAIL");
          Alert alert2=driver.switchTo().alert();
      	  System.out.println(alert2.getText());
      	  alert2.accept(); 
      	  
//**********************BIO_TOKEN_ONLINE_MAILTags**************//	
          
          new Select(driver.findElement(By.xpath(".//*[@id='mailTemplateTypeId']"))).selectByVisibleText("BIO_TOKEN_ONLINE_MAIL");
          
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).clear();
          
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).sendKeys("Dear {FIRSTNAME} <br/> {LASTNAME}<br/>{USERLOGONID}<br/>{MOBILENUMBER}<br/>{EMAILID}<br/>{PASSWORD}<br/>{DOMAINID}<br/>{DOMAINNAME}<br/>{APPLICATIONID}<br/>{APPLICATIONNAME}<br/>{MFIDURL}<br/>{USERURL}<br/>{MAILATTACHMENTFILE1}<br/>{MOBILEAPIPATH}<br/>{IOSAPIPATH}<br/>{WINDOWSAPIPATH}<br/>{BLACKBERRYAPIPATH}<br/><br/>{DESKTOPWIN64APIPATH}<br/>{QRHOST}<br/>{QRPORT}<br>{PASSWORDRESETLINK}<br/>{DEVICEID}<br/>{MOBILETYPE}<br/>{OTP}");
          driver.findElement(By.xpath(".//*[@id='updateTemplateButtonId']")).click();
          
          System.out.println("TC003:BIO_TOKEN_ONLINE_MAIL");
          Alert alert21=driver.switchTo().alert();
      	  System.out.println(alert21.getText());
      	  alert2.accept(); 
      	  
//**********************BIO_TOKEN_OFFLINE_MAILTags**************//	
          
          new Select(driver.findElement(By.xpath(".//*[@id='mailTemplateTypeId']"))).selectByVisibleText("BIO_TOKEN_OFFLINE_MAIL");
          
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).clear();
          
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).sendKeys("Dear {FIRSTNAME} <br/> {LASTNAME}<br/>{USERLOGONID}<br/>{MOBILENUMBER}<br/>{EMAILID}<br/>{PASSWORD}<br/>{DOMAINID}<br/>{DOMAINNAME}<br/>{APPLICATIONID}<br/>{APPLICATIONNAME}<br/>{MFIDURL}<br/>{USERURL}<br/>{MAILATTACHMENTFILE1}<br/>{MOBILEAPIPATH}<br/>{IOSAPIPATH}<br/>{WINDOWSAPIPATH}<br/>{BLACKBERRYAPIPATH}<br/><br/>{DESKTOPWIN64APIPATH}<br/>{QRHOST}<br/>{QRPORT}<br>{PASSWORDRESETLINK}<br/>{DEVICEID}<br/>{MOBILETYPE}<br/>{OTP}");
          driver.findElement(By.xpath(".//*[@id='updateTemplateButtonId']")).click();
          
          System.out.println("TC004:BIO_TOKEN_OFFLINE_MAIL");
          Alert alert211=driver.switchTo().alert();
      	  System.out.println(alert211.getText());
      	  alert211.accept();   
      	  
//**********************HARDTOKEN MAILTags**************//	
          
          new Select(driver.findElement(By.xpath(".//*[@id='mailTemplateTypeId']"))).selectByVisibleText("HARDTOKEN_MAIL");
          
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).clear();
          
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).sendKeys("Dear <br/>{USERLOGONID}<br/>{MOBILENUMBER}<br/>{EMAILID}<br/>{PASSWORD}<br/>{DOMAINID}<br/>{DOMAINNAME}<br/>{APPLICATIONID}<br/>{APPLICATIONNAME}<br/>{MFIDURL}<br/>{USERURL}<br/>{MAILATTACHMENTFILE1}<br/>{MOBILEAPIPATH}<br/>{IOSAPIPATH}<br/>{WINDOWSAPIPATH}<br/>{BLACKBERRYAPIPATH}<br/>{LICENSEKEY}<br/>{DESKTOPWIN64APIPATH}<br/>{QRHOST}<br/>{QRPORT}<br>");
          driver.findElement(By.xpath(".//*[@id='updateTemplateButtonId']")).click();
          
          System.out.println("TC005:HARDTOKEN_MAIL");
          Alert alert2111=driver.switchTo().alert();
      	  System.out.println(alert2111.getText());
      	  alert2111.accept();  
      	  
//**********************PUSH_TOKEN_ONLINE_MAILTags**************//	
          
          new Select(driver.findElement(By.xpath(".//*[@id='mailTemplateTypeId']"))).selectByVisibleText("PUSH_TOKEN_ONLINE_MAIL");
          
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).clear();
          
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).sendKeys("Dear <br/>{USERLOGONID}<br/>{MOBILENUMBER}<br/>{EMAILID}<br/>{PASSWORD}<br/>{DOMAINID}<br/>{DOMAINNAME}<br/>{APPLICATIONID}<br/>{APPLICATIONNAME}<br/>{MFIDURL}<br/>{USERURL}<br/>{MAILATTACHMENTFILE1}<br/>{MOBILEAPIPATH}<br/>{IOSAPIPATH}<br/>{WINDOWSAPIPATH}<br/>{BLACKBERRYAPIPATH}<br/>{LICENSEKEY}<br/>{DESKTOPWIN64APIPATH}<br/>{QRHOST}<br/>{QRPORT}<br>");
          driver.findElement(By.xpath(".//*[@id='updateTemplateButtonId']")).click();
          
          System.out.println("TC006:PUSH_TOKEN_ONLINE_MAIL");
          Alert alert21111=driver.switchTo().alert();
      	  System.out.println(alert21111.getText());
      	  alert21111.accept();   
      	  
      	  
//**********************PUSH_TOKEN_OFFLINE_MAILLTags**************//	
          
          new Select(driver.findElement(By.xpath(".//*[@id='mailTemplateTypeId']"))).selectByVisibleText("PUSH_TOKEN_OFFLINE_MAIL");
          
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).clear();
          
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).sendKeys("Dear <br/>{USERLOGONID}<br/>{MOBILENUMBER}<br/>{EMAILID}<br/>{PASSWORD}<br/>{DOMAINID}<br/>{DOMAINNAME}<br/>{APPLICATIONID}<br/>{APPLICATIONNAME}<br/>{MFIDURL}<br/>{USERURL}<br/>{MAILATTACHMENTFILE1}<br/>{MOBILEAPIPATH}<br/>{IOSAPIPATH}<br/>{WINDOWSAPIPATH}<br/>{BLACKBERRYAPIPATH}<br/>{LICENSEKEY}<br/>{DESKTOPWIN64APIPATH}<br/>{QRHOST}<br/>{QRPORT}<br>");
          driver.findElement(By.xpath(".//*[@id='updateTemplateButtonId']")).click();
          
          System.out.println("TC007:PUSH_TOKEN_OFFLINE_MAIL");
          Alert alert21112=driver.switchTo().alert();
      	  System.out.println(alert21112.getText());
      	  alert21112.accept();      	  
      	  
      	  
      	  
//**********************MOBILE_TOKEN_ONLINE_MAILTags**************//	
          
          new Select(driver.findElement(By.xpath(".//*[@id='mailTemplateTypeId']"))).selectByVisibleText("MOBILE_TOKEN_ONLINE_MAIL");
          
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).clear();
          
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).sendKeys("Dear <br/>{USERLOGONID}<br/>{MOBILENUMBER}<br/>{EMAILID}<br/>{PASSWORD}<br/>{DOMAINID}<br/>{DOMAINNAME}<br/>{APPLICATIONID}<br/>{APPLICATIONNAME}<br/>{MFIDURL}<br/>{USERURL}<br/>{MAILATTACHMENTFILE1}<br/>{MOBILEAPIPATH}<br/>{IOSAPIPATH}<br/>{WINDOWSAPIPATH}<br/>{BLACKBERRYAPIPATH}<br/>{LICENSEKEY}<br/>{DESKTOPWIN64APIPATH}<br/>{QRHOST}<br/>{QRPORT}<br>");
          driver.findElement(By.xpath(".//*[@id='updateTemplateButtonId']")).click();
          
          System.out.println("TC007:MOBILE_TOKEN_ONLINE_MAIL");
          Alert alert211111=driver.switchTo().alert();
      	  System.out.println(alert211111.getText());
      	  alert211111.accept();   
      	  
      	  
//**********************MOBILE_TOKEN_OFFLINE_MAILTags**************//	
          
          new Select(driver.findElement(By.xpath(".//*[@id='mailTemplateTypeId']"))).selectByVisibleText("MOBILE_TOKEN_OFFLINE_MAIL");
          
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).clear();
          
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).sendKeys("Dear <br/>{USERLOGONID}<br/>{MOBILENUMBER}<br/>{EMAILID}<br/>{PASSWORD}<br/>{DOMAINID}<br/>{DOMAINNAME}<br/>{APPLICATIONID}<br/>{APPLICATIONNAME}<br/>{MFIDURL}<br/>{USERURL}<br/>{MAILATTACHMENTFILE1}<br/>{MOBILEAPIPATH}<br/>{IOSAPIPATH}<br/>{WINDOWSAPIPATH}<br/>{BLACKBERRYAPIPATH}<br/>{LICENSEKEY}<br/>{DESKTOPWIN64APIPATH}<br/>{QRHOST}<br/>{QRPORT}<br>");
          driver.findElement(By.xpath(".//*[@id='updateTemplateButtonId']")).click();
          
          System.out.println("TC008:MOBILE_TOKEN_OFFLINE_MAIL");
          Alert alert211121=driver.switchTo().alert();
      	  System.out.println(alert211121.getText());
      	  alert211121.accept();   	  
      	  
//**********************EMERGENCY_MAILTags**************//	
          
          new Select(driver.findElement(By.xpath(".//*[@id='mailTemplateTypeId']"))).selectByVisibleText("EMERGENCY_MAIL");
          
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).clear();
          
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).sendKeys("Dear {FIRSTNAME},\r\n" + 
          		"<br>Your emergency one time access code is  {EMERGENCYOTP}. Do not share it with anyone.\r\n" + 
          		"<br>Please contact the administrator in case of any issue.<br><br>Regards,<br>Team AuthShield\r\n" + 
          		"<br><br>Note:- This is system generated e-mail. Kindly do not respond to it.");
          driver.findElement(By.xpath(".//*[@id='updateTemplateButtonId']")).click();
          
          System.out.println("TC009:EMERGENCY_MAIL");
          Alert alert2111213=driver.switchTo().alert();
      	  System.out.println(alert2111213.getText());
      	  alert2111213.accept();   	
      	  
//**********************RESET_PASSWORD_MAILTags**************//	
          
          new Select(driver.findElement(By.xpath(".//*[@id='mailTemplateTypeId']"))).selectByVisibleText("RESET_PASSWORD_MAIL");
          
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).clear();
          
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).sendKeys("DearDear {FIRSTNAME},<br>{LASTNAME}<br>{USERLOGONID}<br>{PASSWORDRESETLINK}");
          driver.findElement(By.xpath(".//*[@id='updateTemplateButtonId']")).click();
          
          System.out.println("TC0010:RESET_PASSWORD_MAIL");
          Alert alert21112100=driver.switchTo().alert();
      	  System.out.println(alert21112100.getText());
      	  alert21112100.accept();   	  
      	  
 //**********************NEW_PASSWORD_MAILTags**************//	
          
          new Select(driver.findElement(By.xpath(".//*[@id='mailTemplateTypeId']"))).selectByVisibleText("NEW_PASSWORD_MAIL");
          
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).clear();
          
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).sendKeys("Dear {FIRSTNAME},\r\n" + 
          		"<br>Your emergency one time access code is  {EMERGENCYOTP}. Do not share it with anyone.\r\n" + 
          		"<br>Please contact the administrator in case of any issue.<br><br>Regards,<br>Team AuthShield\r\n" + 
          		"<br><br>Note:- This is system generated e-mail. Kindly do not respond to it.");
          driver.findElement(By.xpath(".//*[@id='updateTemplateButtonId']")).click();
          
          System.out.println("TC0011:NEW_PASSWORD_MAIL");
          Alert alert21112130=driver.switchTo().alert();
      	  System.out.println(alert21112130.getText());
      	  alert21112130.accept();   	
      	  
      	  
      	  
//**********************DEVICE_ACTIVATION_MAILTags**************//	
          
          new Select(driver.findElement(By.xpath(".//*[@id='mailTemplateTypeId']"))).selectByVisibleText("DEVICE_ACTIVATION_MAIL");
          
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).clear();
          
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).sendKeys("Dear {FIRSTNAME},<br/>{LASTNAME}<br/>{USERLOGONID}<br/>{MOBILENUMBER}<br/>{EMAILID}<br/>{DOMAINID}<br/>{DOMAINNAME}<br/>{APPLICATIONID}<br/>{APPLICATIONNAME}<br/>{MFIDURL}<br/>{USERURL}<br/>{LICENSEKEY<br/>}{DEVICEID}<br/>{MOBILETYPE}");
          driver.findElement(By.xpath(".//*[@id='updateTemplateButtonId']")).click();
          
          System.out.println("TC0012:DEVICE_ACTIVATION_MAIL");
          Alert alert222=driver.switchTo().alert();
      	  System.out.println(alert222.getText());
      	alert222.accept();   	  
      	  
//**********************SMS_OTP_MAILTags**************//	
          
          new Select(driver.findElement(By.xpath(".//*[@id='mailTemplateTypeId']"))).selectByVisibleText("SMS_OTP_MAIL");
          
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).clear();
          
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).sendKeys(" Dear {FIRSTNAME}<br/>{LASTNAME}<br/>{USERLOGONID}<br/>{MOBILENUMBER}<br/>{EMAILID}{OTP}");
          driver.findElement(By.xpath(".//*[@id='updateTemplateButtonId']")).click();
          
          System.out.println("TC0013:SMS_OTP_MAIL");
          Alert alert26=driver.switchTo().alert();
      	  System.out.println(alert26.getText());
      	alert26.accept();   	
      	  
 //**********************USER_LOCKED_MAILTags**************//	
          
          new Select(driver.findElement(By.xpath(".//*[@id='mailTemplateTypeId']"))).selectByVisibleText("USER_LOCKED_MAIL");
          
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).clear();
          
          driver.findElement(By.xpath(".//*[@id='mailTemplateBodyId']")).sendKeys("Dear {FIRSTNAME<br>}{LASTNAME}<br>{USERLOGONID}<br>{MOBILENUMBER}<br>{EMAILID}");
          driver.findElement(By.xpath(".//*[@id='updateTemplateButtonId']")).click();
          
          System.out.println("TC0014:USER_LOCKED_MAIL");
          Alert alert219=driver.switchTo().alert();
      	  System.out.println(alert219.getText());
      	alert219.accept();   	  
   
      	  
  }
 
	@AfterTest
	public void tearDown() throws Exception {
		  if(driver != null)
	    driver.quit();
   
    }
  
  
  

}
