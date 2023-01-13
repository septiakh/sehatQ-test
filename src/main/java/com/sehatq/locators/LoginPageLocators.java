package com.sehatq.locators;

import org.openqa.selenium.By;

public interface LoginPageLocators {

    By BUTTON_DAFTAR = By.cssSelector("a[href='/daftar/email']");
    By INPUT_EMAIL = By.cssSelector("input[name='email']");
    By INPUT_PASSWORD = By.cssSelector("input[name='password']");
    By BUTTON_LOGIN = By.cssSelector("button[type='submit']");
    By TOAST_MESSAGE = By.cssSelector("div[role='alert']");
    String ERROR_MESSAGE = "//div[contains(text(), '%s')]";


}
