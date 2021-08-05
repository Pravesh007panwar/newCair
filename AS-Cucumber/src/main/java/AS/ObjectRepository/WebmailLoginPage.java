package AS.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebmailLoginPage {

	@FindBy(css = "input#username")
	private WebElement username;
	@FindBy(css = "input#password")
	private WebElement password;
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input[2]")
	private WebElement SignIn;

	public WebmailLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void enterusername() {

		username.sendKeys("zimtest5@nic.in");

	}

	public void enterpassword() {

		password.sendKeys("Aksu@1990");
	}

	public void ClickonSignIn() {

		SignIn.click();
	}

}