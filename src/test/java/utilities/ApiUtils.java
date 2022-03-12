package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class ApiUtils {


    public static void main(String[] args) {

        generateToken("simon@example.com", "Test123456!");
    }

        public static String generateToken(String email, String password){

        Map<String, Object>requestMap = new HashMap<>();
        requestMap.put("email", email);
        requestMap.put("password", password);


            Response response = given().contentType(ContentType.JSON).body(requestMap)
                    .when().post(ConfigurationReader.get("api_url") + "9001/api/auth/login");

            String token = response.path("data.token");

            String finalToken = "Bearer "+ token;
            System.out.println("finalToken = " + finalToken);

            return finalToken;
        }

}
