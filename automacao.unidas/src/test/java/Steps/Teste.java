package Steps;

import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import metodos.Metodos;
import runner.Executa;

public class Teste {

	Elementos elemento = new Elementos();
	Metodos metodo = new Metodos();

	@Before
	public void iniciarTeste() {
		Executa.abrirNavegador(true);
	}

	@Test
	public void validarSite() throws InterruptedException {
		Thread.sleep(5000);
		metodo.scroll(0, 2900);
		metodo.escrever(elemento.promocoesNome,"Claudia");
		metodo.escrever(elemento.promocoesEmail,"claudia@gmail.com");
		metodo.clicar(elemento.botaoCadastrar);
		
	}
}
