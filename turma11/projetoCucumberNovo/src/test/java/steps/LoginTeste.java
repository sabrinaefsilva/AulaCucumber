package steps;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.Metodos;
import runner.Navegadores;

public class LoginTeste {

	Metodos metodo = new Metodos();
	By usuario = By.id("user_name");
	
	@Dado("que esteja na tela de login")
	public void que_esteja_na_tela_de_login() {
		Navegadores.abrirNavegador();
		
	}

	@Quando("inserir o meu nome de usuario")
	public void inserir_o_meu_nome_de_usuario() {

	}

	@Quando("inserir a minha senha")
	public void inserir_a_minha_senha() {

	}

	@Quando("clicar no botao login")
	public void clicar_no_botao_login() {

	}

	@Entao("sou direcionado para pagina principal da minha conta")
	public void sou_direcionado_para_pagina_principal_da_minha_conta() {

	}

	@Dado("inserir o nome de usuario errado")
	public void inserir_o_nome_de_usuario_errado() {

	}

	@Dado("inserir a senha")
	public void inserir_a_senha() {

	}

	@Entao("recebo mensagem de usuario invalido")
	public void recebo_mensagem_de_usuario_invalido() {

	}
	@Quando("inserir o {string}")
	public void inserir_o(String string) {
	   
	}

	@Quando("inserir a minha {string}")
	public void inserir_a_minha(String string) {
	    
	}

	@Dado("inserir o nome de usuario {string}")
	public void inserir_o_nome_de_usuario(String string) {
	   
	}

	@Dado("inserir a {string}")
	public void inserir_a(String string) {
	  
	}

}