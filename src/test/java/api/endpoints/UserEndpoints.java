//package api.endpoints;
//import static io.restassured.RestAssured.given;
//
//import api.payload.User;
//import io.restassured.http.ContentType;
//import io.restassured.response.Response;
//public class UserEndpoints {
//	
//	
//	public static Response createUser(User payload) {
//		
//	
//		Response response = 
//				given().contentType(ContentType.JSON)
//				.accept(ContentType.JSON)
//				.body(payload)
//		.when()
//		.post(Routes.post_url);
//		return response;
//				
//	}
//	
//	public static Response readUser(String userName)
//	{
//		Response response = 
//				given()
//					//.pathParam("username", userName)
//				.when()
//					.get(Routes.get_url);
//		return response;
//	}
//
//	public static Response updateUser(String userName, User payload)
//	{
//		Response response = 
//				given()
//					.contentType(ContentType.JSON)
//					.accept(ContentType.JSON)
//					.pathParam("username", userName)
//					.body(payload)
//				.when()
//					.put(Routes.delete_url);
//		return response;
//	}
//
//	public static Response deleteUser(String userName)
//	{
//		Response response = 
//				given()
//					.pathParam("username", userName)
//				.when()
//					.delete(Routes.delete_url);
//		return response;
//	}
//
//}

package api.endpoints;

import static io.restassured.RestAssured.given;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserEndpoints {

    // Method to create a user
    public static Response createUser(User payload) {
        Response response = 
                given()
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .body(payload)
                .when()
                    .post(Routes.post_url);
        return response;
    }

    // Method to get a user by username
    public static Response readUser(String userName) {
        Response response = 
                given()
                    .pathParam("username", userName)
                .when()
                    .get(Routes.get_url_by_username);
        return response;
    }

    // Method to get a user by ID
    public static Response readUserById(long userId) {
        Response response = 
                given()
                    .pathParam("id", userId)
                .when()
                    .get(Routes.get_url_by_id);  // New route to get user by ID
        return response;
    }

    // Method to get a user by email
    public static Response readUserByEmail(String email) {
        Response response = 
                given()
                    .queryParam("email", email)  // Assuming the API allows fetching user by email through query params
                .when()
                    .get(Routes.get_url_by_email);  // New route to get user by email
        return response;
    }

    // Method to update a user by username
    public static Response updateUser(String userName, User payload) {
        Response response = 
                given()
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .pathParam("username", userName)
                    .body(payload)
                .when()
                    .put(Routes.update_url);  // Fixed: previously used delete_url by mistake
        return response;
    }

    // Method to delete a user by username
    public static Response deleteUser(String userName) {
        Response response = 
                given()
                    .pathParam("username", userName)
                .when()
                    .delete(Routes.delete_url);
        return response;
    }
}
