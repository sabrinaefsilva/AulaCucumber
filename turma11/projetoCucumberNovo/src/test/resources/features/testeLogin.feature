#language: pt

Funcionalidade: Historia de Login

	Como usuario
	Quero informar o meu usuario e senha
	Para acessar a pagina de login 
	
	
	Cenario: Login com sucesso
	Dado que esteja na tela de login
	Quando inserir o meu nome de usuario 
	E inserir a minha senha
	E clicar no botao login
	Entao sou direcionado para pagina principal da minha conta
	
	Cenario: Login de usuario errado
	Dado que esteja na tela de login
	Mas inserir o nome de usuario errado
	E inserir a senha 
	Quando clicar no botao login
	Entao recebo mensagem de usuario invalido
	
	