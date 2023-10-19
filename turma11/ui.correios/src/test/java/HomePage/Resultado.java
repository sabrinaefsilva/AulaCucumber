package HomePage;

import org.openqa.selenium.By;

import metodos.Metodos;

public class Resultado {

	Metodos metodo = new Metodos();

	By logradouroNome = By.xpath("//td[@data-th='Logradouro/Nome']");
	By bairroDistrito = By.xpath("//td[@data-th='Bairro/Dristrito']");
	By localidadeUF = By.xpath("//td[@data-th='Localidade/UF']");
	By cep = By.xpath("//td[@data-th='CEP']");

	public void validarBuscaCepEndereco(String logradouroNome,String bairroDistrito,String localidadeUF, String cep ) {
		metodo.mudarAba();
		metodo.validarTexto(this.logradouroNome, logradouroNome);
		metodo.validarTexto(this.bairroDistrito, bairroDistrito);
		metodo.validarTexto(this.localidadeUF, localidadeUF);
		metodo.validarTexto(this.cep, cep);

	}
	

}
