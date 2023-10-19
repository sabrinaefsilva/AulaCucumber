package steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pages.HomePage;
import runner.Navegadores;

public class LoginTest {
	
	HomePage page = new HomePage();
	String usuario = "standart user";
	String usuarioBloqueado = "locked_out_user";
	String usuarioInvalido = "problem_user";
	String senhaInvalida= "senhainvalida";
	String senha = "secret_sauce";
	
	@Before
	public void iniciarTeste() {
		Navegadores.abriNavegador();
	}
	@After
	public void finalizarTeste() {
		Navegadores.fecharNavegador();
	}
	
	@Test
	public void testUsuarioBranco() {
		page.login("", senha, "Epic sadface: Username is required");
	}
	
	@Test
	public void testSenhaBranco() {
		page.login(usuario, "", "Epic sadface: Password is required");
	}
	
	@Test
	public void testUsuarioInvalido() {
		page.login(usuarioInvalido, senha, "Epic sadface: Username and password do not match any user in this service");
	}
	
	@Test
	public void testSenhaInvalida() {
		page.login(usuario, senhaInvalida, "Epic sadface: Username and password do not match any user in this service");
	}
	
	@Test
	public void testUsuarioBloqueado() {
		page.login(usuarioBloqueado, senha, "Epic sadface: Sorry, this user has been locked out.");
	}
	
	@Test
	public void loginSucesso() {
		page.login(usuario, senha, "Swag Labs");

	}

}
