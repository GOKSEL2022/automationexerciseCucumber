package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CheckoutPage;
import pages.LoginPage;
import utilities.Driver;

public class T23_VerifyAddressDetailsİnCheckoutPageStepDefinitions {
    CheckoutPage checkoutPage=new CheckoutPage();
    LoginPage loginPage=new LoginPage();
    @And("Verify that the delivery address is same address filled at the time registration of account")
    public void verifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        Assert.assertTrue(checkoutPage.textAdressDelivery.isDisplayed());
    }

    @And("Verify that the billing address is same address filled at the time registration of account")
    public void verifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        Assert.assertTrue(checkoutPage.textAdressİnvoice.isDisplayed());
    }

    @Then("Verify ACCOUNT DELETED! and click is Continue button")
    public void verifyACCOUNTDELETEDAndClickIsContinueButton() {
        checkoutPage.buttonDeleteAccountCheckout.click();
        Driver.wait(2);
        Assert.assertTrue(loginPage.buttonSignupLogin.isDisplayed());

    }
}
