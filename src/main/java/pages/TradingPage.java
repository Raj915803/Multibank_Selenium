package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TradingPage {

	WebDriver driver;

	By spotTab = By.linkText("Spot");

	By tradingPairs = By.cssSelector(".pair");

	public TradingPage(WebDriver driver) {

		this.driver = driver;

	}

	public void openSpotTrading() {

		driver.findElement(spotTab).click();

	}

	public boolean isTradingPairVisible() {

		return driver.findElements(tradingPairs).size() > 0;

	}

}
