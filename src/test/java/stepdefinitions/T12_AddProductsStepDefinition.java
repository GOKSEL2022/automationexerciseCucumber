package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AllProductsPage;
import pages.CheckoutPage;
import utilities.Driver;
public class T12_AddProductsStepDefinition {
    AllProductsPage allProductsPage = new AllProductsPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    @And("Hover over first product and click Add to cart")
    public void hoverOverFirstProductAndClickAddToCart() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.wait(1);
        Driver.hover(allProductsPage.firstProductPicture);
        Driver.wait(2);
        allProductsPage.buttonAddToCartFirst.click();
        Driver.wait(2);
    }
    @And("Click Continue Shopping button")
    public void clickContinueShoppingButton() {
        allProductsPage.buttonContinueShopping.click();
    }
    @And("Hover over second product and click Add to cart")
    public void hoverOverSecondProductAndClickAddToCart() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.wait(1);
        Driver.hover(allProductsPage.twoProductPicture);
        Driver.wait(2);
        allProductsPage.buttonAddToCartTwo.click();
        Driver.wait(2);
    }
    @And("Click View Cart button")
    public void clickViewCartButton() {
        allProductsPage.buttonViewCart.click();
    }
    @When("Verify both products are added to Cart")
    public void verifyBothProductsAreAddedToCart() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("view_cart"));
    }
    @Then("Verify their prices, quantity and total price")
    public void verifyTheirPricesQuantityAndTotalPrice() {
        Assert.assertTrue(checkoutPage.textPriceCheckout.isDisplayed());
        Assert.assertTrue(checkoutPage.textQuantityCheckout.isDisplayed());
        Assert.assertTrue(checkoutPage.textTotalCheckout.isDisplayed());
    }
}