package steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ValidarMenu {
	
	HomePages home = HomePages();
	Metodos metodo = Metodos();
	
	
	@Before
	public void iniciarTeste()  {
		metodo.abrirNavegador();
		
	}
	@Test
	public void testeAssessarOMenu() {
		metodo.menuPricipal("Calcados");
	}

}
