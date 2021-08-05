package BigdataRepository;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;

import DataIngestors.InnsightLogin;

public class test029indexingmechanisms extends InnsightLogin {
@AfterClass
	
	public void highvolumestreamingdata() throws InterruptedException
	
	{
	driver.findElement(By.cssSelector("input#txtTwSrch")).clear();
	driver.findElement(By.cssSelector("input#txtTwSrch")).sendKeys("(India AND Kashmir");
	driver.findElement(By.cssSelector("span#searchTweet")).click();
	Thread.sleep(15000);

	
	}
	

}

	


