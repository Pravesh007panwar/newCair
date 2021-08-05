package cucumberOptions;
 
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/features/insertBlacklist IP.feature"}
 ,glue={"setpDefinations"},
		tags = "@smoke")
		
 
 
public class Blacklistip {
 
}