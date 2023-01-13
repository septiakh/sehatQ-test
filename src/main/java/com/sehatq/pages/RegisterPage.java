package com.sehatq.pages;

import com.sehatq.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.sehatq.locators.LoginPageLocators.ERROR_MESSAGE;
import static com.sehatq.locators.RegisterPageLocators.*;

public class RegisterPage extends BasePageObject {

    public void inputNamaLengkap(String namaLengkap){
        input(INPUT_NAME, namaLengkap);
    }

    public void inputEmail(String email){
        input(INPUT_EMAIL, email);
    }

    public void inputPassword(String password){
        input(INPUT_PASSWORD,  password);
    }

    public void checkTandC(){
//        clickOn(CHECKBOX_KEBIJAKAN_PRIVACY);
        Actions action = new Actions(getDriver());
        WebElement we = getDriver().findElement(By.cssSelector("#ok-check"));
        action.moveToElement(we).moveToElement(getDriver().findElement(By.cssSelector("#ok-check"))).click().build().perform();
    }

    public void clickDaftarButton(){
        clickOn(BUTTON_DAFTAR);
    }

    public boolean errorMessage(String message){
        waitUntilVisible(By.xpath(String.format(ERROR_MESSAGE, message)));
        return isDisplayed(By.xpath(String.format(ERROR_MESSAGE, message)));
    }

    public boolean isOTPPageShow(){
        return isDisplayed(INPUT_OTP_REGISTERED);
    }

    public boolean isDaftarButtonEnable(){
        return getDriver().findElement(BUTTON_DAFTAR).isEnabled();
    }
}
