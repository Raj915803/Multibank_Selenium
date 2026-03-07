package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	By navigationMenu = By.tagName("header");

	public HomePage(WebDriver driver) {

		this.driver = driver;

	}

	public boolean isNavigationDisplayed() {

		return driver.findElement(navigationMenu).isDisplayed();

	}

}
