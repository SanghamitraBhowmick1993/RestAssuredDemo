package com.backend.tests;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class GetCall {

	@Test
	public void GetBooksDetails() { 
		RestAssured.baseURI="https://demoqa.com/BookStore/v1/Books";
		// Get the RequestSpecification of the request to be sent to the server. 
		RequestSpecification httpRequest = 	RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		System.out.println("response code : " + response.getStatusCode());
		System.out.println("response : " + response.prettyPrint());

	}

}
