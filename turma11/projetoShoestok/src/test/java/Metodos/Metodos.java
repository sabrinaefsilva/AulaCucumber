package Metodos;

import static org.junit.Assert.assertEquals;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Driver.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Metodos extends Driver {

	Metodos metodo = new Metodos();

	public void abrirNavegador() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get("https://www.shoestock.com.br");
		driver.manage().window().maximize();

	}

	public void fecharNavegador() {
		driver.quit();

	}

	public void validarTitle(String textoEsperado) {
		assertEquals(textoEsperado, driver.getTitle());

	}

	public static void escrever(By pesquisar, String texto) {
		Metodos.escrever(pesquisar, texto);

	}

	public static void clicar(By lupaPesquisa) {
		Metodos.clicar(lupaPesquisa);

	}

	public static void mouseOver(By elemento) {
		WebElement element = driver.findElement(elemento);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
	
	public void esperarElementoSerClicavel(By elemento, int tempo) {
	WebDriverWait wait = new WebDriverWait(driver, tempo);
	WebElement element = wait.until(ExpectedConditions.
	 elementToBeClickable(elemento));
	
	}

	
}
