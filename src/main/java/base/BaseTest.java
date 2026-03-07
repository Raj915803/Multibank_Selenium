package base;

import driver.DriverManager;
import utils.ConfigReader;

public class BaseTest {

	public void setUp() {

		DriverManager.initDriver();

		DriverManager.getDriver().get(ConfigReader.getProperty("baseUrl"));

	}

	public void tearDown() {

		DriverManager.quitDriver();

	}

}
