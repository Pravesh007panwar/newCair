package ActionsListeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface ActionInterface {
	
	public void MouseHover(WebDriver driver, WebElement ele);
	public void SwitchToChildWindow(WebDriver driver);
	public void JsExecutor(WebDriver driver, WebElement ele);
	public void windowScroll(WebDriver driver, WebElement ele);

}
