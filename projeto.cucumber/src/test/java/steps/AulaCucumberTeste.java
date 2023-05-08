package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import runner.Executa;

public class AulaCucumberTeste {
	@Before
	public void iniciarTeste() {
		Executa.abrirNavegador();
	}

	@Given("que esteja no formulario")
	public void queEstejaNoFormulario() {

	}

	@When("preencher s informacoes")
	public void preencherAsIformacoes() {

	}

	@Then("formulario enviado")
	public void formularioEnviado() {

	}
}
