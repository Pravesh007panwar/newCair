package myjenkinsProjeject.maven;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mongodb.connection.Stream;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaStream {
	public static WebDriver driver;
	Select sle;

	@Test
	public static void initailizedriver() {

		
		  DesiredCapabilities ch = new DesiredCapabilities();
		  ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true); ChromeOptions c
		  = new ChromeOptions(); c.merge(ch);
		  
		  WebDriverManager.chromedriver().setup();
		  
		  c.setExperimentalOption("useAutomationExtension", false);
		  c.setExperimentalOption("excludeSwitches",
		  Collections.singletonList("enable-automation"));
		  
		  c.addArguments("--start-maximized");
		  c.addArguments("--disable-web-security");
		  c.addArguments("--no-proxy-server");
		  c.addArguments("--headless");
		  driver = new ChromeDriver(c);
		  
		  
		 

		
		  AuthLoginPage ap = new AuthLoginPage(driver); Select sle = new
		  Select(ap.SelectOrganization); sle.selectByIndex(1); Select sle2 = new
		  Select(ap.SelectDomain);
		  
		  sle2.selectByIndex(1); Select sle33 = new Select(ap.SelectApplication);
		  
		  sle33.selectByIndex(1);
		  
		  ap.SetUsername().sendKeys("usermfid"); ap.SetPassword().sendKeys("123456");
		  
		  
		  ap.ClickLoginButton().click();
		  
		  
		  List<WebElement> usermodule = driver.findElements(By.xpath("/div/div/div[2]/div/div[2]/ul/li/a/span"));
		  
		  usermodule.stream().map(s->s.getText()).collect(Collectors.toList());
		  System.out.println(usermodule);
		 
			/*
			 * List<WebElement> webnames = driver.findElements(By.tagName("a"));
			 * List<String> values =
			 * webnames.stream().map(s->s.getText()).collect(Collectors.toList());
			 * values.stream().filter(s->s.startsWith("N")).forEach(s->System.out.println(s)
			 * ); boolean
			 * flagname=values.stream().anyMatch(s->s.equalsIgnoreCase("NTT Global"));
			 * Assert.assertTrue(flagname);
			 */
		
	

		/*for (WebElement elementlist : elelist) {

			String newlist = elementlist.getText();
	driver.get("https://naukri.com");
			
			
			webnames.stream().filter(s->s.getText()).forEach(s->System.out.println(s));
			ArrayList<String> name = new ArrayList<String>();

			name.add("ABCD");
			name.add("ABCDEF");
			name.add("CDFG");
			
			.
		name.stream().filter(s->s.startsWith("C")).collect(Collectors.toList()).forEach(s->System.out.println(s));
		*/
		
			
			
			
		}
//@Test

public void sorting() {
	
	
	List<Integer>sorted2=Arrays.asList(1,4,2,3,5,6,7,8,3);
	List<Integer>newsort=sorted2.stream().distinct().collect(Collectors.toList());
	
	newsort.stream().sorted().forEach(s->System.out.println(s));
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}
	}

