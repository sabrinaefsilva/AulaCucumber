
Feature: Tlogin de usuario
  Como usuario do sistema saucedemo
	Quero enviar os dados de login
	Para acessar a minha conta
  
  Scenario: Login de usuario 
    Given que esteja na tela de login
    And preencher o nome 
    And preencher a senha 
    And clicar no botao login
    Then acesso a conta 
    

 