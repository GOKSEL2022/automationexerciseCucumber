package stepdefinitions;
import io.cucumber.java.en.*;
import pages.AllPages;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.scrollBottomJS;
public class T10_VerifySubscriptionHomeStepDefinitions {
    AllPages allPages=new AllPages();
    @And("Scroll down to footer")
    public void scrollDownToFooter() {
        scrollBottomJS();
    }
    @And("Verify text SUBSCRIPTION")
    public void verifyTextSUBSCRIPTION() {
        assertTrue(allPages.loginPage().textSubscription.isDisplayed());
    }
    @When("Enter email address {string}  in input and click arrow button")
    public void enterEmailAddressInInputAndClickArrowButton(String string) {
        allPages.loginPage().boxSubscriptionEmail.sendKeys(string);
        allPages.loginPage().buttonSubscriptionEmail.click();
    }
    @Then("Verify success message You have been successfully subscribed! is visible")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {
        assertTrue(allPages.loginPage().textAlertSuccesSubscription.isDisplayed());
    }
}
