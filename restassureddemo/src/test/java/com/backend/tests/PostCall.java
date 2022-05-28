package com.backend.tests;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostCall {
	@Test
	public void PostBooksDetails() { 
		RestAssured.baseURI="https://demoqa.com/BookStore/v1/Books";
		RequestSpecification request =  RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("userId", "TQ123");
		requestParams.put("isbn", "9781449325862");
		request.header("Content-Type", "application/json");
		request.body(requestParams.toString());
		
		Response response = request.post("/BookStoreV1BooksPost");
		System.out.println("status code : " + response.getStatusCode());
		System.out.println("body : " +response.getBody().toString());
		Assert.assertEquals(response.getStatusCode(), 200);
		
		
	}
}
