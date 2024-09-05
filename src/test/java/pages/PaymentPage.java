package pages;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PaymentPage {
    public PaymentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@name='name_on_card']") public WebElement boxNameOnCard;
    @FindBy(xpath = "//*[@name='card_number']") public WebElement boxCardNumber;
    @FindBy(xpath = "//*[@name='cvc']") public WebElement boxCVC;
    @FindBy(xpath = "//*[@name='expiry_month']") public WebElement boxExpirationMonth;
    @FindBy(xpath = "//*[@name='expiry_year']") public WebElement boxExpirationYear;
    @FindBy(xpath = "//*[@id='submit']") public WebElement buttonPayAndConfirmOrder;
    @FindBy(xpath = "//div[normalize-space(text()) = 'Your order has been placed successfully!']") public WebElement textSuccessMessage;
    //@FindBy(xpath = "(//div[@class='alert-success alert'])[1]") public WebElement textSuccessMessage;
    //@FindBy(xpath = "document.querySelector(\"#success_message > div\")") public WebElement textSuccessMessage;

}
