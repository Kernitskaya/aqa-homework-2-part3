package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class PostRequestTest {
    @Test
    void testPostRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .body("some value")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("some data"))
        ;
    }
}
