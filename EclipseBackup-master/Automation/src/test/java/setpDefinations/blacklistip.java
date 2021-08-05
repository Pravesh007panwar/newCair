package setpDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class blacklistip  {

	public static WebDriver driver;
		@Given("^After successfully Login to Authshield$")
		public void after_successfully_Login_to_Authshield()  {
			
			 
			  DesiredCapabilities ch =new   DesiredCapabilities();
			   ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			   // local browser handling.
			   ChromeOptions c =new ChromeOptions();
			   
			   c.merge(ch);
			  
			  System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
			   driver =new ChromeDriver(c);
			  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			   driver.manage().window().maximize();
			   
			   driver.get("https://192.168.2.163/mfid/");
			   System.out.println("Welcome to Authshield Login");
			  System.out.println(driver.getTitle());
			  System.out.println(driver.getCurrentUrl());
			   Select login = new Select(driver.findElement(By.name("organisationName")));
			   login.selectByVisibleText("MEITY");
			   Select login1 =new Select(driver.findElement(By.name("domain")));
			   login1.selectByVisibleText("NIC");
			   Select login2 =new Select(driver.findElement(By.name("application")));
			   login2.selectByVisibleText("webmail");
			   driver.findElement(By.id("input-username")).sendKeys("usermfid");
			   driver.findElement(By.id("input-password")).sendKeys("UP11BZ5484");
			   driver.findElement(By.id("login-btn_remove")).click();
		    
		}

		@Then("^click on Administration and click on Insert Blacklist IP$")
		public void click_on_Administration_and_click_on_Insert_Blacklist_IP()  {
			
		
			  driver.findElement(By.linkText("Administration")).click();
			    driver.findElement(By.linkText("Insert Blacklist IP")).click();
		    
		}

		@Then("^Select a valid excel file using choose file option$")
		public void select_a_valid_excel_file_using_choose_file_option()  {
			
			driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div[2]/div/div[1]/div/input")).sendKeys("D:\\selenium\\blockListedip.csv");
			
		  
		}

		@Then("^click on submit button$")
		public void click_on_submit_button()  {
			driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div[2]/div/div[1]/div/button")).click();
		    
		}

		@Then("^file should be successfully insert\\.$")
		public void file_should_be_successfully_insert()  {
			
			String alert = driver.findElement(By.id("alertBox")).getText();
			   System.out.println(alert);
			    driver.findElement(By.id("closeBtn")).click();
		}

		@When("^Select an Invalid excel file using choose file option$")
		public void select_an_Invalid_excel_file_using_choose_file_option() {
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div[1]/div[2]/div/div[1]/div/input")).sendKeys("D:\\selenium\\blockListedip.csv");
		}

		@Then("^file should not be successfully inserted\\.$")
		public void file_should_not_be_successfully_inserted()  {
				
				String alert = driver.findElement(By.id("alertBox")).getText();
				   System.out.println(alert);
				    driver.findElement(By.id("closeBtn")).click();  
				   
		}
		
		@Then("^click on save button without putting the ip ranges$")
		public void click_on_save_button_without_putting_the_ip_ranges() throws Throwable {
		    
		    driver.findElement(By.id("search_ip_add_new")).click();
		    driver.findElement(By.className("edit")).click();
		}

		@Then("^An alert should be come$")
		public void an_alert_should_be_come() throws Throwable {
			String alert = driver.findElement(By.id("alertBox")).getText();
			   System.out.println(alert);
			    driver.findElement(By.id("closeBtn")).click();
		    
		}

		@Then("^ADD a Valid IP range by putting Start Ip range and End Ip Range$")
		public void add_a_Valid_IP_range_by_putting_Start_Ip_range_and_End_Ip_Range() throws Throwable {
		    
			driver.findElement(By.id("ipRange1")).sendKeys("192.168.2.1");
			driver.findElement(By.id("ipRange2")).sendKeys("192.168.2.255");
			
		}

		@Then("^click on save button\\.$")
		public void click_on_save_button() throws Throwable {
			driver.findElement(By.className("edit")).click();
		}

		@Then("^Selected IP range should be Successfully Add$")
		public void selected_IP_range_should_be_Successfully_Add() throws Throwable{
			String alert = driver.findElement(By.id("alertBox")).getText();
			   System.out.println(alert);
			    driver.findElement(By.id("closeBtn")).click();
		}

		@Then("^ADD a INValid IP range by putting Start Ip range and End Ip Range$")
		public void add_a_INValid_IP_range_by_putting_Start_Ip_range_and_End_Ip_Range() throws Throwable {
		   

			driver.findElement(By.id("ipRange1")).sendKeys("192.168.1");
			driver.findElement(By.id("ipRange2")).sendKeys("192.168.2");
			driver.findElement(By.className("edit")).click();
		}

		@Then("^Selected IP range should not be Successfully Add$")
		public void selected_IP_range_should_not_be_Successfully_Add() throws Throwable {
		    
			String alert = driver.findElement(By.id("alertBox")).getText();
			   System.out.println(alert);
			    driver.findElement(By.id("closeBtn")).click();
		}

		@Then("^click on Delete button without putting the ip ranges$")
		public void click_on_Delete_button_without_putting_the_ip_ranges() throws Throwable {
			
			driver.findElement(By.id("ip_search_multi_delete")).click();
		    
		}

		@Then("^Search an added IP range Valid IP range by putting Start Ip range$")
		public void search_an_added_IP_range_Valid_IP_range_by_putting_Start_Ip_range() throws Throwable {
		    
		}

		@Then("^click on Search button\\.$")
		public void click_on_Search_button() throws Throwable {
		    
		}

		@Then("^Selected IP range should come$")
		public void selected_IP_range_should_come() throws Throwable {
		    
		}

		@Then("^select the IP range and click on Delete button$")
		public void select_the_IP_range_and_click_on_Delete_button() throws Throwable {
		   
		}

		@Then("^The IP range should be delete Successfully$")
		public void the_IP_range_should_be_delete_Successfully() throws Throwable {
		   
		}

		@Then("^Enter IP and click on Search button$")
		public void enter_IP_and_click_on_Search_button() throws Throwable {
		   
		}

		@Then("^click on edit button and update the New IP$")
		public void click_on_edit_button_and_update_the_New_IP() throws Throwable {
		    
		}

		@Then("^Click the save button$")
		public void click_the_save_button() throws Throwable {
		    
		}

		@Then("^The IP range should be  Successfully update\\.$")
		public void the_IP_range_should_be_Successfully_update() throws Throwable {
		   
		}

}

