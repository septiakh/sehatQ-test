package com.sehatq.pages;

import com.sehatq.base.BasePageObject;

import static com.sehatq.locators.ProfilePageLocators.BUTTON_EDIT_PROFIL;

public class ProfilPage extends BasePageObject {

    public void clickEditProfil(){
        clickOn(BUTTON_EDIT_PROFIL);
    }
}
