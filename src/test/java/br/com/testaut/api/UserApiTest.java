package br.com.testaut.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserApiTest extends ApiTestBase {

    @Test
    void getUserById() {
        Response response = RestAssured
                .given()
                .get("/users/1")
                .then()
                .extract()
                .response();

        assertEquals(200, response.statusCode());
        assertEquals("Leanne Graham", response.jsonPath().getString("name"));
    }
}