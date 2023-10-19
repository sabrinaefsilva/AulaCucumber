package Page;

import org.openqa.selenium.By;

import metodo.Metodo;

public class HomePages {
	
	
	
	By user = By.id("user-name");
	By password = By.id("password");
	By btnLogin = By.id("login-button");
	By msgErro = By.xpath("//h3[text()='"+textoEsperado+"']");

	
	
	Metodo metodo = new Metodo();
	

	
		public void login(String user, String password,String textoEsperado){
			By msgErro = By.xpath("//h3[text()='"+textoEsperado+"']");
			metodo.escrever(this.user, user);
			metodo.escrever(this.password, password);
			metodo.clicar(this.btnLogin);
			if(textoEsperado.equals("Epic sadface: Username is required")||
			   textoEsperado.equals("Epic sadface: Username and password do not match any user in this service")) {
				metodo.validarTexto(msgErro, textoEsperado);
			}
			if(textoEsperado.equals("Swag Labs")) {
			metodo.validarTitle(textoEsperado);
			}
		}
		
	}
