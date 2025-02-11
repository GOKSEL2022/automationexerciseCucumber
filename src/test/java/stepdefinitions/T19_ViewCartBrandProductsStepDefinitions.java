package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AllPages;
import utilities.Driver;
import static org.junit.Assert.assertTrue;
public class T19_ViewCartBrandProductsStepDefinitions {
    AllPages allPages=new AllPages();
    Actions actions=new Actions(Driver.getDriver());
    @And("Verify that Brands are visible on left side bar")
    public void verifyThatBrandsAreVisibleOnLeftSideBar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        assertTrue(allPages.allProductsPage().textBransdProducts.isDisplayed());
    }
    @And("Click on any brand name")
    public void clickOnAnyBrandName() throws InterruptedException {
        wait(2);
        allPages.allProductsPage().buttonBrandProductsPolo.click();
    }
    @And("Verify that user is navigated to brand page and brand products are displayed")
    public void verifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() throws InterruptedException {
        assertTrue(Driver.getDriver().getPageSource().contains("Polo"));
        wait(2);
        assertTrue(allPages.allProductsPage().textBrandPoloProducts.isDisplayed());
    }
    @And("On left side bar, click on any other brand link")
    public void onLeftSideBarClickOnAnyOtherBrandLink() throws InterruptedException {
        allPages.allProductsPage().buttonBrandProductsHM.click();
        wait(2);
    }
    @Then("Verify that user is navigated to that brand page and can see products")
    public void verifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() throws InterruptedException {
        assertTrue(Driver.getDriver().getCurrentUrl().contains("H&M"));
        wait(2);
        assertTrue(allPages.allProductsPage().textBrandHMProducts.isDisplayed());
    }
}
