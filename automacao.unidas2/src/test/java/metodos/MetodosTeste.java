package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import drivers.Driver;

public class MetodosTeste extends Driver {

	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("Erro ao tentar escrever" + elemento);
		}

	}

	public void clicar(By elemento, String string) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("Erro ao tentar clicar" + elemento);
		}
	}

	public void scroll(int n1, int n2) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + n1 + "," + n2 + ")");

	}
}
