package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import conexoes.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature", glue = "steps", tags = "@teste", monochrome = true, dryRun = false, plugin = {
		"pretty", "html:target/cucumber-report.html" }, snippets = SnippetType.CAMELCASE

)
public class Executa extends DriversFactory {

	public static void abrirNavegador() {
		String url = "https://demoqa.com/";
		String navegador = "Chrome";
		boolean headless = false;

		if (navegador.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			if (headless) {
				options.addArguments("--headless");
				options.addArguments("--disable-gpu");
				options.addArguments("--window-size=1400,800");
			}
			driver = new ChromeDriver();
		} else if (navegador.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Digete Chrome ou Firefox");
		}
		driver.get(url);
		driver.manage().window().maximize();
	}
}
