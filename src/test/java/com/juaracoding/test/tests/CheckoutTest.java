package com.juaracoding.test.tests;

import com.juaracoding.test.*;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.testng.Assert;

public class CheckoutTest extends BaseTest {

    @Test(description = "Checkout setelah add to cart")
    public void testCheckout() {
        App.loginPage.login("standard_user", "secret_sauce");
        App.homePage.addToCart();
        App.homePage.goToCart();
        App.checkoutPage.checkout("Komar", "Komar", "1");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("complete-header")));
        Assert.assertEquals(successMessage.getText(), "Thank you for your order!", "Checkout gagal: Teks sukses tidak muncul");
    }
}
