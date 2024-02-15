package org.example.selenideTests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Basket extends BaseTest {
    private final SelenideElement check = $x("//div[contains(text(),'Description')]");
    private final SelenideElement purchase1 = $x("//div[contains(text(),'Sauce Labs Onesie')]");
    private final SelenideElement purchase2 = $x("//div[contains(text(),'Sauce Labs Bike Light')]");
    private final SelenideElement checkoutButton = $x("//button[contains(text(),'Checkout')]");
    private final SelenideElement checkVisible = $x("//span[contains(text(),'Your Information')]");

    public void checkProducts() {
        check.shouldBe(Condition.visible);
        purchase1.shouldBe(Condition.visible);
        purchase2.shouldBe(Condition.visible);
        checkoutButton.click();
        checkVisible.shouldBe(Condition.visible);

    }


}
