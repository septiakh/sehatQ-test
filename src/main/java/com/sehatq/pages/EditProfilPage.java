package com.sehatq.pages;

import com.sehatq.base.BasePageObject;
import com.sehatq.locators.EditProfilLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static com.sehatq.locators.EditProfilLocators.*;

public class EditProfilPage extends BasePageObject {

    public void selectJenisKelamin(){
        clickOn(INPUT_GENDER);
        clickOn(SELECT_GENDER_PEREMPUAN);
    }

    public void inputTinggiBadan(String TB){
        input(INPUT_TB, TB );
    }

    public void inputBeratBadan(String BB){
        input(INPUT_BB, BB);
    }

    public void inputNoTelp(String noTelp){
        input(INPUT_NO_TELP, noTelp);
    }

    public void inputAlamat(String alamat){
        input(INPUT_ALAMAT, alamat);
    }

    public void clickSimpan(){
        clickOn(BUTTON_SIMPAN);
    }

    public boolean errorMessage(String message){
        waitUntilVisible(By.xpath(String.format(EditProfilLocators.ERROR_MESSAGE, message)));
        return isDisplayed(By.xpath(String.format(EditProfilLocators.ERROR_MESSAGE, message)));
    }

    public void selectTglLahir(String tglLahir){
        clickOn(INPUT_TANGGAL_LAHIR);
        String[] birth = tglLahir.split("-");
        selectDropDownByValue(SELECT_YEAR, birth[2]);
        selectDropDownByText(SELECT_MONTH, birth[1]);
        clickOn(By.xpath(String.format(SELECT_DATE, birth[0])));
    }

    public void removeValueTinggiBadan(){
       clear(INPUT_TB);
    }

    public void removeValueBeratBadan(){
        clear(INPUT_BB);
    }

    public void removeValuePhone(){
        clear(INPUT_NO_TELP);
    }

    public void removeValueAlamat(){
        clear(INPUT_ALAMAT);
    }
}
