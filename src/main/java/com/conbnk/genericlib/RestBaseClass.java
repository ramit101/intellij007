package com.conbnk.genericlib;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

public class RestBaseClass {
    protected static RequestSpecification requestSpec;

    @BeforeClass
    public void configBeforeClass(){

        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setBaseUri("https://restful-booker.herokuapp.com/booking");
        requestSpecBuilder.setContentType("application/json");

        requestSpec = requestSpecBuilder.build();


    }
}
