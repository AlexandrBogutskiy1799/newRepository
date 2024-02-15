package org.example.selenideTests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CheckoutInformation extends BaseTest {
    private final SelenideElement inputFirst = $x("//input[@name = 'firstName']");
    private final SelenideElement inputLast = $x("//input[@name = 'lastName']");
    private final SelenideElement inputPost = $x("//input[@name = 'postalCode']");
    private final SelenideElement continueButton = $x("//input[@name = 'continue']");
    private final SelenideElement checkVisible = $x("//div//span[contains(text(),'Overview')]");
    private final static String firstName = "Alexandr";
    private final static String lastName = "Bohutskyi";
    private final static int postalCode = 41256;

    public void dataInput() {
        inputFirst.setValue(firstName);
        inputLast.setValue(lastName);
        inputPost.setValue(String.valueOf(postalCode));
        continueButton.click();
        checkVisible.shouldBe(Condition.visible);

    }


}
