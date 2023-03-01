package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AccountCreatedPage;
import pages.LoginPage;
import pages.SignupPage;

public class T02_LoginCorrectStepDefinitions {
    LoginPage loginPage=new LoginPage();
    AccountCreatedPage accountCreatedPage=new AccountCreatedPage();
    SignupPage signupPage=new SignupPage();


    @Then("Verify Login to your account is visible")
    public void verify_login_to_your_account_is_visible() {
        Assert.assertTrue(loginPage.textLoginToYourAccount.isDisplayed());


    }
    @Then("Enter correct email adress {string}")
    public void enter_correct_email_adress(String string) {
        loginPage.boxLoginEmail.sendKeys(string);

    }
    @Then("Enter correct password {string}")
    public void enter_correct_password(String string) {
        loginPage.boxLoginPassword.sendKeys(string);

    }
    @Then("Click login button")
    public void click_login_button() {
        loginPage.buttonLogin.click();

    }
    @Then("Verify that ACCOUNT DELETED! is visible")
    public void verify_that_account_deleted_is_visible() {
        Assert.assertTrue(accountCreatedPage.textAccountDeleted.isDisplayed());
    }

    }
