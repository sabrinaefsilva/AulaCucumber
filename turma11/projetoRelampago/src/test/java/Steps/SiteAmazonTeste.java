package Steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Metodos.Metodos;
import Runner.Navegadores;
import pages.HomePage;

public class SiteAmazonTeste {

	Metodos metodo = new Metodos();
	Navegadores nav = new Navegadores();
	HomePage home = new HomePage();

	@Before
	public void iniciarTeste() {
		nav.abrirNavegador();

	}

	@After
	public void finalizarTeste() {
		nav.fecharNavegador();

	}

	@Test
	public void validarTitulo() {
		metodo.validarTitle("Amazon.com.br | Tudo pra você, de A a Z.");
	}

	public void pesquisarProdutoTeste() {
		//home.pesquisarProdutosTeste();
		

	}
}
