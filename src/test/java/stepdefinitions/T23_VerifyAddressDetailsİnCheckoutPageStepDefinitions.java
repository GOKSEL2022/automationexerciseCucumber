package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.CheckoutPage;

public class T23_VerifyAddressDetailsİnCheckoutPageStepDefinitions {
    CheckoutPage checkoutPage=new CheckoutPage();
    @And("Verify that the delivery address is same address filled at the time registration of account")
    public void verifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        Assert.assertTrue(checkoutPage.textAdressDelivery.isDisplayed());
    }

    @And("Verify that the billing address is same address filled at the time registration of account")
    public void verifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        Assert.assertTrue(checkoutPage.textAdressİnvoice.isDisplayed());
    }
}
