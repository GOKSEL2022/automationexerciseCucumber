package pages;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CheckoutPage {
    public CheckoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//td[.='Price']") public WebElement textPriceCheckout;
    @FindBy(xpath = "//td[.='Quantity']") public WebElement textQuantityCheckout;
    @FindBy(xpath = "//td[.='Total']") public WebElement textTotalCheckout;
    @FindBy(xpath = "//*[@class='disabled']") public WebElement textExactQuantity;
    @FindBy(xpath = "//*[.='Proceed To Checkout']") public WebElement buttonProceedToCheckout;
    @FindBy(xpath = "//u[text()='Register / Login']") public WebElement buttonRegisterLogin;
    @FindBy(xpath = "//*[.='Address Details']") public WebElement textAddressDetails;
    @FindBy(xpath = "//*[.='Review Your Order']") public WebElement textReviewYourOrder;
    @FindBy(xpath = "//textarea[@name='message']") public WebElement boxMessage;
    @FindBy(xpath = "//*[.='Place Order']") public WebElement buttonPlaceOrder;
    @FindBy(xpath = "//i[@class='fa fa-times']") public WebElement buttonXDelete;
    @FindBy(xpath = "//*[@id='cart_info']") public WebElement textCartisEmpty;

    @FindBy(id = "cart_info_table") public WebElement textProductisDisplayed;
    @FindBy(xpath = "//*[@id='address_delivery']") public WebElement textAdressDelivery;
    @FindBy(xpath = "//*[@id='address_invoice']") public WebElement textAdressİnvoice;
    @FindBy(xpath = "//a[@href='/delete_account']") public WebElement buttonDeleteAccountCheckout;


}
