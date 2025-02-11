package stepdefinitions;
import io.cucumber.java.en.*;
import pages.AllPages;
import static org.junit.Assert.assertTrue;
public class T03_LoginİncorrectStepDefinitions {
    AllPages allPages=new AllPages();
    @When("Enter incorrect email address {string}")
    public void enter_incorrect_email_address(String string) {
        allPages.loginPage().boxLoginEmail.sendKeys(string);
    }
    @When("Enter incorrect password {string}")
    public void enter_incorrect_password(String string) {
        allPages.loginPage().boxLoginPassword.sendKeys(string);
    }
    @Then("Verify error Your email or password is incorrect! is visible")
    public void verify_error_your_email_or_password_is_incorrect_is_visible() {
        assertTrue(allPages.loginPage().textIncorrectMesaj.isDisplayed());
    }
}
