package stepdefinitions;
import io.cucumber.java.en.*;
import pages.AllPages;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.clickWithJS;
import static utilities.ReusableMethods.hover;
public class T17_RemoveProductsStepDefinitions {
    AllPages allPages=new AllPages();
    @And("Click X button corresponding to particular product")
    public void clickXButtonCorrespondingToParticularProduct() {
        hover(allPages.checkoutPage().buttonXDelete);
        clickWithJS(allPages.checkoutPage().buttonXDelete);
    }
    @Then("Verify that product is removed from the cart")
    public void verifyThatProductIsRemovedFromTheCart() {
        assertTrue(allPages.checkoutPage().textCartisEmpty.isDisplayed());
       // Assert.assertTrue(Driver.getDriver().getPageSource().contains("Cart is empty!"));
    }
}
