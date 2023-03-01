package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AllProductsPage;
import pages.LoginPage;
import utilities.Driver;

public class T08_ProductVerifyStepDefinitions {
    LoginPage loginPage=new LoginPage();
    AllProductsPage allProductsPage=new AllProductsPage();

    @And("Click on Products button")
    public void clickOnProductsButton() {
        loginPage.buttonProducts.click();
        Driver.getDriver().navigate().refresh();
        loginPage.buttonProducts.click();
    }

    @And("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("products"));

    }

    @And("The products list is visible")
    public void theProductsListIsVisible() {
        Assert.assertTrue(allProductsPage.textAllProduct.isDisplayed());
    }

    @And("Click on View Product of first product")
    public void clickOnViewProductOfFirstProduct() {
        allProductsPage.viewFirstProduct.click();
    }

    @When("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("product_details"));
    }

    @Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
        Assert.assertTrue(allProductsPage.textDetailCondition.isDisplayed());
    }
}
