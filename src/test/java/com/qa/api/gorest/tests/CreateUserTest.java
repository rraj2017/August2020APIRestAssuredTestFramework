package com.qa.api.gorest.tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.api.gorest.pojo.User;
import com.qa.api.gorest.restclient.RestClient;
import com.qa.api.gorest.util.ExcelUtil;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.response.Response;
/**
 * 
 * @author RituRaj
 *
 */
@Epic("create user go rest api feature implementation......")
@Feature("create user api feature...")
public class CreateUserTest {
	String baseURI = "https://gorest.co.in";
	String basePath = "/public-api/users/";
	String token = "37506b4aded366d402530120898de28009f227ba0294b2bc59db951b0b5ed8f9";
	
	@DataProvider
	public Object[][] getUserData() {
		Object userData[][] = ExcelUtil.getTestData("userdata");
		return userData;
	}
	@Description("create a user api test....verify create user from post call...")
	@Severity(SeverityLevel.BLOCKER)
	@Test(dataProvider = "getUserData")
	public void createUserAPIPOSTTest(String name , String gender , String dob ,String email , String phonenumber , String website , String address , String status) {
		Map<String , String > authTokenMap = new HashMap<String ,String>();
		authTokenMap.put("Authorization", "Bearer "+token);
		
//		User user = new User("shreeju", "Female" ,"23-02-2017","shreeja@gmail.com","8847587654","https://shreeja.com","Sector 49 Noida", "Active");
		User user = new User(name , gender , dob , email , phonenumber , website , address , status);
		Response response = RestClient.doPost("JSON", baseURI, basePath, authTokenMap, null, true, user);
		System.out.println(response.getStatusCode());
		System.out.println(response.prettyPrint());
		System.out.println("..............................");

	}

}
