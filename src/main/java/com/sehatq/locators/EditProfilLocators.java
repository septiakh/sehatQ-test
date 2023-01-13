package com.sehatq.locators;

import org.openqa.selenium.By;

public interface EditProfilLocators {

    By INPUT_TANGGAL_LAHIR = By.xpath("//span[contains(text(),'Tanggal Lahir')]");
    By INPUT_GENDER = By.cssSelector("#gender");
    By SELECT_GENDER_PEREMPUAN = By.xpath("//a[contains(text(),'Perempuan')]");
    By INPUT_BB = By.cssSelector("input[name='weight']");
    By INPUT_TB = By.cssSelector("input[name='height']");
    By INPUT_NO_TELP = By.cssSelector("input[name='phone']");
    By INPUT_ALAMAT = By.cssSelector("#address");
    By BUTTON_SIMPAN = By.xpath("//button[contains(text(),'Simpan')]");
    String ERROR_MESSAGE = "//div[contains(text(),'%s')]";

    //Date
    By SELECT_YEAR = By.cssSelector("select[name='year']");
    By SELECT_MONTH = By.cssSelector("select[name='month']");
    String SELECT_DATE = "//div[contains(text(),'%s')]";

}
