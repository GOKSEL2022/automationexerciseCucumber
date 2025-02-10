package stepdefinitions;
import io.cucumber.java.en.*;
import pages.AllPages;
import static org.junit.Assert.assertTrue;
public class T09_SearchProductStepDefinitions {
    AllPages allPages=new AllPages();
    @And("Enter product name {string} in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton(String string) {
        allPages.allProductsPage().boxSearchProduct.sendKeys(string);
        allPages.allProductsPage().buttonSubmitSearchProduct.click();
    }
    @And("Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {
        assertTrue(allPages.allProductsPage().textSearchedProducts.isDisplayed());
    }
    @Then("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {
        assertTrue(allPages.allProductsPage().verifyAllProducts.isDisplayed());
    }
}
