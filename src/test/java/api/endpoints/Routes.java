package api.endpoints;

public class Routes {

	/*
	 * Swagger URI --> https://petstore.swagger.io
	 * 
	 * Create user(Post) : https://petstore.swagger.io/v2/user Get user (Get):
	 * https://petstore.swagger.io/v2/user/{username} Update user (Put) :
	 * https://petstore.swagger.io/v2/user/{username} Delete user (Delete) :
	 * https://petstore.swagger.io/v2/user/{username}
	 * 
	 */

//	public static String base_url = "https://petstore.swagger.io/v2";
//
//	public static String post_url = base_url + "/user";
//	public static String get_url = base_url + "/user/{username}";
//	public static String update_url = base_url + "/user/{username}";
//	public static String delete_url = base_url + "/user/{username}";

	
	    // Base URL for the Petstore API
	    public static String base_url = "https://petstore.swagger.io/v2";

	    // Endpoints related to user operations
	    public static String post_url = base_url + "/user";               // Create user
	    public static String get_url_by_username = base_url + "/user/{username}";  // Get user by username
	    public static String get_url_by_id = base_url + "/user/id/{id}";  // New route: Get user by ID
	    public static String get_url_by_email = base_url + "/user/email"; // New route: Get user by email using query parameter

	    public static String update_url = base_url + "/user/{username}";  // Update user by username
	    public static String delete_url = base_url + "/user/{username}";  // Delete user by username

	//store Model
	
	//Pet Model 
	

}
