package com.automation.api;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UserAuthenticationTest {

	APITestData apiTestData = new APITestData();
	
	  @Test public void apiRegisterLoginUser() { 
		  String token = apiTestData.getAPIToken();
		  RestAssured.baseURI = apiTestData.getBaseURI();
		  String username = apiTestData.generateRandomString();
		  String password = username;
		  RequestSpecification request = RestAssured.given();
		  JSONObject requestParams = new JSONObject();
		  requestParams.put("username", username); 
		  requestParams.put("password", password);
		  request.body(requestParams.toString());
		  request.header("Authorization", token); 
		  request.header("Accept", "application/json");
		  request.header("Content-Type", "application/json"); 
		  Response response = request.post("/auth/user/register"); 
	      Assert.assertEquals(response.getStatusCode(),200); 
	      
	      RequestSpecification request2 = RestAssured.given();
		  JSONObject requestParams2 = new JSONObject();
		  requestParams2.put("username", username); 
		  requestParams2.put("password", password);
		  request2.body(requestParams2.toString());
		  request2.header("Authorization", token); 
		  request2.header("Accept", "application/json");
		  request2.header("Content-Type", "application/json"); 
		  Response response2 = request.post("/auth/user/login");
		  System.out.println("Response ::"+ response2.getBody().asString()); 
	      Assert.assertEquals(response2.getStatusCode(),200);
	  }
}
