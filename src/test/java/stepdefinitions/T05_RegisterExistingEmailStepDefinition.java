package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;


public class T05_RegisterExistingEmailStepDefinition {
    LoginPage loginPage=new LoginPage();
    @And("already registered email address {string}")
    public void alreadyRegisteredEmailAddress(String string) {
        loginPage.boxRegisterEmail.sendKeys(string);

    }

    @Then("Verify error Email Address already exist! is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() {
        Assert.assertTrue(loginPage.textEmailAddressAlreadyExistMesaj.isDisplayed());
    }
}
