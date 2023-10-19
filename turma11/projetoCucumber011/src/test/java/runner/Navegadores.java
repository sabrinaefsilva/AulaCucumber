package runner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import drivers.Drivers;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Navegadores extends Drivers {

	public static void abriNavegador() {
		ChromeOptions opitions = new ChromeOptions();
		opitions.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
	}

	public static void fecharNavegador() {
		driver.quit();

	}

}
