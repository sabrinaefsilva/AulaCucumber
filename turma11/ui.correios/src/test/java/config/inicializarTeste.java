package config;

import org.openqa.selenium.chrome.ChromeDriver;

import driver.Drivers;
import io.github.bonigarcia.wdm.WebDriverManager;

public class inicializarTeste extends Drivers {
 
	public static void abrirNavegador() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.correios.com.br");
	}
	
}
