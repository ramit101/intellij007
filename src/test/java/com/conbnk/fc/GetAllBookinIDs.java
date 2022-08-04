package com.conbnk.fc;

import com.conbnk.genericlib.RestBaseClass;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import restClient.RestTemplate;

public class GetAllBookinIDs extends RestBaseClass{

    @Test
    public void getAllBookingIds(){
        RestTemplate.get(requestSpec);
    }

    @Test
    public void getBookingsByName(){
        RestTemplate.get(requestSpec,"lakshya","sarma");
    }

    @Test
    public void getAllBookingsById(){

        requestSpec.basePath("{id}");
        RestTemplate.get(requestSpec,6711);
    }

}
