package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AllProductsPage;
import pages.LoginPage;
import utilities.Driver;

public class T18_ViewCategoryProducts {
    LoginPage loginPage=new LoginPage();
    AllProductsPage allProductsPage=new AllProductsPage();
    Actions actions=new Actions(Driver.getDriver());

    @And("Verify that categories are visible on left side bar")
    public void verifyThatCategoriesAreVisibleOnLeftSideBar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.wait(5);
        Driver.getDriver().navigate().refresh();
        loginPage.textLoginCategory.isDisplayed();

    }

    @And("Click on Women category")
    public void clickOnWomenCategory() {
        loginPage.buttonLoginWomen.click();
        Driver.wait(2);
    }

    @And("Click on any category link under Women category, for example: Dress")
    public void clickOnAnyCategoryLinkUnderWomenCategoryForExampleDress() {
        loginPage.buttonLoginWomenDress.click();
    }

    @And("Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS")
    public void verifyThatCategoryPageIsDisplayedAndConfirmTextWOMENTOPSPRODUCTS() {
        Driver.getDriver().navigate().refresh();
        loginPage.buttonLoginWomen.click();
        Driver.wait(2);
        allProductsPage.buttonWomenTopsProduct.click();
        Assert.assertTrue(allProductsPage.textWomenTopProducts.isDisplayed());

    }

    @And("On left side bar, click on any sub-category link of Men category")
    public void onLeftSideBarClickOnAnySubCategoryLinkOfMenCategory() {
        allProductsPage.buttonMenProduct.click();
        allProductsPage.buttonMenTshırtsProduct.click();
    }

    @When("Verify that user is navigated to that category page")
    public void verifyThatUserIsNavigatedToThatCategoryPage() {
        Assert.assertTrue(allProductsPage.textMenTshirtsProducts.isDisplayed());
    }
}
