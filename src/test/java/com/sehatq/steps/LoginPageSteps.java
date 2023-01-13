package com.sehatq.steps;

import com.sehatq.pages.LoginPage;
import com.sehatq.pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSteps {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    @And("user click icon profile")
    public void userClickIconProfile() {
        mainPage.clickProfileIconMenu();
    }

    @When("user input email {string} on login page")
    public void userInputEmailOnLoginPage(String email) {
        loginPage.inputEmail(email);
    }

    @And("user input password {string} on login page")
    public void userInputPasswordOnLoginPage(String password) {
        loginPage.inputPassword(password);
    }

    @And("user click Login button")
    public void userClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("user verify already login")
    public void userVerifyAlreadyLogin() {
        System.out.println(loginPage.isLogin());
        Assert.assertTrue("User not login!", loginPage.isLogin());
    }

    @Then("user verify show a toast {string}")
    public void userVerifyShowAToast(String toast) {
        System.out.println(loginPage.toastMessage());
        Assert.assertEquals("Toast message incorrect!", toast, loginPage.toastMessage());
    }

    @Then("user verify show message {string}")
    public void userVerifyShowMessage(String message) {
        System.out.println(loginPage.errorMessage(message));
        Assert.assertTrue("Message not Appear!", loginPage.errorMessage(message));
    }

    @And("user click Daftar link")
    public void userClickDaftarLink() {
        loginPage.clickDaftarLink();
    }

    @And("user already login on sehatQ website")
    public void userAlreadyLoginOnSehatQWebsite() {
        mainPage.clickProfileIconMenu();
        loginPage.inputEmail("test1@mailinator.com");
        loginPage.inputPassword("Password1");
        loginPage.clickLoginButton();
    }

    @And("user go to profil page")
    public void userGoToProfilPage() {
        mainPage.clickProfilMenu();
        mainPage.clickEditProfil();

    }

    @And("user already login on sehatQ website with email {string}")
    public void userAlreadyLoginOnSehatQWebsiteWithEmail(String email) {
        mainPage.clickProfileIconMenu();
        loginPage.inputEmail(email);
        loginPage.inputPassword("Password1");
        loginPage.clickLoginButton();
    }
}
