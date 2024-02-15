package org.example.selenideTests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;


public class FirstPage extends BaseTest {
    private final SelenideElement loginInput = $x("//div//input[@placeholder='Username']");
    private final SelenideElement passwordInput = $x("//div//input[@placeholder='Password']");
    private final SelenideElement OkButton = $x("//input[@value = 'Login']");
    private final SelenideElement check = $x("//span[contains(text(),'Products')]");
    private final static String USER_NAME = "standard_user";
    private final static String USER_PASSWORD = "secret_sauce";


    public FirstPage(String url) {
        Selenide.open(url);
    }

    public void logIn() {
        loginInput.setValue(USER_NAME);
        passwordInput.setValue(USER_PASSWORD);
        OkButton.click();
        check.shouldBe(Condition.visible);

    }


}

