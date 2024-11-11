import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class APITest {

    @Test
    public void getPostsTest() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        
        given()
                .when()
                .get("/posts")
                .then()
                .statusCode(200)
                .body("size()", greaterThan(0))
                .body("title[0]", notNullValue());
    }

    @Test
    public void createPostTest() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        String requestBody = "{\n" +
                "  \"title\": \"foo\",\n" +
                "  \"body\": \"bar\",\n" +
                "  \"userId\": 1\n" +
                "}";
        
        Response response = given()
                .header("Content-type", "application/json")
                .body(requestBody)
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                .body("title", equalTo("foo"))
                .body("body", equalTo("bar"))
                .body("userId", equalTo(1))
                .extract().response();

        System.out.println("Response: " + response.asString());
    }

    @Test
    public void updatePostTest() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        String requestBody = "{\n" +
                "  \"title\": \"updated title\"\n" +
                "}";
        
        given()
                .header("Content-type", "application/json")
                .body(requestBody)
                .when()
                .put("/posts/1")
                .then()
                .statusCode(200)
                .body("title", equalTo("updated title"));
    }

    @Test
    public void deletePostTest() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        
        given()
                .when()
                .delete("/posts/1")
                .then()
                .statusCode(200);
    }
}
