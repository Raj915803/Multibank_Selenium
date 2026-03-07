package stepdefinitions;

import org.testng.Assert;

import driver.DriverManager;
import io.cucumber.java.en.Then;
import pages.HomePage;

public class NavigationSteps {

	HomePage home;

	@Then("Navigation menu should be visible")

	public void validateMenu() {

		home = new HomePage(DriverManager.getDriver());

		Assert.assertTrue(home.isNavigationDisplayed());

	}

}
