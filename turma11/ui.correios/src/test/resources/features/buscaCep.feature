@regressivo
Feature: validar cep e endereco no site do correios
     Como usuario do correios
     Quero informar cep ou endereco
     Para obter informacoes do endereco
  
  
Background: Acessar o site do correios
    Given que esteja na tela inicial
  
Scenario: Buscar e validar um cep
    When pesquisar o cep desejado
    Then valido as informacoes de retorno