package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductDetailsPage;
import utilities.Driver;

public class T13_ProductQuantityStepDefinition {
    LoginPage loginPage = new LoginPage();
    ProductDetailsPage productDetailsPage = new ProductDetailsPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @And("Click View Product for any product on home page")
    public void clickViewProductForAnyProductOnHomePage() {
        Driver.hoverOverOnElementActions(loginPage.buttonViewProduct);
        loginPage.buttonViewProduct.click();
        Driver.getDriver().navigate().refresh();
        loginPage.buttonViewProduct.click();


    }

    @And("Verify product detail is opened")
    public void verifyProductDetailIsOpened() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("product_details"));
    }

    @And("Increase quantity to four")
    public void ıncreaseQuantityToFour() {

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        //Arttirma icin
        for (int i = 1; i < 4; i++) {
            javascriptExecutor.executeScript("arguments[0].value = parseInt(arguments[0].value) + 1", productDetailsPage.boxQuantity);
        }
    }

    @And("Click Add to cart button")
    public void clickAddToCartButton() {
        productDetailsPage.buttonAddToCart.click();
    }

    @Then("Verify that product is displayed in cart page with exact quantity")
    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        Assert.assertEquals("4",checkoutPage.textExactQuantity.getText());

    }

}