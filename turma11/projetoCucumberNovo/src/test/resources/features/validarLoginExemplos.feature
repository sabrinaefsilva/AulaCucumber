#language: pt

Funcionalidade: Historia de Login

	Como usuario
	Quero informar o meu usuario e senha
	Para acessar a pagina de login 
	
	Contexto: Acessar a tela de login
	Dado que esteja na tela de login
	
	
	Cenario: Login
	Quando inserir o <usuario> 
	E inserir a <senha>
	E clicar no botao login
	Entao sou direcionado para pagina principal da minha conta
	
	Exemplos:
	|usuario        |senha         |
	|"standart_user"|"secret_sauce"|
	|"errado"       |"secret_sauce"|
	|" "	          |" "           |