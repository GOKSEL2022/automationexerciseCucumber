package stepdefinitions;
import io.cucumber.java.en.*;
import pages.AllPages;
import utilities.Driver;
import static org.junit.Assert.assertTrue;
public class T08_ProductVerifyStepDefinitions {
    AllPages allPages=new AllPages();
    @And("Click on Products button")
    public void clickOnProductsButton() {
        allPages.loginPage().buttonProducts.click();
        Driver.getDriver().navigate().refresh();
        allPages.loginPage().buttonProducts.click();
    }
    @And("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        assertTrue(Driver.getDriver().getPageSource().contains("products"));
    }
    @And("The products list is visible")
    public void theProductsListIsVisible() {
        assertTrue(allPages.allProductsPage().textAllProduct.isDisplayed());
    }
    @And("Click on View Product of first product")
    public void clickOnViewProductOfFirstProduct() {
        allPages.allProductsPage().viewFirstProduct.click();
    }
    @When("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {
        assertTrue(Driver.getDriver().getPageSource().contains("product_details"));
    }
    @Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
        assertTrue(allPages.allProductsPage().textDetailCondition.isDisplayed());
    }
}
