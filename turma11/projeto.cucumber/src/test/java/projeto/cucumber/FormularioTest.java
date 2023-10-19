package projeto.cucumber;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FormularioTest {

	WebDriver driver;
	@Given("que esteja no formulario")
	public void que_esteja_no_formulario() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}

	@When("enviar todos os dados preenchidos")
	public void enviar_todos_os_dados_preenchidos() {
		driver.findElement(By.id("username")).sendKeys("Teste E2E");
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).click();

		
	}

	@Then("formulario enviado com sucesso")
	public void formulario_enviado_com_sucesso() {
		String  textoEsperado = "";
		String capturado;
		assertEquals(0, 0);
		
	}

	@Given("preenche o campo full name")
	public void preenche_o_campo_full_name() {

	}

	@Given("prennche o campo current address")
	public void prennche_o_campo_current_address() {

	}

	@Given("preenche o campo permanent address")
	public void preenche_o_campo_permanent_address() {

	}

	@When("clicar no botao submit")
	public void clicar_no_botao_submit() {

	}
}
