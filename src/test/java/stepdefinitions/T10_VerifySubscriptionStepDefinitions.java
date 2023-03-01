package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.Driver;

public class T10_VerifySubscriptionStepDefinitions {
    LoginPage loginPage=new LoginPage();
    @And("Scroll down to footer")
    public void scrollDownToFooter() {
        Driver.scrollEndJS();


    }

    @And("Verify text SUBSCRIPTION")
    public void verifyTextSUBSCRIPTION() {
        Assert.assertTrue(loginPage.textSubscription.isDisplayed());
    }

    @When("Enter email address {string}  in input and click arrow button")
    public void enterEmailAddressInInputAndClickArrowButton(String string) {
        loginPage.boxSubscriptionEmail.sendKeys(string);
        loginPage.buttonSubscriptionEmail.click();
    }

    @Then("Verify success message You have been successfully subscribed! is visible")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {
        Assert.assertTrue(loginPage.textAlertSuccesSubscription.isDisplayed());

    }
}
