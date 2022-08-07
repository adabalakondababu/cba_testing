package com.automation.api;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AuthorizationTest {

	APITestData apiTestData = new APITestData();
	
	  @Test public void apiVerifyToken() { 
		  String token = apiTestData.getAPIToken();
		  RestAssured.baseURI = apiTestData.getBaseURI();
		  RequestSpecification request = RestAssured.given();
		  request.header("Authorization", token); 
		  request.header("Accept", "application/json");
		  Response response = request.get("/auth/verifytoken");
		  System.out.println("Response ::"+ response.getBody().asString()); 
	      Assert.assertEquals(response.getStatusCode(),200); 
	  }
}
