package metodo;

import org.openqa.selenium.By;

import drive.Drivers;



public class Metodos extends Drivers {
	
	public void escrever(By elemento, String texto, String passo) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("Erro ao escrever no passo " + passo);
			System.out.println("Causa do erro " + e.getCause());
		}

	}
	public static void clicar(By elemento, String passo) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("Erro ao clicar no passo " + passo);
			System.out.println("Causa do erro " + e.getCause());
		}
	}
	
	
	
}
