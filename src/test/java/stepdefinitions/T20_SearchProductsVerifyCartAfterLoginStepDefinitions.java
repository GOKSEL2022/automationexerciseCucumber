package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.AllProductsPage;
import pages.LoginPage;
import utilities.Driver;

public class T20_SearchProductsVerifyCartAfterLoginStepDefinitions {
    AllProductsPage allProductsPage=new AllProductsPage();
    LoginPage loginPage=new LoginPage();
    Actions actions=new Actions(Driver.getDriver());

    @And("Add those products to cart")
    public void addThoseProductsToCart() {
        allProductsPage.buttonAddToCartProduct.click();
        Driver.wait(2);

    }

    @And("Click Cart button and verify that products are visible in cart")
    public void clickCartButtonAndVerifyThatProductsAreVisibleInCart() {
        allProductsPage.buttonViewCartProduct.click();
        Driver.wait(2);
        allProductsPage.buttonCartProduct.click();
        Driver.wait(2);
        //loginPage.buttonLogout.click();
        Assert.assertTrue(allProductsPage.textPremiumPoloTShirtsProduct.isDisplayed());

    }

    @And("Again, go to Cart page")
    public void againGoToCartPage() {
        loginPage.buttonCart.click();
        Driver.wait(2);

    }

    @And("Verify that those products are visible in cart after login as well")
    public void verifyThatThoseProductsAreVisibleInCartAfterLoginAsWell() {
        Assert.assertTrue(allProductsPage.textPremiumPoloTShirtsProduct.isDisplayed());
    }
}
