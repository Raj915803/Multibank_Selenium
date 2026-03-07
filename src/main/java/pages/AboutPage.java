package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutPage {

	WebDriver driver;

	By aboutMenu = By.linkText("About");

	By whyMultibank = By.linkText("Why MultiBank");

	By pageHeader = By.tagName("h1");

	public AboutPage(WebDriver driver) {

		this.driver = driver;

	}

	public void openWhyMultiBank() {

		driver.findElement(aboutMenu).click();
		driver.findElement(whyMultibank).click();

	}

	public boolean isWhyMultiBankPageDisplayed() {

		return driver.findElement(pageHeader).getText().contains("MultiBank");

	}

}
