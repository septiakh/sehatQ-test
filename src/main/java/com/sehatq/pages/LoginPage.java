package com.sehatq.pages;

import com.sehatq.base.BasePageObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import static com.sehatq.locators.LoginPageLocators.*;
import static com.sehatq.locators.MainPageLocators.ICON_PROFILE_LOGIN;

public class LoginPage extends BasePageObject {

    public void inputEmail(String email){
        input(INPUT_EMAIL, email);
    }

    public void inputPassword(String password){
        input(INPUT_PASSWORD, password);
    }

    public void clickLoginButton(){
        clickOn(BUTTON_LOGIN);
    }

    public boolean isLogin(){
        waitUntilVisible(ICON_PROFILE_LOGIN);
        return isDisplayed(ICON_PROFILE_LOGIN);
    }

    public String toastMessage(){
        return getText(TOAST_MESSAGE);
    }

    public boolean errorMessage(String message){
        waitUntilVisible(By.xpath(String.format(ERROR_MESSAGE, message)));
        return isDisplayed(By.xpath(String.format(ERROR_MESSAGE, message)));
    }

    public void clickDaftarLink(){
        clickOn(BUTTON_DAFTAR);
    }
}
