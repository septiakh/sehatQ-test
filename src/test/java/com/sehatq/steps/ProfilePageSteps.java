package com.sehatq.steps;

import com.sehatq.pages.ProfilPage;
import io.cucumber.java.en.And;

public class ProfilePageSteps {

    ProfilPage profilPage = new ProfilPage();

    @And("user click Edit profile button")
    public void userClickEditProfileButton() {
        profilPage.clickEditProfil();
    }
}
