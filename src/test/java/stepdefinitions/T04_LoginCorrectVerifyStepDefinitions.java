package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import pages.AllPages;
import utilities.Driver;
import static org.junit.Assert.assertTrue;
public class T04_LoginCorrectVerifyStepDefinitions {
    AllPages allPages=new AllPages();
    Actions actions=new Actions(Driver.getDriver());
    @And("Click Logout button")
    public void clickLogoutButton() {
        actions.moveToElement(allPages.loginPage().buttonLogout);
        allPages.loginPage().buttonLogout.click();
    }
    @Then("Verify that user is navigated to login page")
    public void verifyThatUserIsNavigatedToLoginPage() {
        assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));
    }
}
