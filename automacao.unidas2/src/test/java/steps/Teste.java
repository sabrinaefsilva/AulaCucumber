package steps;

import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import metodos.MetodosTeste;
import runner.Executa;

public class Teste {

	Elementos elementos = new Elementos();
	MetodosTeste metodo = new MetodosTeste();
	
	
	@Before
	public void iniciarTeste() {
		Executa.abrirNavegador(false);

	}

	@Test
	public void retirada() throws InterruptedException {
		Thread.sleep(3000);
		metodo.scroll(0, 500);
		metodo.escrever(elementos.menuCidade, "Alphaville,Barueri,Sao Paulo");
		metodo.clicar(elementos.menuDataRetirada, null);
		metodo.clicar(elementos.dataEspeficica, "20/11/2022");
	}

	
	//a[@class='primary-button']
}
