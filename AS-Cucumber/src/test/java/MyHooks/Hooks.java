package MyHooks;

import Com.Auth.Common.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{

	@Before
	public void SetUp() {

		System.out.println("Start Executing Scenario");
		initailizedriver();

	}

	@After
	public void TearDown() {

		System.out.println("Test Scenario Completed !");
		AlertHandler();
	}
}
