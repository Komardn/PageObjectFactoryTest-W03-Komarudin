
package com.juaracoding.test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotHelper {
    public static void takeScreenshot(WebDriver driver, String testName) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        try {
            FileUtils.copyFile(scrFile, new File("screenshots/" + testName + "_" + timestamp + ".png"));
        } catch (IOException e) {
            System.out.println("Error saving screenshot: " + e.getMessage());
        }
    }
}
