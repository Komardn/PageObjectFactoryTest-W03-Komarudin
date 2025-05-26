
package com.juaracoding.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = DriverSingleton.getDriver();
        driver.get("https://www.saucedemo.com/");
        App.initializePage();
    }

    @AfterMethod
    public void tearDown() {
        DriverSingleton.quitDriver();
    }
}
