package projetoApiRest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestGet {

	Response response;

	/*@Test
	public void testConsultarStatusCode() {
		response = RestAssured.get("https://reqres.in/api/users?page=2");
		assertEquals(200, response.getStatusCode());
	}*/
	
	@Test
	public void testConsultarEmail() {
		response = RestAssured.get("https://dadosabertos.camara.leg.br/api/v2/blocos?ordem=ASC&ordenarPor=nome");
		assertTrue(response.asPrettyString().contains("MDB, PSD, REPUBLICANOS, PODE, PSC"));
	}

}
