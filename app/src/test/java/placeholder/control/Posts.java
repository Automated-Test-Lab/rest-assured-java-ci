package placeholder.control;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import placeholder.model.PostDTO;
import placeholder.util.Endpoint;
import placeholder.util.Environment;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.is;

public class Posts {

    // Get all posts
    public static void getPosts() {
        when()
                .get(Environment.host + Endpoint.posts)
                .then()
                .statusCode(HttpStatus.SC_OK);
    }

    // Get a post by userId
    public static void getPostByUserId(String userId) {
        Response response = given()
                .pathParam("_id", userId)
                .get(Environment.host + Endpoint.postsId);

        // Verify the status code
        response.then()
                .statusCode(HttpStatus.SC_OK);

        // Print the response body to the terminal
        System.out.println(response.getBody().prettyPrint());
    }

    // Create a post
    public static void createPost(PostDTO postDTO, Integer statusCode) {

        String body = "{\n" +
                "  \"title\": \"" + postDTO.getTitle() + "\",\n" +
                "  \"body\": \"" + postDTO.getBody() + "\",\n" +
                "  \"userId\":" + postDTO.getUserId() + "\n" +
                "}";

        Response response = given()
                .body(body)
                .contentType(ContentType.JSON)
                .when()
                .post(Environment.host + Endpoint.posts)
                .then()
                .statusCode(statusCode)
                .extract().response();

        // Print the response body to the terminal
        System.out.println(response.getBody().prettyPrint());
    }

    // Update a post
    public static void updatePost(PostDTO postDTO, Integer statusCode, String userId) {

        String body = "{\n" +
                "  \"title\": \"" + postDTO.getTitle() + "\",\n" +
                "  \"body\": \"" + postDTO.getBody() + "\",\n" +
                "  \"userId\":" + postDTO.getUserId() + ",\n" +
                "  \"id\":" + postDTO.getId() + "\n" +
                "}";

        Response response = given()
                .body(body)
                .pathParam("_id", userId)
                .contentType(ContentType.JSON)
                .when()
                .put(Environment.host + Endpoint.put)
                .then()
                .statusCode(statusCode)
                .extract().response();

        // Print the response body to the terminal
        System.out.println(response.getBody().prettyPrint());
    }

    // Delete a post
    public static void deletePost(String postID) {
        Response response = given()
                .pathParam("_id", postID)
                .delete(Environment.host + Endpoint.postsId);

        // Verify the status code
        response.then()
                .statusCode(HttpStatus.SC_OK);

    }

}