
package com.juaracoding.test.tests;

import com.juaracoding.test.*;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginTest extends BaseTest {

    @Test(description = "Login valid ke Saucedemo")
    public void testValidLogin() {
        App.loginPage.login("standard_user", "secret_sauce");
        WebElement inventoryTitle = driver.findElement(By.className("title"));
        Assert.assertEquals(inventoryTitle.getText(), "Products", "Login gagal: Tidak muncul halaman produk");
    }
}
