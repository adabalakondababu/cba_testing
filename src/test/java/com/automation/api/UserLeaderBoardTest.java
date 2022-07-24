package com.automation.api;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation.api.APITestData;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UserLeaderBoardTest {

	APITestData apiTestData = new APITestData();
	
	  @Test public void apiUserLeaderBoard() { 
		  String token = apiTestData.getAPIToken();
		  RestAssured.baseURI = apiTestData.getBaseURI();
		  String username = apiTestData.generateRandomString();
		  RequestSpecification request = RestAssured.given();
		  JSONObject requestParams = new JSONObject();
		  requestParams.put("username", username); 
		  requestParams.put("score", 100);
		  request.body(requestParams.toString());
		  request.header("Authorization", token); 
		  request.header("Accept", "application/json");
		  request.header("Content-Type", "application/json"); 
		  Response response = request.post("/v1/user"); 
	      Assert.assertEquals(response.getStatusCode(),201); 
	      
	      RequestSpecification request2 = RestAssured.given();
		  JSONObject requestParams2 = new JSONObject();
		  requestParams2.put("username", username); 
		  requestParams2.put("score", 2000);
		  request2.body(requestParams2.toString());
		  request2.header("Authorization", token); 
		  request2.header("Accept", "application/json");
		  request2.header("Content-Type", "application/json"); 
		  Response response2 = request2.put("/v1/user"); 
	      Assert.assertEquals(response2.getStatusCode(),204);
	      
	      RequestSpecification request3 = RestAssured.given();
		  request3.header("Authorization", token); 
		  request3.header("Accept", "application/json"); 
		  Response response3 = request3.get("/v1/user");
		  System.out.println("Response ::"+ response3.getBody().asString()); 
	      Assert.assertEquals(response3.getStatusCode(),200);
	  }
}
