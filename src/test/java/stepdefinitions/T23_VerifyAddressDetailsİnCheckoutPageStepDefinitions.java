package stepdefinitions;
import io.cucumber.java.en.*;
import pages.AllPages;
import static org.junit.Assert.assertTrue;
public class T23_VerifyAddressDetailsİnCheckoutPageStepDefinitions {
    AllPages allPages=new AllPages();
    @And("Verify that the delivery address is same address filled at the time registration of account")
    public void verifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        assertTrue(allPages.checkoutPage().textAdressDelivery.isDisplayed());
    }
    @And("Verify that the billing address is same address filled at the time registration of account")
    public void verifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() throws InterruptedException {
        assertTrue(allPages.checkoutPage().textAdressİnvoice.isDisplayed());
        wait(2);
    }
    @Then("Verify ACCOUNT DELETED! and click is Continue button")
    public void verifyACCOUNTDELETEDAndClickIsContinueButton() throws InterruptedException {
        allPages.checkoutPage().buttonDeleteAccountCheckout.click();
        wait(2);
        assertTrue(allPages.loginPage().buttonSignupLogin.isDisplayed());
    }
}
