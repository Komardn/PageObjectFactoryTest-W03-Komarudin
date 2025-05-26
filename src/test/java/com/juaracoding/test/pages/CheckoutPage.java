package com.juaracoding.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class CheckoutPage {
    private WebDriverWait wait;

    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(id = "checkout")
    WebElement checkoutBtn;

    @FindBy(id = "first-name")
    WebElement firstName;

    @FindBy(id = "last-name")
    WebElement lastName;

    @FindBy(id = "postal-code")
    WebElement postalCode;

    @FindBy(id = "continue")
    WebElement continueBtn;

    @FindBy(id = "finish")
    WebElement finishBtn;

    public void checkout(String fname, String lname, String zip) {
        checkoutBtn.click();
        firstName.sendKeys(fname);
        lastName.sendKeys(lname);
        postalCode.sendKeys(zip);
        continueBtn.click();

        wait.until(ExpectedConditions.elementToBeClickable(finishBtn));
        finishBtn.click();
    }
}
