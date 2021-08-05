package setpDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class facebooklogin {

	WebDriver driver = null;

	@Given("^User navigates to Facebook Login Page using url \"([^\"]*)\"$")
	public void user_navigates_to_Facebook_Login_Page_using_url(String arg1) {

		System.out.println("Launced Successfully");
	}

	@When("^user enters a valid Emailid as \"([^\"]*)\" and valid Password as \"([^\"]*)\"$")
	public void user_enters_a_valid_Emailid_as_and_valid_Password_as(String arg11, String arg12) {
		driver.findElement(By.id("email")).sendKeys(arg11);
		driver.findElement(By.id("pass")).sendKeys(arg12);
	}

	@And("^clicks on login button$")
	public void clicks_on_login_button() {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"))
				.click();

	}

	@Then("^Successfully able to login into my facebook account$")
	public void successfully_able_to_login_into_my_facebook_account() {
		System.out.println("Login Successfully");
	}

	@Given("^user should be at login account page$")
	public void user_should_be_at_login_account_page() {
		System.out.println("At facebook page");
	}

	@When("^user clicks at account option$")
	public void user_clicks_at_account_option() {

		driver.findElement(By.cssSelector("i.hu5pjgll.lzf7d6o1.sp_mV3TW2nNl4B.sx_26fa0f")).click();

	}

	@When("^click on logout$")
	public void click_on_logout() {
		driver.findElement(By.cssSelector(
				"span.d2edcug0.hpfvmrgz.qv66sw1b.c1et5uql.lr9zc1uh.a8c37x1j.keod5gw0.nxhoafnm.aigsh9s9.d3f4x2em.fe6kdd0r.mau55g9w.c8b282yb.iv3no6db.jq4qci2q.a3bd9o3v.ekzkrbhg.oo9gr5id.hzawbc8m"))
				.click();
	}

	@Then("^user account should be logout successfully$")
	public void user_account_should_be_logout_successfully() {

	}

}
