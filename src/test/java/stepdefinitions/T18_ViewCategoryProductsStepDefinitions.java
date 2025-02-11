package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AllPages;
import utilities.Driver;
import static org.junit.Assert.assertTrue;
public class T18_ViewCategoryProductsStepDefinitions {
    AllPages allPages=new AllPages();
    Actions actions=new Actions(Driver.getDriver());
    @And("Verify that categories are visible on left side bar")
    public void verifyThatCategoriesAreVisibleOnLeftSideBar() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        wait(5);
        Driver.getDriver().navigate().refresh();
        allPages.loginPage().textLoginCategory.isDisplayed();
    }
    @And("Click on Women category")
    public void clickOnWomenCategory() {
        allPages.loginPage().buttonLoginWomen.click();
        Driver.wait(2);
    }
    @And("Click on any category link under Women category, for example: Dress")
    public void clickOnAnyCategoryLinkUnderWomenCategoryForExampleDress() {
        allPages.loginPage().buttonLoginWomenDress.click();
    }
    @And("Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS")
    public void verifyThatCategoryPageIsDisplayedAndConfirmTextWOMENTOPSPRODUCTS() throws InterruptedException {
        Driver.getDriver().navigate().refresh();
        allPages.loginPage().buttonLoginWomen.click();
        wait(2);
        allPages.allProductsPage().buttonWomenTopsProduct.click();
        assertTrue( allPages.allProductsPage().textWomenTopProducts.isDisplayed());
    }
    @And("On left side bar, click on any sub-category link of Men category")
    public void onLeftSideBarClickOnAnySubCategoryLinkOfMenCategory() {
        allPages.allProductsPage().buttonMenProduct.click();
        allPages.allProductsPage().buttonMenTshırtsProduct.click();
    }
    @When("Verify that user is navigated to that category page")
    public void verifyThatUserIsNavigatedToThatCategoryPage() {
        assertTrue( allPages.allProductsPage().textMenTshirtsProducts.isDisplayed());
    }
}
