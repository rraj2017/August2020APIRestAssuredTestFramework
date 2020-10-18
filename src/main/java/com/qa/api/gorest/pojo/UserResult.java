package com.qa.api.gorest.pojo;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.qa.api.gorest.restclient.RestClient;
import com.qa.api.gorest.util.TestUtil;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class UserResult {
	@Test
	public void createUserWithFullJson() {
	String token ="37506b4aded366d402530120898de28009f227ba0294b2bc59db951b0b5ed8f9";
	Self sf = new Self("http://www.sf.com");
	Edit ed = new Edit("http://www.ed.com");
	Avatar av = new Avatar("http://www.av.com");
	Links ln = new Links(sf, ed, av);
	
	UserInfo uf = new UserInfo("Tom1101", "Male", "01-01-1996", "ritu.1051@gmail.com", "5869345687", "http://www.example.com", "12tth avneu 48488", "Active", ln);
	
	String userJsonPayload = TestUtil.getSerializedJSON(uf);
	System.out.println(userJsonPayload);
	Map<String , String> authTokenMap = new HashMap<String , String>();
	authTokenMap.put("Authorization", "Bearer "+ token);
//	Response response = RestClient.doPost("JSON", "https://gorest.co.in", "/public-api/users", authTokenMap, null, true, userJsonPayload);
//	System.out.println(response.getStatusCode());
//	System.out.println(response.prettyPrint());
	
	RestAssured.baseURI = "https://gorest.co.in";
	given().log().all()
    .contentType("application/json")
    .header("Authorization" , "Bearer "+ token)
	.body(userJsonPayload)
	   .post("/public-api/users")
	 .then()
	    .assertThat()
	       .contentType(ContentType.JSON)
	    .statusCode(200);
	
	
	}
}
