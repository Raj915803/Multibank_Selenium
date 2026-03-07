package stepdefinitions;

import org.testng.Assert;

import driver.DriverManager;
import io.cucumber.java.en.*;
import pages.TradingPage;

public class TradingSteps {

	TradingPage trading;

	@Given("User navigates to spot trading")

	public void openSpot() {

		trading = new TradingPage(DriverManager.getDriver());

		trading.openSpotTrading();

	}

	@Then("Trading pairs should be displayed")

	public void validatePairs() {

		Assert.assertTrue(trading.isTradingPairVisible());

	}

}
