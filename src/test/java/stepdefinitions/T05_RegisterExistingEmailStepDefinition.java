package stepdefinitions;
import io.cucumber.java.en.*;
import pages.AllPages;
import static org.junit.Assert.assertTrue;
public class T05_RegisterExistingEmailStepDefinition {
    AllPages allPages=new AllPages();
    @And("already registered email address {string}")
    public void alreadyRegisteredEmailAddress(String string) {
        allPages.loginPage().boxRegisterEmail.sendKeys(string);
    }
    @Then("Verify error Email Address already exist! is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() {
       assertTrue(allPages.loginPage().textEmailAddressAlreadyExistMesaj.isDisplayed());
    }
}
