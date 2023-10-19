package steps;

import HomePage.BuscarCepEndereco;
import HomePage.Resultado;
import config.inicializarTeste;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuscaCepTeste {

	BuscarCepEndereco home = new BuscarCepEndereco();
	Resultado resultado = new Resultado();
	

	@Given("que esteja na tela inicial")
	public void que_esteja_na_tela_inicial() {
	  inicializarTeste.abrirNavegador();;
	}

	@When("pesquisar o cep desejado")
	public void pesquisar_o_cep_desejado() {
		home.buscarCepEndereco("06544-300");
	}

	@Then("valido as informacoes de retorno")
	public void valido_as_informacoes_de_retorno() {
		resultado.validarBuscaCepEndereco("Avenida dos Parques (Alphasítio)","Tamboré","Santana de Parnaíba/SP","06544-300");
	}

}
