@regressivo

  Feature: Administrar produtod no carrinho
  Como usuario do sistema
  Quero adminitrar ainclusao e exclusao de produtosdo carinho
  Para atualizar o carrinho de compra 
   
  Background: fazer login no sistema
  Given que nao esteja logado
  And informar o usuario
  And informar a senha
  And clicar no botao login 
  
  
  Scenario: incluir produto no carrinho com sucesso
    Given que esteja na tela de produtos 
    When clicar no botao adicionar no carrinho
    Then produto adicionado ao carrinho com sucesso


 Scenario: incluir mais de um produto no carrinho
    Given que esteja com um produto adicionado no carrinho
    When clicar adicionar no carrinho
    Then produto atualizado com a quantidade de produtos

  Scenario: remover produto do carrinho
    Given que tenha produto adicionado no carrinho
    When clicar no botao  no carrinho
    Then carrinho atualizado com a quantidade de produtos