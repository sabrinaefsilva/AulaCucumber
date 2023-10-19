#language: pt

Funcionalidade: Historia de Login

	Como usuario
	Quero informar o meu usuario e senha
	Para acessar a pagina de login 
	
	Contexto: Acessar a tela de login
	Dado que esteja na tela de login
	
	
	Cenario: Login com sucesso
	Quando inserir o "standart_user" 
	E inserir a minha "secret_sauce"
	E clicar no botao login
	Entao sou direcionado para pagina principal da minha conta
	
	Cenario: Login de usuario errado
	Mas inserir o nome de usuario "errado"
	E inserir a "secret_sauce" 
	Quando clicar no botao login
	Entao recebo mensagem de usuario invalido
	
	