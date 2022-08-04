package com.conbnk.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BookerApi {

    @Test
    public void test1(){
      RestAssured.baseURI ="https://restful-booker.herokuapp.com";
        Response response = given()
                .when()
                .get("booking/9");

        String firstname = response.jsonPath().get("firstname");
        String lastname = response.jsonPath().get("lastname");
        System.out.println("********"+firstname+"*********"+lastname);
       // response.then().log().all();

        ObjectMapper objmap = new ObjectMapper();
       // objmap.readValues(new file("./abc.json"))



    }
}
