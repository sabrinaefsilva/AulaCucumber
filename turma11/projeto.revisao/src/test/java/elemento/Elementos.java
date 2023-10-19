package elemento;

import org.openqa.selenium.By;

public class Elementos {

	private By user = By.id("user-name");
	private By password = By.id("password");
	private By btnLogin = By.id("login-button");
	private By AdicionarCarrinho= By.id("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
	
		
	public By getUser() {

		return user;
	}

	public By getPassword() {

		return password;
	}

	public By getbtnLogin() {

		return btnLogin;
	}

	public By GetAdicionarCarrinho() {

		return AdicionarCarrinho;
	}
}
