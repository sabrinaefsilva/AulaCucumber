package Runner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Metodos.Metodos;
import pages.HomePage;

public class Executa {

	Metodos metodo = new Metodos();
	HomePage page = new HomePage();

	@Before
	public void iniciarTeste() {
		metodo.abrirNavegador();

	}

	@Test
	public void finalizarTeste() {
		metodo.fecharNavegador();
	}

	@After
	public void testeTitle() {
		metodo.validarTitle("Peep Toe Couro Shoestock Básico Pesponto Salto Bloco - Marrom | Shoestock");
	}

}
