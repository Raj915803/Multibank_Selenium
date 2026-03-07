package utils;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class SessionManager {

	public static void injectLoginSession(WebDriver driver) {

		String token = APILoginManager.getToken();

		driver.get("https://trade.mb.io");

		Cookie cookie = new Cookie("auth_token", token);

		driver.manage().addCookie(cookie);

		driver.navigate().refresh();

	}

}
