package Managers;

import org.openqa.selenium.WebDriver;

import AS.ObjectRepository.AuthLoginPage;
import AS.ObjectRepository.WebmailLoginPage;

public class PageObjectManager {
	private WebDriver driver;
	private WebmailLoginPage WebmailLoginPage;
	private AuthLoginPage AuthLoginPage;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	public WebmailLoginPage getWebmailLoginPage() {
		return (WebmailLoginPage == null) ? WebmailLoginPage = new WebmailLoginPage(driver) : WebmailLoginPage;

	}

	public AuthLoginPage getAuthLoginPage() {
		return (AuthLoginPage == null) ? AuthLoginPage = new AuthLoginPage(driver) : AuthLoginPage;

	}
}
