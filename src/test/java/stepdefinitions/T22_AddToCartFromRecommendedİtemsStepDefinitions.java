package stepdefinitions;
import io.cucumber.java.en.*;
import pages.AllPages;
import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.hover;
public class T22_AddToCartFromRecommendedİtemsStepDefinitions {
    AllPages allPages=new AllPages();
    @And("Scroll to bottom of page")
    public void scrollToBottomOfPage() {
       hover(allPages.loginPage().textRecommendedİtemsLogin);
    }
    @And("Verify RECOMMENDED ITEMS are visible")
    public void verifyRECOMMENDEDITEMSAreVisible() {
        assertTrue(allPages.loginPage().textRecommendedİtemsLogin.isDisplayed());
    }
    @And("Click on Add To Cart on Recommended product")
    public void clickOnAddToCartOnRecommendedProduct() {
        allPages.loginPage().buttonRecommennedAddToCartLogin.click();
    }
    @And("Click on View Cart button")
    public void clickOnViewCartButton() {
        allPages.loginPage().buttonRecommennedViewCartLogin.click();
    }
    @Then("Verify that product is displayed in cart page")
    public void verifyThatProductIsDisplayedInCartPage() {
        assertTrue(allPages.checkoutPage().textProductisDisplayed.isDisplayed());
    }
}
