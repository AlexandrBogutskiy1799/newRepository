package org.example.selenideTests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.example.selenideTests.BaseTest;

import static com.codeborne.selenide.Selenide.$x;

public class ThankYouForYourOrder extends BaseTest {
    private final SelenideElement check = $x("//h2[contains(text(),'Thank you for your order!')]");


    public void finalCheck() {
        check.shouldBe(Condition.visible);
    }
}
