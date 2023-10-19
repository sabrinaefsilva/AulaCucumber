package runner;

import org.junit.runner.RunWith;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/resources/features", 
		dryRun = false,
		glue = "steps",
		tags = "@regressivo",
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		plugin = {"pretty","html:target/cucumber-report.html"}
		
		)
public class Executa {

	

	
}
