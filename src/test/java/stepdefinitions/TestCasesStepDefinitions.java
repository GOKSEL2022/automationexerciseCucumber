package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.devtools.v108.input.model.DragDataItem;
import pages.LoginPage;
import utilities.Driver;

public class TestCasesStepDefinitions {

    LoginPage loginPage=new LoginPage();


    @When("Click on Test Cases button")
    public void clickOnTestCasesButton() {
        loginPage.buttonLoginTestCase.click();
        Driver.getDriver().navigate().refresh();

    }

    @Then("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {
        Assert.assertTrue(loginPage.textLoginTestCase.isDisplayed());

    }
}
