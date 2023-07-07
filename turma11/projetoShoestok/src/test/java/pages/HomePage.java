package pages;

import org.openqa.selenium.By;

import Metodos.Metodos;

public class HomePage {

	Metodos metodo = new Metodos();

	public void menuPrincipal(String menu, String subMenu) {

		By menuPrincipal = By.xpath("//a[@id='" + menu + "']");
		By subMenuPricipal = By.xpath("//a[@title='" + subMenu + "']");

		metodo.mouseOver(menuPrincipal);
		metodo.esperarElementoSerClicavel(subMenuPricipal, 10);
		metodo.clicar(subMenuPricipal);

	}
}
