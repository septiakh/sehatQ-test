package com.sehatq.steps;

import com.sehatq.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegisterPageSteps {

    RegisterPage registerPage = new RegisterPage();

    @When("user input nama lengkap {string} on daftar page")
    public void userInputNamaLengkapOnDaftarPage(String namaLengkap) {
        registerPage.inputNamaLengkap(namaLengkap);
    }

    @And("user check T and C on daftar page")
    public void userCheckTAndCOnDaftarPage() {
        registerPage.checkTandC();
    }

    @And("user input email {string} on daftar page")
    public void userInputEmailOnDaftarPage(String email) {
        registerPage.inputEmail(email);
    }

    @And("user input password {string} on daftar page")
    public void userInputPasswordOnDaftarPage(String password) {
        registerPage.inputPassword(password);
    }

    @And("user click Daftar button")
    public void userClickDaftarButton() {
        registerPage.clickDaftarButton();
    }

    @Then("user verify show error message {string}")
    public void userVerifyShowErrorMessage(String errorMessage) {
        registerPage.errorMessage(errorMessage);
    }

    @Then("user input will redirect to OTP page")
    public void userInputWillRedirectToOTPPage() {
        Assert.assertTrue("OTP Page doesn't shown!", registerPage.isOTPPageShow());
    }

    @Then("user verify Daftar button is disabled")
    public void userVerifyDaftarButtonIsDisabled() {
        Assert.assertFalse("Button Daftar is Enable!", registerPage.isDaftarButtonEnable());
    }
}
