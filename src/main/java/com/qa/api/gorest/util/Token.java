package com.qa.api.gorest.util;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Token {
	public static Map<Object, Object> appTokenMap;
	public static Map<String, String> tokenMap = new HashMap<String , String>();
	public static String clientId = "e121815d9dc5514";
	
	public static Map<Object, Object> getAccessToken() {
		Map<String , String >formParams = new HashMap<String , String>();
		formParams.put("refresh_token", "733bad3231c6b51c6e2da3dc6bf367f2449a3ecf");
		formParams.put("client_id", "e121815d9dc5514");
		formParams.put("client_secret", "1c1a9a37044fe08ec372d33b8f823e745472e27c");
		formParams.put("grant_type", "refresh_token");
		
	JsonPath tokenJson = 	
		given()
		    .formParams(formParams)
		       .when()
		            .post("https://api.imgur.com/oauth2/token")
		                .then()
		                  .extract().jsonPath();
	
	System.out.println(tokenJson.getMap(""));
	appTokenMap = tokenJson.getMap("");  
	return appTokenMap;
	
	}
	public static Map<String, String> getAuthToken() {
		String authToken = appTokenMap.get("access_token").toString();
		System.out.println("Auth Token------->" + authToken);
		tokenMap.put("Authorization", "Bearer "+authToken);
		return tokenMap;
	}
	public static Map<String, String> getClientId() {
		System.out.println("Client id is ------->" + clientId);
		tokenMap.put("Authorization", "Client-ID "+clientId);
		return tokenMap;
	}

}
