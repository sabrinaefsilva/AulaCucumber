package projetoApiRest;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestPost {
	
	
	@Test
	public void incluirUser() {
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type","application/json");
		JSONObject json = new JSONObject();
		json.put("name", "E2E");
		json.put("job", "Test Specialist");
		request.body(json.toJSONString());
		Response response = request.post("https://reqres.in/api/users");
		System.out.println(response.asPrettyString());
		//desafio guardar o id em uma variável	
	}
}
