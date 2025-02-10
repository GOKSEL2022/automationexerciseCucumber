package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import utilities.Driver;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.clickWithJS;
import static utilities.Driver.scrollBottomJS;
import static utilities.ReusableMethods.clickWithTimeOut;
import static utilities.ReusableMethods.hover;
public class T14_RegisterWhileCheckoutStepDefinitions {
    AllPages allPages=new AllPages();
    Actions actions=new Actions(Driver.getDriver());
    @And("Add products to cart")
    public void addProductsToCart() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        wait(1);
        hover(allPages.allProductsPage().firstProductPicture);
        wait(5);
        allPages.allProductsPage().buttonAddToCartFirst.click();
        wait(2);
    }
    @And("Verify that cart page is displayed")
    public void verifyThatCartPageIsDisplayed() {
        assertTrue(Driver.getDriver().getCurrentUrl().contains("view_cart"));
    }
    @And("Click Proceed To Checkout")
    public void clickProceedToCheckout() {
        allPages.checkoutPage().buttonProceedToCheckout.click();
    }
    @And("Click Register_Login button")
    public void clickRegister_LoginButton() {
        allPages.checkoutPage().buttonRegisterLogin.click();
    }
    @And("Click Proceed To Checkout button")
    public void clickProceedToCheckoutButton() {
        allPages.checkoutPage().buttonProceedToCheckout.click();
    }
    @And("Verify Address Details and Review Your Order")
    public void verifyAddressDetailsAndReviewYourOrder() {
        assertTrue(allPages.checkoutPage().textAddressDetails.isDisplayed());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        clickWithTimeOut(allPages.checkoutPage().textReviewYourOrder, 10);
        assertTrue(allPages.checkoutPage().textReviewYourOrder.isDisplayed());
    }
    @And("Enter description in comment text area and click Place Order")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() {
        scrollBottomJS();
        allPages.checkoutPage().boxMessage.sendKeys("thanks");
        allPages.checkoutPage().buttonPlaceOrder.click();
    }
    @And("Enter payment Name on Card {string}")
    public void enterPaymentNameOnCard(String string) {
        allPages.paymentPage().boxNameOnCard.sendKeys(string);
    }
    @And("Enter payment Card Number {string}")
    public void enterPaymentCardNumber(String string) {
        allPages.paymentPage().boxCardNumber.sendKeys(string);
    }
    @And("Enter payment CVC {string}")
    public void enterPaymentCVC(String string) {
        allPages.paymentPage().boxCVC.sendKeys(string);
    }
    @And("Enter payment Expiration {string}")
    public void enterPaymentExpiration(String string) {
        allPages.paymentPage().boxExpirationMonth.sendKeys(string);
    }
    @And("Enter date {string}")
    public void enterDate(String string) {
        allPages.paymentPage().boxExpirationYear.sendKeys(string);
    }
    @And("Click Pay and Confirm Order button")
    public void clickPayAndConfirmOrderButton() throws InterruptedException {
        wait(5);
        allPages.paymentPage().buttonPayAndConfirmOrder.click();
        wait(5);
    }
    @And("Verify success message Your order has been placed successfully!")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {
        //Driver.waitAndGetText(allPages.paymentPage().textSuccessMessage, 5);
        assertTrue(allPages.paymentPage().textSuccessMessage.isDisplayed());
    }
    @Then("Verify ACCOUNT DELETED! and click Continue button")
    public void verifyACCOUNTDELETEDAndClickContinueButton() throws InterruptedException {
        clickWithJS(allPages.orderPlacedPage().buttonContinue);
        wait(2);
       // allPages.orderPlacedPage().buttonContinue.click();
        assertTrue(allPages.loginPage().buttonSignupLogin.isDisplayed());
    }
}

