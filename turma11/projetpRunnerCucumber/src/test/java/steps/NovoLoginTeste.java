package steps;

import browsers.Navegadores;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NovoLoginTeste {

	@Given("que nao esteja logado")
	public void queNaoEstejaLogado() {
		Navegadores.abrirNavegador();
	}

	@Given("informar usuario")
	public void informarUsuario() {

	}

	@Given("informar senha")
	public void informarSenha() {

	}

	@When("clicar no botao login")
	public void clicarNoBotaoLogin() {

	}

	@Then("login realizado com sucesso")
	public void loginRealizadoComSucesso() {

	}

	@Given("informar senha invalida")
	public void informarSenhaInvalida() {

	}

	@Then("login nao realizado com mensagem de senha invalida")
	public void loginNaoRealizadoComMensagemDeSenhaInvalida() {

	}

}
