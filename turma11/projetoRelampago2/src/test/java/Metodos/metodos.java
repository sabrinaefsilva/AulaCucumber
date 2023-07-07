package Metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Driver.driversFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class metodos extends driversFactory {

	public static void abrirNavegador() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com.br");
		driver.manage().window().maximize();

	}

	public static void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public static void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public static void escrever(By elemento) {
		driver.findElement(elemento).clear();
	}

	public static void submit(By elemento) {
		driver.findElement(elemento).submit();
	}

	public static void mouseOver(By elemento) {
		WebElement element = driver.findElement(elemento);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();

	}

	public static void duploClick(By elemento) {
		WebElement element = driver.findElement(elemento);
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();

	}

	/*
	 * **USANDO METODOS PARA O TECLADO** public void tab() { Actions actions = new
	 * Actions(driver); actions.sendKeys(Keys.TAB).perform();
	 */


	/*public void pegarTextoRetorno(By elemento) {
	String texto = driver.findElement(elemento).getText();

}*/

}