package cucumberOptions;

import org.junit.AfterClass;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features/WebMailLogin.feature", 
glue = { "stepDefinations", "MyHooks" },
tags = "@SmokeTest",
plugin = { "pretty", "html:target//cucumber-reports" },
monochrome = true
)
public class TestRunner {

	
}