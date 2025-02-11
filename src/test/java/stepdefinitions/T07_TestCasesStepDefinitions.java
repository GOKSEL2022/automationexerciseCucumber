package stepdefinitions;
import io.cucumber.java.en.*;
import pages.AllPages;
import utilities.Driver;
import static org.junit.Assert.assertTrue;
public class T07_TestCasesStepDefinitions {
    AllPages allPages=new AllPages();
    @When("Click on Test Cases button")
    public void clickOnTestCasesButton() {
        allPages.loginPage().buttonLoginTestCase.click();
        Driver.getDriver().navigate().refresh();
    }
    @Then("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {
        assertTrue(allPages.loginPage().textLoginTestCase.isDisplayed());
    }
}
