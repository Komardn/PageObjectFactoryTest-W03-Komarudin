
package com.juaracoding.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartBtn;

    @FindBy(className = "shopping_cart_link")
    WebElement cartIcon;

    public void addToCart() {
        addToCartBtn.click();
    }

    public void goToCart() {
        cartIcon.click();
    }
}
