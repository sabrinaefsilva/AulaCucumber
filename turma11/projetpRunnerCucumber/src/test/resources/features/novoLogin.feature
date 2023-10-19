@regressivos
Feature: Realizaum Login na conta
  Como usuario da aplicação 
  Quero informar os dados de login 
  Para acessar a conta

  @positivo
  Scenario: Login com sucesso
    Given que nao esteja logado
    And informar usuario
    And informar senha
    When clicar no botao login
    Then login realizado com sucesso

  @negativo
  Scenario: Login com senha invalida
    Given que nao esteja logado
    And informar usuario
    And informar senha invalida
    When clicar no botao login
    Then login nao realizado com mensagem de senha invalida
