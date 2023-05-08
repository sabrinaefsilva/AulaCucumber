#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Login
Feature: Login
  Como ususario
  Quero realizar o logn
  Para acessar a conta

Background:Acessar a tela de login
Given que esteja na tela de login

  @Loginpositivo
  Scenario: login valido
    And preencher o usuario
    And preencher a senha
    When realizar o login
    Then login realizado com sucesso
   

 Scenario: user bloqueado
   But preencher com usuario bloqueado
   And preencher a senha
   When realizar o login
   Then sistema apresenta mensagem de ususario bloqueado
    
     Scenario: login com dados invalidos
   But preencher com usuario invalido
   But preencher a senha invalida
   When realizar o login
   Then sistema apresenta mensagem de ususario e senha invalida
    
    
     Scenario: login com dados em branco
   But não preencher nenhum dado
   When realizar o login
   Then sistema apresenta mensagem de dados em branco
  