package Runner;

import org.junit.Test;

import Metodos.Metodos;

public class Navegadores {
	Metodos metodo = new Metodos();

	@Test

	public void validarTitle() {

		metodo.abrirNavegador(null);

	}

	public void abrirNavegador() {
		metodo.validarTitle("Amazon.com.br | Tudo pra você, de A a Z.");

	}

	public void fecharNavegador() {
		metodo.fecharNavegador();

	}

}
