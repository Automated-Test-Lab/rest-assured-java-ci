package placeholder.control;

import org.apache.http.HttpStatus;
import placeholder.util.Endpoint;
import placeholder.util.Environment;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class Users {

    // Get all users
    public static void getUsers() {
        when()
                .get(Environment.localhost + Endpoint.users)
                .then()
                .statusCode(HttpStatus.SC_OK);
    }

    // Get a user by user id
    public static void getUserById(String userId) {
        given()
                .pathParam("_id", userId)
                .get(Environment.localhost + Endpoint.usersId)
                .then()
                .statusCode(HttpStatus.SC_OK);
    }

}
