package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import drivers.Drivers;

public class Metodos extends Drivers {

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento);

	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void validarTexto(By elemento, String texto) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertEquals(texto, textoCapturado);
	}

	public void validarTitle(String texto) {
		assertEquals(texto, driver.getTitle());
	}

}
