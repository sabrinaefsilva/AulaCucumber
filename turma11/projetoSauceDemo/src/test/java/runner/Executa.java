package runner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import driver.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Executa extends Driver {
	
	
	public void abrirNavegador(String titleEsperado) {
		ChromeOptions opition = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com.br");
		driver.manage().window().maximize();

	}
}
