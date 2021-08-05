package stepDefinations;

import org.testng.annotations.BeforeMethod;

import Com.Auth.Common.BaseClass;

public class WebDriverBaseTest extends BaseClass {
	
	@BeforeMethod
	public void Setup() {
		
		initailizedriver();
			
		}
		
		
	
	

}
