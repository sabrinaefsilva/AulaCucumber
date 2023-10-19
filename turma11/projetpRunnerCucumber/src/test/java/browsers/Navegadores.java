package browsers;


import org.openqa.selenium.chrome.ChromeDriver;

import driver.Drivers;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Navegadores extends Drivers {

	public static void abrirNavegador() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		
	}
}
