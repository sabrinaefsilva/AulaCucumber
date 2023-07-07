package Metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Driver.DriversFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Metodos extends DriversFactory {

	public void abrirNavegador(String titleEsperado) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com.br");
		driver.manage().window().maximize();

	}

	public void validarTitle(String tituloEsperado) {
		String titleCapturado = driver.getTitle();
		assertEquals(tituloEsperado, titleCapturado);

	}

	public void fecharNavegador() {
		driver.quit();
	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
		
	}
}
