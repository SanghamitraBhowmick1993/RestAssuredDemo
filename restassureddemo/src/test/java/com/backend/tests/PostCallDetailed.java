package com.backend.tests;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostCallDetailed {
	@Test
	public void PostDetail() { 
		String requestBody = "{\n"
				+ "   \"firstName\" : “Elon”,\n"
				+ "   \"lastName\" : “Mask”\n"
				+ "            \"salary\" : “8000”,\n"
				+ "            \"email\" : “testmail@gmail.com\n"
				+ "         }\n";
		
		
		RequestSpecification request = RestAssured.given();
		request.baseUri("http://localhost:8088");
		request.body(requestBody);
		request.contentType(ContentType.JSON);
		
		Response response = request.post("/employees");
		System.out.println(response.asString());
		
		
		
	}
}
