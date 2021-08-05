package setpDefinations;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Authloginlogout {

	public WebDriver driver;
	
	@Given("^User is on Authshield Home Page$")
	public void user_is_on_Authshield_Home_Page()  {
		
		System.out.println(driver.getCurrentUrl());
	    
	}

	@When("^User navigate to Login Page$")
	public void user_navigate_to_Login_Page()  {
	   System.out.println(driver.getTitle());
	}

	@Then("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2)  {
	    
	}

	@Then("^User should get logged in$")
	public void user_should_get_logged_in()  {
	    
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully()  {
	    
	}
	


@When("^user logs out from application$")
public void user_logs_out_from_application() throws Throwable {
    
}

@Then("^Message displayed Logout successfully$")
public void message_displayed_Logout_successfully() throws Throwable {
    
}

@Then("^Browser quit by driver$")
public void browser_quit_by_driver() throws Throwable {
    
}
}