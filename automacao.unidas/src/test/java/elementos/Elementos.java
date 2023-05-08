package elementos;

import org.openqa.selenium.By;

public class Elementos {

	public By botaoOk = By.xpath("//*[@id=\"cookieBar\"]/div/span[2]/a");
	public By minhasReservas = By.xpath("//a[@href=\"/minhas-reservas\"]");
	public By promocoesNome = By.xpath("//*[@id=\"footer-wrapper\"]/div[3]/div/div/div[2]/form/div[1]/input");
	public By promocoesEmail = By.xpath("//*[@id=\"footer-wrapper\"]/div[3]/div/div/div[2]/form/div[2]/input");
	public By botaoCadastrar = By.xpath("//*[@id=\\\"footer-wrapper\\\"]/div[3]/div/div/div[2]/form/div[3]");
    public By botaoOkFinal = By.xpath("//button[@style='display: inline-block;']");
}
