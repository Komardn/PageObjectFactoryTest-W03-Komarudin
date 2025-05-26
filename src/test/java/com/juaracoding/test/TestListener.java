
package com.juaracoding.test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.WebDriver;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        WebDriver driver = DriverSingleton.getDriver();
        ScreenshotHelper.takeScreenshot(driver, result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        WebDriver driver = DriverSingleton.getDriver();
        ScreenshotHelper.takeScreenshot(driver, result.getName());
    }

    // Optional: implement other methods as needed
    @Override public void onTestStart(ITestResult result) {}
    @Override public void onTestSkipped(ITestResult result) {}
    @Override public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}
    @Override public void onStart(ITestContext context) {}
    @Override public void onFinish(ITestContext context) {}
}
