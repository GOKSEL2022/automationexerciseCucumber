package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import pages.AllPages;
import utilities.Driver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.hover;
public class T13_ProductQuantityStepDefinition {
    AllPages allPages=new AllPages();
    @And("Click View Product for any product on home page")
    public void clickViewProductForAnyProductOnHomePage() {
        hover(allPages.loginPage().buttonViewProduct);
        allPages.loginPage().buttonViewProduct.click();
        Driver.getDriver().navigate().refresh();
        allPages.loginPage().buttonViewProduct.click();
    }
    @And("Verify product detail is opened")
    public void verifyProductDetailIsOpened() {
        assertTrue(Driver.getDriver().getPageSource().contains("product_details"));
    }
    @And("Increase quantity to four")
    public void ıncreaseQuantityToFour() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        //Arttirma icin
        for (int i = 1; i < 4; i++) {
            javascriptExecutor.executeScript("arguments[0].value = parseInt(arguments[0].value) + 1", allPages.productDetailsPage().boxQuantity);
        }
    }
    @And("Click Add to cart button")
    public void clickAddToCartButton() {
        allPages.productDetailsPage().buttonAddToCart.click();
    }
    @Then("Verify that product is displayed in cart page with exact quantity")
    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        assertEquals("4",allPages.checkoutPage().textExactQuantity.getText());
    }
}