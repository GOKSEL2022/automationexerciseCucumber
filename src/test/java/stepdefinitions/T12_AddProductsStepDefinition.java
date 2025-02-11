package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AllPages;
import utilities.Driver;
import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.hover;
public class T12_AddProductsStepDefinition {
    AllPages allPages=new AllPages();
    Actions actions = new Actions(Driver.getDriver());
    @And("Hover over first product and click Add to cart")
    public void hoverOverFirstProductAndClickAddToCart() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        wait(1);
        hover(allPages.allProductsPage().firstProductPicture);
        wait(2);
        allPages.allProductsPage().buttonAddToCartFirst.click();
        wait(2);
    }
    @And("Click Continue Shopping button")
    public void clickContinueShoppingButton() {
        allPages.allProductsPage().buttonContinueShopping.click();
    }
    @And("Hover over second product and click Add to cart")
    public void hoverOverSecondProductAndClickAddToCart() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        wait(1);
        hover(allPages.allProductsPage().twoProductPicture);
        wait(2);
        allPages.allProductsPage().buttonAddToCartTwo.click();
        wait(2);
    }
    @And("Click View Cart button")
    public void clickViewCartButton() {
        allPages.allProductsPage().buttonViewCart.click();
    }
    @When("Verify both products are added to Cart")
    public void verifyBothProductsAreAddedToCart() {
        assertTrue(Driver.getDriver().getCurrentUrl().contains("view_cart"));
    }
    @Then("Verify their prices, quantity and total price")
    public void verifyTheirPricesQuantityAndTotalPrice() {
        assertTrue(allPages.checkoutPage().textPriceCheckout.isDisplayed());
        assertTrue(allPages.checkoutPage().textQuantityCheckout.isDisplayed());
        assertTrue(allPages.checkoutPage().textTotalCheckout.isDisplayed());
    }
}