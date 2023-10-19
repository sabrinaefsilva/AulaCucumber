package metodo;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import driver.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Metodo extends Driver {

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void clicar(By btnLogin) {
		driver.findElement(btnLogin).click();

	}

	public void validarTexto(By msgErro, String textoEsperado) throws InterruptedException {
		assertEquals(textoEsperado,driver.findElement(msgErro)); 
	}
	
}

