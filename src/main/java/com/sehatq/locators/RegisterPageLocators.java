package com.sehatq.locators;

import org.openqa.selenium.By;

public interface RegisterPageLocators {

    By INPUT_NAME = By.cssSelector("#name");
    By INPUT_EMAIL = By.cssSelector("#email");
    By INPUT_PASSWORD = By.cssSelector("input[name='password']");
//    By CHECKBOX_KEBIJAKAN_PRIVACY = By.cssSelector("span[for='ok-check']");
    By CHECKBOX_KEBIJAKAN_PRIVACY = By.cssSelector("#ok-check");
    By BUTTON_DAFTAR = By.cssSelector("button[type='submit']");
    By INPUT_OTP_REGISTERED = By.cssSelector("input[type='phone']");
}
