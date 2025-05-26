package com.juaracoding.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserManager {
    public static WebDriver initializeDriver(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            options.addArguments("--disable-notifications");
            options.addArguments("disable-infobars");
            options.addArguments("--disable-password-manager-reauthentication");
            options.addArguments("--disable-blink-features=AutomationControlled");

            WebDriver driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            return driver;
        }
        throw new IllegalArgumentException("Unsupported browser: " + browser);
    }
}
