package navegador;

import drive.Drivers;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Navegadores extends Drivers {

	public static void abrirNavegador() {
		try {
			WebDriverManager.chromedriver();
			driver.get("https://www.saucedemo.com");
			driver.manage().window().maximize();

		} catch (Exception e) {
			System.out.println("Erro ao abrir o navegador");
			System.out.println("Causa do erro " + e.getCause());
		}

	}

	public static void fecharNavegador() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("Erro ao fechar o navegador");
			System.out.println("Causa do erro " + e.getCause());
		}
	}
}
