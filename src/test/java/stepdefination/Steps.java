package stepdefination;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Steps {

	@Given("I want to write a step with precondition")
	public void  methodget(){		
	Response response = RestAssured.get("https://reqres.in/api/users?page=2");
	System.out.println(response.prettyPrint());
	System.out.println(response.getStatusCode());
	System.out.println(response.getTime());}
}
