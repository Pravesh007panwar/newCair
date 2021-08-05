package ActionsListeners;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.WebDriverBase;

public class Action extends WebDriverBase implements ActionInterface {

	@Override
	public void MouseHover(WebDriver driver, WebElement ele) {

		Actions Act = new Actions(driver);
		Act.moveToElement(ele).build().perform();

	}

	@Override
	public void SwitchToChildWindow(WebDriver driver) {

		Set<String> windows = driver.getWindowHandles();
		ArrayList<String> newwindow = new ArrayList<String>(windows);
		driver.switchTo().window(newwindow.get(1));

	}

	@Override
	public void JsExecutor(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid red;');", ele);
		

	}

	@Override
	public void windowScroll(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		
	}

}
