package placeholder.control;

import io.restassured.http.ContentType;
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
                .get(Environment.localhost + Endpoint.posts)
                .then()
                .statusCode(HttpStatus.SC_OK);
    }

    // Get a post by pots id
    public static void getPostById(String postId) {
        given()
                .pathParam("_id", postId)
                .get(Environment.localhost + Endpoint.postsId)
                .then()
                .statusCode(HttpStatus.SC_OK);
    }

    // Create a post
    public static String createPost(PostDTO postDTO, Integer statusCode) {
        return given()
                .body("{\n" +
                        "  \"title\": \"" + postDTO.getTitle() + "\",\n" +
                        "  \"body\": " + postDTO.getBody() + ",\n" +
                        "  \"userId\": \"" + postDTO.getUserId() + "\",\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post(Environment.localhost + Endpoint.posts)
                .then()
                .statusCode(statusCode)
                .extract().path("_id");
    }

    // Update a post

    // Delete a post

}