package cucumberOptions;		

import org.junit.runner.RunWith;		
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)				
@CucumberOptions(
		features = "src/test/java/features/loginverify.feature",
glue={"setpDefinations"},
		plugin = "pretty")						
public class TestRunner 				
{		

}