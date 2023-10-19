package steps;

import elemento.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodo.Metodos;
import navegador.Navegadores;

public class incuirProdutoTeste {
	
	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();
	
	String usuario = "standard_user";
	String senha = "secret_sauce";

	@Given("que nao esteja logado")
	public void queNaoEstejaLogado() {
	   Navegadores.abrirNavegador();
	}
	@Given("informar o usuario")
	public void informarOUsuario() {
	    metodo.escrever(elemento.getUser(), usuario, "campo usuario");
	}
	@Given("informar a senha")
	public void informarASenha() {
	    metodo.escrever(elemento.getPassword(), senha, "campo senha");
	}
	@Given("clicar no botao login")
	public void clicarNoBotaoLogin() {
		metodo.clicar(elemento.getbtnLogin(), "botao login");
	}
	
	@Given("que esteja na tela de produtos")
	public void queEstejaNaTelaDeProdutos() {
	}

	@When("clicar no botao adicionar no carrinho")
	public void clicarNoBotaoAdicionarNoCarrinho() {
	    metodo.clicar(elemento.GetAdicionarCarrinho(), "botao adicionar carrinho");
	}
	@Then("produto adicionado ao carrinho com sucesso")
	public void produtoAdicionadoAoCarrinhoComSucesso() {
	   
	}
	
	@Given("que esteja com um produto adicionado no carrinho")
	public void queEstejaComUmProdutoAdicionadoNoCarrinho() {
	  
	}
	@When("clicar adicionar no carrinho")
	public void clicarAdicionarNoCarrinho() {
	    
	}
	@Then("produto atualizado com a quantidade de produtos")
	public void produtoAtualizadoComAQuantidadeDeProdutos() {
	  
	}
	

	@Given("que tenha produto adicionado no carrinho")
	public void queTenhaProdutoAdicionadoNoCarrinho() {
	   
	}
	@When("clicar no botao  no carrinho")
	public void clicarNoBotaoNoCarrinho() {

	}
	@Then("carrinho atualizado com a quantidade de produtos")
	public void carrinhoAtualizadoComAQuantidadeDeProdutos() {
	  
	}








}
