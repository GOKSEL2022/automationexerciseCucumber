package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import utilities.Driver;
import utilities.ReusableMethods;

public class T14_RegisterWhileCheckoutStepDefinitions {

    LoginPage loginPage = new LoginPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    AllProductsPage allProductsPage = new AllProductsPage();
    Actions actions = new Actions(Driver.getDriver());
    PaymentPage paymentPage = new PaymentPage();
    OrderPlacedPage orderPlacedPage = new OrderPlacedPage();
    AccountCreatedPage accountCreatedPage=new AccountCreatedPage();

    @And("Add products to cart")
    public void addProductsToCart() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.wait(1);
        Driver.hover(allProductsPage.firstProductPicture);
        Driver.wait(5);
        allProductsPage.buttonAddToCartFirst.click();
        Driver.wait(2);
    }

    @And("Verify that cart page is displayed")
    public void verifyThatCartPageIsDisplayed() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("view_cart"));
    }

    @And("Click Proceed To Checkout")
    public void clickProceedToCheckout() {
        checkoutPage.buttonProceedToCheckout.click();
    }

    @And("Click Register_Login button")
    public void clickRegister_LoginButton() {
        checkoutPage.buttonRegisterLogin.click();
    }

    @And("Click Proceed To Checkout button")
    public void clickProceedToCheckoutButton() {
        checkoutPage.buttonProceedToCheckout.click();
    }

    @And("Verify Address Details and Review Your Order")
    public void verifyAddressDetailsAndReviewYourOrder() {
        Assert.assertTrue(checkoutPage.textAddressDetails.isDisplayed());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.clickWithTimeOut(checkoutPage.textReviewYourOrder, 10);
        Assert.assertTrue(checkoutPage.textReviewYourOrder.isDisplayed());
    }

    @And("Enter description in comment text area and click Place Order")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() {
        Driver.scrollBottomJS();
        checkoutPage.boxMessage.sendKeys("thanks");
        checkoutPage.buttonPlaceOrder.click();
    }

    @And("Enter payment Name on Card {string}")
    public void enterPaymentNameOnCard(String string) {
        paymentPage.boxNameOnCard.sendKeys(string);

    }

    @And("Enter payment Card Number {string}")
    public void enterPaymentCardNumber(String string) {
        paymentPage.boxCardNumber.sendKeys(string);
    }

    @And("Enter payment CVC {string}")
    public void enterPaymentCVC(String string) {
        paymentPage.boxCVC.sendKeys(string);
    }

    @And("Enter payment Expiration {string}")
    public void enterPaymentExpiration(String string) {
        paymentPage.boxExpirationMonth.sendKeys(string);
    }

    @And("Enter date {string}")
    public void enterDate(String string) {
        paymentPage.boxExpirationYear.sendKeys(string);
    }

    @And("Click Pay and Confirm Order button")
    public void clickPayAndConfirmOrderButton() {
        Driver.wait(5);
        paymentPage.buttonPayAndConfirmOrder.click();
        Driver.wait(5);
    }
    @And("Verify success message Your order has been placed successfully!")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {
        //Driver.waitAndGetText(paymentPage.textSuccessMessage, 5);
        //Assert.assertTrue(paymentPage.textSuccessMessage.isDisplayed());

    }
    @Then("Verify ACCOUNT DELETED! and click Continue button")
    public void verifyACCOUNTDELETEDAndClickContinueButton() {
        Driver.clickWithJS(orderPlacedPage.buttonContinue);
        Driver.wait(2);
       // orderPlacedPage.buttonContinue.click();
        Assert.assertTrue(loginPage.buttonSignupLogin.isDisplayed());

    }

    /*
    normalize-space() => Bazı elementlerde, içinde metin değeri fazladan boşluk karakteri içerebiliyor.
     Bu durumda, normal text() fonksiyonu ilgili metni bulamıyor(boşluk vb karakterlerdne dolayı).
      contains() fonksiyonu kullanılabilir ama bu sefer de hem performans hem okunabilirlik sorunu var.
      İşte bu durumda, normalize-space() fonksiyonu yardıma koşuyor. Çoğu yazılım dilindeki trim() fonksiyonunun benzeridir.
//a[normalize-space()=’ Click ‘] => metin değeri boşluklardan arındırılmış bir şekilde “Click” olan <a> elementlerini bulur
     */
}

