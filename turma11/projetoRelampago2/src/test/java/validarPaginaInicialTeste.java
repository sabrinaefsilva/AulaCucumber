import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import Metodos.metodos;

public class validarPaginaInicialTeste {
	
	 metodos metodo = new metodos();
	
	By pesquisar = By.xpath("//input[@id='twotabsearchtextbox']");
	By menuContasListas = By.xpath("//a[@id='nav-link-accountList']");
	
	@Before
	public void antesDoTeste() {
		metodo.abrirNavegador();
	}

	@Test
	public void pesquisarProduto() {
		metodo.escrever(pesquisar, "Macbook");
		metodo.submit(pesquisar);
		
		//capturar o valor do produto desejado
		//após adicionar produto no carrinho validar Subtotal do carrinho:  
	}
	
	
	@Test
	public void acessarMenu() {
		metodo.mouseOver(menuContasListas);
	}

}
