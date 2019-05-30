package com.testing.rest.assured.testing.controller.functional;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class SampleTest extends FunctionalTest {

    @Test
    void basicPingTest() {
        given().when().get("/test").then().statusCode(200);
    }
}
