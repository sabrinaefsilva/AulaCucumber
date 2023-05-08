package metodos;

import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTeste {

	Metodos metodos = new Metodos();
	By username = By.id("user-name");
	By password = By.id("password");
	By btnLogin = By.id("login-button");

	String userNameValido = "standart_user";
	String passwordValido = "secret_sauce";
	String urlLoginValido = "https://www.saucedemo.com/inventory.html";

	@Before
	public void antesDoTeste() {
		metodos.abrirNavegador();
	}

	@After
	public void depoisDoTeste() {
		metodos.fecharNavegador();
	}

	@Test
	public void loginValido() {
		metodos.abrirNavegador();
		metodos.preencher(username, userNameValido);
		metodos.password(password, passwordValido);
		metodos.clicar(btnLogin);
		metodos.validarurl(urlLoginValido);
		metodos.fecharNavegador();
		metodos.evidencia("ct - loginValido");
	}

	@Test
	public void UsuarioInvalido() {
		metodos.abrirNavegador();
		metodos.preencher(username, userNameValido);
		metodos.password(password, passwordValido);
		metodos.clicar(btnLogin);
		metodos.validarurl(urlLoginValido);
		metodos.fecharNavegador();
		metodos.evidencia("ct - UsuarioInvalido");
	}
	@Test
	public void loginEmBranco() {
		metodos.abrirNavegador();
		metodos.preencher(username, userNameValido);
		metodos.password(password, passwordValido);
		metodos.clicar(btnLogin);
		metodos.validarurl(urlLoginValido);
		metodos.fecharNavegador();
		metodos.evidencia("ct - loginEmBranco");
	}

}
