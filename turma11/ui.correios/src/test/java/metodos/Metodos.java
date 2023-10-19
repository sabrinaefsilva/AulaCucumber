package metodos;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;

import driver.Drivers;

public class Metodos extends Drivers {

	public void mudarAba() {
		String janelaPrincipal = driver.getWindowHandle();
		Set<String> todasJanelasAbertas = driver.getWindowHandles();
		
		for(String ultimaJanelaAcessada : todasJanelasAbertas) {
		if(!ultimaJanelaAcessada.equals(janelaPrincipal)) {
			driver.switchTo().window(ultimaJanelaAcessada);{
				
				}
			}
		}
	}
	
	
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void submit(By elemento) {
		driver.findElement(elemento).submit();
	}
	public void validarTexto(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertEquals(textoEsperado,textoCapturado);
	}

}
