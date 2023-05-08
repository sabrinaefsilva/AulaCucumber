package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import drivers.Drivers;

public class Metodos extends Drivers {

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();

		} catch (Exception e) {
			System.err.println("Erro ao tentar clicar" + elemento);
		}
	}

//JavascriptExecutor exeBtnReconet = (JavascriptExecutor)driver;  
	// exeBtnReconet.executeScript("document.getElementById('menuReconet').click(););
	//button = driver.findElement.By.id(ID);
	
	
	public void fecharPopUp() {
		WebElement cookie = driver.findElement(By.xpath("//button[@style='display: inline-block;']"));
		int contador = 3;
		do {
			cookie.click();
		} while (cookie.isSelected() && contador > 0);
	}

	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("Erro ao tentar escrever" + elemento);
		}

	}

	public void validarPopUp(By elemento, int qtdClicks) {
		WebElement PopUp = driver.findElement(elemento);
		do {
			clicar(elemento);
			qtdClicks--;
		} while (PopUp.isDisplayed() && qtdClicks > 0);
	}

	public void preencher(By elemento, String texto) {
		driver.findElement(elemento);

	}

	public void pause(int tempo) {
		try {

		} catch (Exception e) {

		}
	}
	
	public void scroll(int n1, int n2) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+n1+","+n2+")");
		
	}
}
