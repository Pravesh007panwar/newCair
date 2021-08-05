package AS.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthLoginPage {

	@FindBy(id = "id1")
	WebElement SelectOrganization;
	@FindBy(id = "id2")
	WebElement SelectDomain;
	@FindBy(id = "id3")
	WebElement SelectApplication;
	@FindBy(id = "input-username")
	private WebElement SetUsername;
	@FindBy(id = "input-password")
	private WebElement SetPassword;
	@FindBy(id = "login-btn_remove")
	WebElement ClickLoginButton;
	@FindBy(id = "forget-password")
	WebElement forgotpassword;
	@FindBy(id = "userName_resPass")
	WebElement ResetPassword;
	@FindBy(id = "id1a")
	WebElement forgotpasswordSelectOrganization;
	@FindBy(id = "id2a")
	WebElement ForgotpasswordSelectDomain;
	@FindBy(css = "input#forget-btn")
	WebElement forgetbtn;

	public AuthLoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public WebElement SelectOrganization() {

		return SelectOrganization;

	}

	public WebElement SelectDomain() {

		return SelectDomain;

	}

	public WebElement SelectApplication() {

		return SelectApplication;

	}

	public WebElement SetUsername() {
		return SetUsername;

	}

	public WebElement SetPassword() {
		return SetPassword;
	}

	public WebElement ClickLoginButton() {
		return ClickLoginButton;

	}

	public WebElement forgotpassword() {
		return forgotpassword;

	}

	public WebElement ResetPassword() {

		return ResetPassword;

	}

	public WebElement forgotpasswordSelectOrganization() {
		return forgotpasswordSelectOrganization;

	}

	public WebElement ForgotpasswordSelectDomain() {

		return ForgotpasswordSelectDomain;

	}

	public WebElement forgetbtn() {
		return forgetbtn;
	}

}