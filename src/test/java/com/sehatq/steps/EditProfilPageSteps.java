package com.sehatq.steps;

import com.sehatq.pages.EditProfilPage;
import io.cucumber.java.an.E;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class EditProfilPageSteps {

    EditProfilPage editProfilPage = new EditProfilPage();

    @And("user input tanggal lahir {string} on edit profil page")
    public void userInputTanggalLahirOnEditProfilPage(String tglLahir) {
        editProfilPage.selectTglLahir(tglLahir);
    }

    @And("user input tinggi badan {string} on edit profil page")
    public void userInputTinggiBadanOnEditProfilPage(String tinggiBadan) {
        editProfilPage.inputTinggiBadan(tinggiBadan);
    }

    @And("user input berat badan {string} on edit profil page")
    public void userInputBeratBadanOnEditProfilPage(String beratBadan) {
        editProfilPage.inputBeratBadan(beratBadan);
    }

    @And("user input no telepon {string} on edit profil page")
    public void userInputNoTeleponOnEditProfilPage(String noTelp) {
        editProfilPage.inputNoTelp(noTelp);
    }

    @And("user input alamat {string} on edit profil page")
    public void userInputAlamatOnEditProfilPage(String alamat) {
        editProfilPage.inputAlamat(alamat);
    }

    @And("user input jenis kelamin perempuan on edit profil page")
    public void userInputJenisKelaminPerempuanOnEditProfilPage() {
        editProfilPage.selectJenisKelamin();
    }

    @And("user click Simpan button on edit profil page")
    public void userClickSimpanButtonOnEditProfilPage() {
        editProfilPage.clickSimpan();
    }

    @Then("user verify Profil successfully updated")
    public void userVerifyProfilSuccessfullyUpdated() {
    }

    @Then("user verify show error message {string} on edit profil page")
    public void userVerifyShowErrorMessageOnEditProfilPage(String message) {
        System.out.println(editProfilPage.errorMessage(message));
        Assert.assertTrue("Message not Appear!", editProfilPage.errorMessage(message));
    }

    @And("user remove value from tinggi badan field")
    public void userRemoveValueFromTinggiBadanField() {
        editProfilPage.removeValueTinggiBadan();
    }

    @And("user remove value from berat badan field")
    public void userRemoveValueFromBeratBadanField() {
        editProfilPage.removeValueBeratBadan();
    }

    @And("user remove value from no telpon field")
    public void userRemoveValueFromNoTelponField() {
        editProfilPage.removeValuePhone();
    }

    @And("user remove value from alamat field")
    public void userRemoveValueFromAlamatField() {
        editProfilPage.removeValueAlamat();
    }
}
