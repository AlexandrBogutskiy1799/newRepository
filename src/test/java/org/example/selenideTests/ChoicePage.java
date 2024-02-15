package org.example.selenideTests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ChoicePage extends BaseTest {
    private final SelenideElement purchase1 = $x("//div[contains(text(),'Sauce Labs Onesie')]");
    private final SelenideElement add1 = $x("//button[contains(text(),'Add to cart')]");
    private final SelenideElement back = $x("//div//img[@alt='Go back']/ancestor::button");
    private final SelenideElement purchase2 = $x("//div[contains(text(),'Sauce Labs Bike Light')]");
    private final SelenideElement add2 = $x("//button[contains(text(),'Add to cart')]");
    private final SelenideElement backet = $x("//div//a[@class=\"shopping_cart_link\"]");



    public void choiseItems() {
        purchase1.click();
        add1.click();
        back.click();
        purchase2.click();
        add2.click();
        backet.click();
    }




}
