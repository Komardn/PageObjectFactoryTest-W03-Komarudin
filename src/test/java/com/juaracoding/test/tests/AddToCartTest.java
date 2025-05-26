
package com.juaracoding.test.tests;

import com.juaracoding.test.*;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AddToCartTest extends BaseTest {

    @Test(description = "Tambah satu produk ke cart")
    public void testAddToCart() {
        App.loginPage.login("standard_user", "secret_sauce");
        App.homePage.addToCart();
        App.homePage.goToCart();

        WebElement cartTitle = driver.findElement(By.className("title"));
        Assert.assertEquals(cartTitle.getText(), "Your Cart", "Cart gagal: Tidak muncul halaman keranjang");
    }
}
