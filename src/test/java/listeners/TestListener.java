package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import driver.DriverManager;
import utils.ScreenshotUtil;

public class TestListener implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {

		ScreenshotUtil.captureScreenshot(DriverManager.getDriver(), result.getName());

	}

}
