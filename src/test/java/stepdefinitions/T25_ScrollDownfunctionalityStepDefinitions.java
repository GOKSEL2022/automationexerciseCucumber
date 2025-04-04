package stepdefinitions;
import io.cucumber.java.en.*;
import pages.AllPages;
import utilities.Driver;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.clickByJS;
import static utilities.Driver.scrollBottomJS;
public class T25_ScrollDownfunctionalityStepDefinitions {
    AllPages allPages=new AllPages();
    @And("Scroll down page to bottom")
    public void scrollDownPageToBottom() throws InterruptedException {
        Driver.scrollIntoViewJS(allPages.allProductsPage().susbscribeEmailTextboxSayfaAltiProduct);
        Thread.sleep(2000);
    }
    @And("Click on arrow at bottom right side to move upward")
    public void clickOnArrowAtBottomRightSideToMoveUpward() throws InterruptedException {
        wait(2);
        clickByJS(allPages.loginPage().buttonScrollUp);
    }
    @And("Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen")
    public void verifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen() {
        assertTrue(allPages.allProductsPage().automationExcerciseTitleProduct.isDisplayed());
    }
}

