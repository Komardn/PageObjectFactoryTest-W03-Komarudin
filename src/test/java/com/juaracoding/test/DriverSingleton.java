
package com.juaracoding.test;

import org.openqa.selenium.WebDriver;

public class DriverSingleton {
    private static WebDriver driver;

    private DriverSingleton() {}

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = BrowserManager.initializeDriver("chrome");
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
