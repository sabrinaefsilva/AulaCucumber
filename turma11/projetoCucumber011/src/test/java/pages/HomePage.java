package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class HomePage {

	Metodos metodo = new Metodos();
	By usuario = By.id("user-name");
	By senha = By.id("password");
	By btnLogin = By.id("login-button");
	By msgError = By.xpath("//h3[@data-test='error']");
	

	public void login(String usuario, String senha, String texto) {

		metodo.escrever(this.usuario, usuario);
		metodo.escrever(this.senha, senha);
		metodo.clicar(btnLogin);
		if (texto.equals("Swag Labs")) {
			metodo.validarTitle(texto);
		} else {
			metodo.validarTexto(msgError, texto);
		}
	}

	
}
