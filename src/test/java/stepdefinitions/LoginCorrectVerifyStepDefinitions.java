package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.LoginPage;
import utilities.Driver;

public class LoginCorrectVerifyStepDefinitions {
    LoginPage loginPage=new LoginPage();



    @And("Click Logout button")
    public void clickLogoutButton() {
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement( loginPage.buttonLogout);
        loginPage.buttonLogout.click();


    }

    @Then("Verify that user is navigated to login page")
    public void verifyThatUserIsNavigatedToLoginPage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));

    }
}
