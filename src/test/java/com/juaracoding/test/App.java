
package com.juaracoding.test;

import com.juaracoding.test.pages.*;

public class App {
    public static LoginPage loginPage;
    public static HomePage homePage;
    public static CheckoutPage checkoutPage;

    public static void initializePage() {
        loginPage = new LoginPage(DriverSingleton.getDriver());
        homePage = new HomePage(DriverSingleton.getDriver());
        checkoutPage = new CheckoutPage(DriverSingleton.getDriver());
    }
}
