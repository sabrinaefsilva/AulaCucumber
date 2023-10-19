package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",//caminho
		glue = "steps",// pacote
		tags = "@regressivos",// ou ad not + nome da pasta a nao ser executada,
		dryRun = false, //planejamento ou execução
		monochrome = true, //remove caracters especiais
		snippets = SnippetType.CAMELCASE,
		plugin = {"pretty","html:target/cucumber-report.html"}
		
		
		
		)

public class Executa  {
	
	
}
