package stepdefinitions;
import io.cucumber.java.en.*;
import pages.AllPages;
import static org.junit.Assert.assertTrue;

public class T02_LoginCorrectStepDefinitions {
    AllPages allPages=new AllPages();

    @Then("Verify Login to your account is visible")
    public void verify_login_to_your_account_is_visible() {
        assertTrue(allPages.loginPage().textLoginToYourAccount.isDisplayed());
    }
    @Then("Enter correct email adress {string}")
    public void enter_correct_email_adress(String string) {
        allPages.loginPage().boxLoginEmail.sendKeys(string);
    }
    @Then("Enter correct password {string}")
    public void enter_correct_password(String string) {
        allPages.loginPage().boxLoginPassword.sendKeys(string);
    }
    @Then("Click login button")
    public void click_login_button() {
        allPages.loginPage().buttonLogin.click();
    }
    @Then("Verify that ACCOUNT DELETED! is visible")
    public void verify_that_account_deleted_is_visible() {
        assertTrue(allPages.accountCreatedPage().textAccountDeleted.isDisplayed());
    }

    }
