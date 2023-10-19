package HomePage;

import org.openqa.selenium.By;

import metodos.Metodos;

public class BuscarCepEndereco extends Metodos {

	public By buscaCepEndereco = By.xpath("input[@id='relaxation']");
	Metodos metodo = new Metodos();
	
	public void buscarCepEndereco(String cepEndereco) {
		
		metodo.escrever(buscaCepEndereco,cepEndereco);
		metodo.submit(buscaCepEndereco);
	}
}
