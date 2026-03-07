package stepdefinitions;

import org.testng.Assert;

import driver.DriverManager;
import io.cucumber.java.en.Then;
import pages.DownloadPage;

public class ContentSteps {

	DownloadPage download;

	@Then("Download links should redirect correctly")

	public void validateDownloadLinks() {

		download = new DownloadPage(DriverManager.getDriver());

		Assert.assertTrue(download.validateAppStoreLink());

		Assert.assertTrue(download.validateGooglePlayLink());

	}

}
