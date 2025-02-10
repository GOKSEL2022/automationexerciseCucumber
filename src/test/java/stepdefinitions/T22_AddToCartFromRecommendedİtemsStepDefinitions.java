package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.CheckoutPage;
import pages.LoginPage;
import utilities.Driver;

public class T22_AddToCartFromRecommendedİtemsStepDefinitions {
    LoginPage loginPage=new LoginPage();
    CheckoutPage checkoutPage=new CheckoutPage();

    @And("Scroll to bottom of page")
    public void scrollToBottomOfPage() {
        Driver.hover(loginPage.textRecommendedİtemsLogin);

    }

    @And("Verify RECOMMENDED ITEMS are visible")
    public void verifyRECOMMENDEDITEMSAreVisible() {
        Assert.assertTrue(loginPage.textRecommendedİtemsLogin.isDisplayed());
    }

    @And("Click on Add To Cart on Recommended product")
    public void clickOnAddToCartOnRecommendedProduct() {
        loginPage.buttonRecommennedAddToCartLogin.click();
    }

    @And("Click on View Cart button")
    public void clickOnViewCartButton() {
        loginPage.buttonRecommennedViewCartLogin.click();
    }

    @Then("Verify that product is displayed in cart page")
    public void verifyThatProductIsDisplayedInCartPage() {
        Assert.assertTrue(checkoutPage.textProductisDisplayed.isDisplayed());
    }
}
