package Managers;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	public WebDriver driver;

	public DriverManager(WebDriver driver) {

		this.driver = driver;

	}

	public void SetDriverManager() {

		WebDriverManager.chromedriver().setup();

	}

}
