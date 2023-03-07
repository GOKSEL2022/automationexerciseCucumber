package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.LoginPage;
import utilities.Driver;

public class T25_ScrollDownfunctionalityStepDefinitions {

    LoginPage loginPage = new LoginPage();
    @And("Scroll down page to bottom")
    public void scrollDownPageToBottom() {
        Driver.scrollEndJS();
        Driver.wait(2);
    }

    @And("Click on arrow at bottom right side to move upward")
    public void clickOnArrowAtBottomRightSideToMoveUpward() {
        Driver.wait(2);
        Driver.clickByJS(loginPage.buttonScrollUp);
    }

    @And("Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen")
    public void verifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen() {
        Assert.assertTrue(loginPage.textAutomationEngineers2.isDisplayed());


    }
}

