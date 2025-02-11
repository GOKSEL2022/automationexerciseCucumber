package stepdefinitions;
import io.cucumber.java.en.*;
import pages.AllPages;
public class T11_VerifySubscriptionCartStepDefinitions {
    AllPages allPages=new AllPages();
    @And("Click Cart button")
    public void clickCartButton() {
        allPages.loginPage().buttonCart.click();
    }
    @When("Enter email address {string} in input and click arrow button")
    public void enterEmailAddressInInputAndClickArrowButton(String string) {
        allPages.loginPage().boxEmailCart.sendKeys(string);
        allPages.loginPage().buttonSubscriptionEmail.click();
    }
}
