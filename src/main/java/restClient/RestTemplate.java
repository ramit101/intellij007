package restClient;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RestTemplate {
    public static void get(RequestSpecification requestSpecification){
        RestAssured.given()
                .spec(requestSpecification)

                .when()
                .get()

                .then()
                .log()
                .all();
    }

    public static void get(RequestSpecification requestSpecification,int bookingId){
        RestAssured.given()
                .spec(requestSpecification)
                .pathParam("id",bookingId)

                .when()
                .get()

                .then()
                .log()
                .all();
    }

    public static void get(RequestSpecification requestSpecification,String firstName,String lastName ){
        RestAssured.given()
                .spec(requestSpecification)
                .queryParam("firstname",firstName)
                .queryParam("lastname",lastName)

                .when()
                .get()

                .then()
                .log()
                .all();
    }

    public static void post(RequestSpecification requestSpecification){
        RestAssured.given()
                .spec(requestSpecification)

                .when()
                .post()

                .then()
                .log()
                .all();
    }
}
