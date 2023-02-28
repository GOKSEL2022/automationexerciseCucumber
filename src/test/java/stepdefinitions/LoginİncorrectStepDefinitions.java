package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;

public class LoginİncorrectStepDefinitions {
    LoginPage loginPage=new LoginPage();

    @When("Enter incorrect email address {string}")
    public void enter_incorrect_email_address(String string) {
        loginPage.boxLoginEmail.sendKeys(string);


    }
    @When("Enter incorrect password {string}")
    public void enter_incorrect_password(String string) {
        loginPage.boxLoginPassword.sendKeys(string);

    }
    @Then("Verify error Your email or password is incorrect! is visible")
    public void verify_error_your_email_or_password_is_incorrect_is_visible() {
        Assert.assertTrue(loginPage.textIncorrectMesaj.isDisplayed());

    }

}
