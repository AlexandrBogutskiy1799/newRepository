package org.example.selenideTests;

import org.junit.jupiter.api.Test;


public class BaseTest {
    private final static String BASE_URL = "https://www.saucedemo.com/";


    @Test
    public void openSite() {
        FirstPage firstPage = new FirstPage(BASE_URL);
        firstPage.logIn();

        ChoicePage choicePage = new ChoicePage();
        choicePage.choiseItems();

        Basket basket = new Basket();
        basket.checkProducts();

        CheckoutInformation checkoutInformation = new CheckoutInformation();
        checkoutInformation.dataInput();

        Overview overview = new Overview();
        overview.taxScore();

        ThankYouForYourOrder thankYouForYourOrder = new ThankYouForYourOrder();
        thankYouForYourOrder.finalCheck();


    }


}
