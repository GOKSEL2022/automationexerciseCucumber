package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AllPages;
import utilities.Driver;
import static org.junit.Assert.assertTrue;
public class T21_AddReviewOnProductStepDefinitions {
    AllPages allPages=new AllPages();
    Actions actions=new Actions(Driver.getDriver());
    @And("Click on View Product button")
    public void clickOnViewProductButton() {
        allPages.loginPage().buttonProducts.click();
    }
    @And("Verify Write Your Review is visible")
    public void verifyWriteYourReviewIsVisible() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        wait(2);
        allPages.allProductsPage().viewFirstProduct.click();
        wait(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        assertTrue(allPages.allProductsPage().textWriteYourReviewProduct.isDisplayed());
    }
    @And("Enter name is {string}")
    public void enterNameIs(String string) {
        allPages.allProductsPage().boxYourNameProduct.sendKeys(string);
    }
    @And("Enter email address is {string}")
    public void enterEmailAddressIs(String string) {
        allPages.allProductsPage().boxEmailAddressProduct.sendKeys(string);
    }
    @And("Enter review {string}")
    public void enterReview(String string) {
        allPages.allProductsPage().boxAddReviewHereProduct.sendKeys(string);
    }
    @And("Click is Submit button")
    public void clickIsSubmitButton() {
        allPages.allProductsPage().buttonSubmitReviewProduct.click();
    }
    @Then("Verify success message Thank you for your review.")
    public void verifySuccessMessageThankYouForYourReview() {
        assertTrue(allPages.allProductsPage().textThankYouForYourReviewProduct.isDisplayed());
    }
}
