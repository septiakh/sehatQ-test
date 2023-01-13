package com.sehatq.pages;

import com.sehatq.base.BasePageObject;
import org.openqa.selenium.WebElement;

import static com.sehatq.locators.MainPageLocators.*;

public class MainPage extends BasePageObject {

    public void openUrl(String url){
        getDriver().get("https://www."+url);
    }

    public void clickProfileIconMenu(){
        clickOn(ICON_PROFILE_MENU);
    }

    public void clickProfilMenu(){
        waitUntilVisible(ICON_PROFILE_MENU);
        clickOn(ICON_PROFILE_LOGIN);
    }

    public void clickEditProfil(){
        clickOn(EDIT_PROFIL_MENU);
    }
}
