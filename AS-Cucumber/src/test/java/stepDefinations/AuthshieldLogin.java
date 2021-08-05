package stepDefinations;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Com.Auth.Common.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthshieldLogin extends BaseClass {


	@Given("User is on Login Page")
	public void user_is_on_login_page() {

		//initailizedriver();

	}

	@When("User Enters Valid credentails to Login")
	public void user_enters_valid_credentails_to_login() {
		AuthLogin.SetUsername().sendKeys("usermfid");
		AuthLogin.SetPassword().sendKeys("123456");

	}

	@When("Click on Submit Button")
	public void click_on_submit_button() {
		AuthLogin.ClickLoginButton().click();

	}

	@Then("user Should login Successfully")
	public void user_should_login_successfully() {

		String actualTitle = driver.getTitle();
		String expectedTitle = "Login page";
		assertEquals(expectedTitle, actualTitle);
		System.out.println("Login Successfull");
		driver.quit();
	}

	@When("User select logout from AccountDropDown")
	public void user_select_logout_from_account_drop_down() {
		WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[2]/div/div[2]/ul/li/a"));

		ele2.click();
	}

	@When("Click")
	public void click() {

		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[2]/div/div[2]/ul/li/ul/li[5]/a")).click();

	}

	@Then("User Should logout Successfully")
	public void user_should_logout_successfully() {
		System.out.println("logoutSuccessfull");
		driver.quit();

	}

	@When("^User Enters Invalid \"([^\"]*)\" and Invalid \"([^\"]*)\"$")
	public void user_enters_invalid_something_and_invalid_something(String username, String password) {

		AuthLogin.SetUsername().sendKeys(username);
		AuthLogin.SetPassword().sendKeys(password);

	}

	@Then("User Should not login Successfully")
	public void user_should_not_login_successfully() {

		AlertHandler();

	}

	@When("^User click on Forgot Password link$")
	public void user_click_on_forgot_password_link() {

		AuthLogin.forgotpassword().click();

	}

	@When("^user Enters Valid username$")
	public void user_enters_valid_username() {

		AuthLogin.ResetPassword().sendKeys("pravesh-ldp.auth4cert@zimbra.com");

	}

	@When("^select organization and Domain$")
	public void select_organization_and_domain() {
		select = new Select(AuthLogin.forgotpasswordSelectOrganization());
		select.selectByIndex(1);
		select = new Select(AuthLogin.ForgotpasswordSelectDomain());
		select.selectByIndex(0);

	}

	@When("click on submit")
	public void click_on_submit() {

		AuthLogin.forgetbtn().click();
		AlertHandler();

	}
}
