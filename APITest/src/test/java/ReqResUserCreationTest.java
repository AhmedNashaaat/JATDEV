import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

public class ReqResUserCreationTest {

    @Test
    public void testUserCreation() {
        // Base URL
        RestAssured.baseURI = "https://reqres.in/api";

        // Create JSON request body
        String requestBody = "{\n" +
                "    \"name\": \"John Doe\",\n" +
                "    \"job\": \"Software Engineer\"\n" +
                "}";

        // Send POST request and validate response
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post("/users");

        // Assert status code is 201 (Created)
        response.then().statusCode(201);

        // Validate response body contains expected fields with correct values
        response.then()
                .body("id", notNullValue()) // Verify id exists and is not null
                .body("name", equalTo("John Doe")) // Verify name matches
                .body("job", equalTo("Software Engineer")); // Verify job matches

        // Print response for debugging
        System.out.println("Response Body: " + response.getBody().asString());

        // Alternatively, you can use JsonPath to extract specific values
        String userId = response.jsonPath().getString("id");
        System.out.println("Created User ID: " + userId);
    }
}