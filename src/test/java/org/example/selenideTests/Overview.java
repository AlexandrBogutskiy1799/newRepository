package org.example.selenideTests;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Overview extends BaseTest {
    private static final double price = 17.98;
    private static final double tax = 1.44;
    private final SelenideElement finishButton = $x("//button[@name = 'finish']");


    public void taxScore() {
        System.out.println("Tax =" + tax / price * 100 + "%");
        finishButton.click();
    }

}

