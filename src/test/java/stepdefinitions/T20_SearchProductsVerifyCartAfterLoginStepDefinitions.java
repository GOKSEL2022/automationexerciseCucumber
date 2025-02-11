package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import pages.AllPages;
import utilities.Driver;
import static org.junit.Assert.assertTrue;
public class T20_SearchProductsVerifyCartAfterLoginStepDefinitions {
    AllPages allPages=new AllPages();
    Actions actions=new Actions(Driver.getDriver());
    @And("Add those products to cart")
    public void addThoseProductsToCart() throws InterruptedException {
        allPages.allProductsPage().buttonAddToCartProduct.click();
        wait(2);
    }
    @And("Click Cart button and verify that products are visible in cart")
    public void clickCartButtonAndVerifyThatProductsAreVisibleInCart() throws InterruptedException {
        allPages.allProductsPage().buttonViewCartProduct.click();
        wait(2);
        allPages.allProductsPage().buttonCartProduct.click();
        wait(2);
        //loginPage.buttonLogout.click();
        assertTrue(allPages.allProductsPage().textPremiumPoloTShirtsProduct.isDisplayed());
    }
    @And("Again, go to Cart page")
    public void againGoToCartPage() throws InterruptedException {
        allPages.loginPage().buttonCart.click();
        wait(2);
    }
    @And("Verify that those products are visible in cart after login as well")
    public void verifyThatThoseProductsAreVisibleInCartAfterLoginAsWell() {
        assertTrue(allPages.allProductsPage().textPremiumPoloTShirtsProduct.isDisplayed());
    }
}
