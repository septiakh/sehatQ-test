package com.sehatq.steps;

import com.sehatq.pages.MainPage;
import io.cucumber.java.en.Given;

public class MainPageSteps {

    MainPage mainPage = new MainPage();
    @Given("User open url {string}")
    public void userOpenUrl(String url) {
        mainPage.openUrl(url);
    }
}
