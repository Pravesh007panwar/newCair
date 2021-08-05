package cucumberOptions;
 
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/Appfeatures/Authlogin.feature"}
 ,glue={"AuthloginStepDefination"}
		
		)
 
 
public class AuthloginRunner {
 
}