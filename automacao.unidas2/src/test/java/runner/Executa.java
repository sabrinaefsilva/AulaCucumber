package runner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import drivers.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Executa extends Driver {

	public static void abrirNavegador(boolean headless) {
		String ambiente = "https://www.unidas.com.br/";

		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		if (!headless) {
			chromeOptions.addArguments("--headless");
		}
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOptions);
		driver.get(ambiente);
	}
}
