package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AllProductsPage;
import pages.LoginPage;
import utilities.Driver;

public class T21_AddReviewOnProductStepDefinitions {
    AllProductsPage allProductsPage=new AllProductsPage();
    LoginPage loginPage=new LoginPage();
    Actions actions=new Actions(Driver.getDriver());
    @And("Click on View Product button")
    public void clickOnViewProductButton() {
        loginPage.buttonProducts.click();

    }

    @And("Verify Write Your Review is visible")
    public void verifyWriteYourReviewIsVisible() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.wait(2);
        allProductsPage.viewFirstProduct.click();
        Driver.wait(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(allProductsPage.textWriteYourReviewProduct.isDisplayed());

    }
    @And("Enter name is {string}")
    public void enterNameIs(String string) {
        allProductsPage.boxYourNameProduct.sendKeys(string);
    }

    @And("Enter email address is {string}")
    public void enterEmailAddressIs(String string) {
        allProductsPage.boxEmailAddressProduct.sendKeys(string);
    }
    @And("Enter review {string}")
    public void enterReview(String string) {
        allProductsPage.boxAddReviewHereProduct.sendKeys(string);
    }

    @And("Click is Submit button")
    public void clickIsSubmitButton() {
        allProductsPage.buttonSubmitReviewProduct.click();
    }

    @Then("Verify success message Thank you for your review.")
    public void verifySuccessMessageThankYouForYourReview() {
        Assert.assertTrue(allProductsPage.textThankYouForYourReviewProduct.isDisplayed());
    }


}
