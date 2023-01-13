package com.sehatq.locators;

import org.openqa.selenium.By;

public interface MainPageLocators {

    By ICON_PROFILE_MENU = By.cssSelector("img[alt='SehatQ Profile']");
    By ICON_PROFILE_LOGIN = By.cssSelector("img[class='sc-jzJRlG dOVASO']");
    By EDIT_PROFIL_MENU = By.xpath("//a[contains(text(),'Profil')]");

}
