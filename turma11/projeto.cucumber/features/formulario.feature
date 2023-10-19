Feature: Validar text box do site demoqa
	Como Usuario
	Quero enviar os dados 
	Para validar o formulario de cadastro
	
	
	Scenario: Enviar formulario com dados preenchidos
	Given que esteja no formulario
	When enviar todos os dados preenchidos
	Then formulario enviado com sucesso
	
	
	Scenario: Formulario padrao imperativo
	Given que esteja no formulario
	And preenche o campo full name
	And prennche o campo current address
	And preenche o campo permanent address
	When clicar no botao submit
	Then formulario enviado com sucesso