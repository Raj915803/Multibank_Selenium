package stepdefinitions;

import base.BaseTest;
import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.SessionManager;

public class Hooks extends BaseTest {

	@Before
	public void setup() {

		setUp();

		/* Inject login session before test */

		SessionManager.injectLoginSession(DriverManager.getDriver());

	}

	@After
	public void tearDown() {

		DriverManager.quitDriver();

	}

}
