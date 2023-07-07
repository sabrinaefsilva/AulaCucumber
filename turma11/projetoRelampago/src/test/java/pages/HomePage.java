package pages;

import org.openqa.selenium.By;

import Metodos.Metodos;

public class HomePage {

	By pesquisar = By.xpath("//input[@id='twotabsearchtextbox']");
	Metodos metodo = new Metodos();

	public void buscarProdutosMenu(String produto) {
		metodo.escrever(pesquisar, produto);

	}
}
