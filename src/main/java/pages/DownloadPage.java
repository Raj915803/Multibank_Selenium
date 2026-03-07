package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DownloadPage {

	WebDriver driver;

	By appStore = By.linkText("App Store");
	By googlePlay = By.linkText("Google Play");

	public DownloadPage(WebDriver driver) {

		this.driver = driver;

	}

	public boolean validateAppStoreLink() {

		return driver.findElement(appStore).isDisplayed();

	}

	public boolean validateGooglePlayLink() {

		return driver.findElement(googlePlay).isDisplayed();

	}

}
