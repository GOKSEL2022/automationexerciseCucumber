package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AllProductsPage;
import utilities.Driver;

public class T09_SearchProductStepDefinitions {
    AllProductsPage allProductsPage=new AllProductsPage();
    @And("Enter product name {string} in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton(String string) {

        allProductsPage.boxSearchProduct.sendKeys(string);
        allProductsPage.buttonSubmitSearchProduct.click();

    }
    @And("Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {
        Assert.assertTrue(allProductsPage.textSearchedProducts.isDisplayed());

    }
    @Then("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {
        Assert.assertTrue(allProductsPage.verifyAllProducts.isDisplayed());
    }
}
