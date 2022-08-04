package com.conbnk.fc;

import com.conbnk.genericlib.RestBaseClass;
import com.conbnk.genericlib.TestData;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import pojo.BookingDates;
import pojo.CreateBookingPojo;
import restClient.RestTemplate;

public class CreateBooking extends RestBaseClass{
    CreateBookingPojo createBookingPojo = new CreateBookingPojo();
    BookingDates bookingDates = new BookingDates();


    @Test(description = "this will create a new booking",
            dataProvider = "booking data",dataProviderClass = TestData.class)
    public void createBooking(String firstname,String lastname,int totalprice,boolean depositpaid,String checkindate,
                              String checkoutdate,String additionalneeds){

        bookingDates.setCheckin(checkindate);
        bookingDates.setCheckout(checkoutdate);

        createBookingPojo.setFirstname(firstname);
        createBookingPojo.setLastname(lastname);
        createBookingPojo.setTotalprice(totalprice);
        createBookingPojo.setDepositpaid(depositpaid);
        createBookingPojo.setBookingdates(bookingDates);
        createBookingPojo.setAdditionalneeds(additionalneeds);

        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com/booking")
                .contentType("application/json")
                .body(createBookingPojo)
                .when()
                .post()
                .then()
                .log()
                .all();
    }

    @Test(description = "this will create a new booking",
            dataProvider = "booking data",dataProviderClass = TestData.class)
    public void createBookingTwo(String firstname,String lastname,int totalprice,boolean depositpaid,String checkindate,
                                 String checkoutdate,String additionalneeds){
        bookingDates.setCheckin(checkindate);
        bookingDates.setCheckout(checkoutdate);

        createBookingPojo.setFirstname(firstname);
        createBookingPojo.setLastname(lastname);
        createBookingPojo.setTotalprice(totalprice);
        createBookingPojo.setDepositpaid(depositpaid);
        createBookingPojo.setBookingdates(bookingDates);
        createBookingPojo.setAdditionalneeds(additionalneeds);

        requestSpec.body(createBookingPojo);

        RestTemplate.post(requestSpec);
    }
}
