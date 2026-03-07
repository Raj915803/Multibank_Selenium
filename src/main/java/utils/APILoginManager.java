package utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;
import java.util.Map;

public class APILoginManager {

	public static String getToken() {

		Map<String, Object> data = JsonDataReader.getTestData();

		Map loginData = (Map) data.get("login");

		String email = loginData.get("email").toString();
		String password = loginData.get("password").toString();

		JSONObject request = new JSONObject();

		request.put("email", email);
		request.put("password", password);

		Response response = RestAssured.given().header("Content-Type", "application/json").body(request.toString())
				.post("https://trade.mb.io/");

		String token = response.jsonPath().getString("token");

		return token;

	}

}
