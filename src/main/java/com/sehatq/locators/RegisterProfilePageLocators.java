package com.sehatq.locators;

import org.openqa.selenium.By;

public interface RegisterProfilePageLocators {

    By INPUT_NO_TELP = By.cssSelector("input[name='phone']");
    By INPUT_TGL_LAHIR = By.cssSelector("input[label='Tanggal Lahir']");
    By SELECT_GENDER = By.cssSelector("div[id='gender'] button[type='button']");
    By SELECT_IDENTITY = By.cssSelector("div[id='idType'] button[type='button']");
    By INPUT_NO_IDENTITY = By.cssSelector("input[name='idNumber']");
    By BUTTON_LANJUT = By.xpath("//button[contains(text(), \"Lanjut\")]");
    By BUTTON_LEWATI = By.xpath("//span[contains(text(), \"Lewati\")]");
    String ERROR_MESSAGE = "//div[contains(text(), '%s')]";
}
