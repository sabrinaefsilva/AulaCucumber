@formulario
Feature: Validar formulario de usuario

  Como usuario
  Quero enviar formulario
  Para validar o envio

	Scenario: Enviar formulario
	   Given que esteja no formulario
	   And preencho o nome
	   And preencho o sobrenome
	   And preencho o data de nascimento
	   And preencho o Rg
	   And preencho o cpf
	   And preencho o rua
	   And preencho o numero
	   And preencho o bairro
	   And preencho o estado
	   And preencho o cidade
	   And preencho o cep
	   And preencho o email
	   And preencho o login de usuario
	   And preencho o senha
	   And preencho o confirma senha
	   When enviar 
	   Then formulario enviado com sucesso
