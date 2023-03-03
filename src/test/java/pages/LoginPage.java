package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
        public LoginPage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy(xpath =" //a[.=' Signup / Login']" ) public WebElement buttonSignupLogin;
        @FindBy(xpath = "//*[.='New User Signup!']") public WebElement textNewUserSignup;
        @FindBy(xpath = "//*[@name='name']") public WebElement boxName;
        @FindBy(xpath = "(//*[@name='email'])[2]") public WebElement boxRegisterEmail;
        @FindBy(xpath = "//*[.='Signup']") public WebElement buttonSignup;
        @FindBy(xpath = "//h2[.='Login to your account']") public WebElement textLoginToYourAccount;
        @FindBy(xpath = "//*[@data-qa='login-email']") public WebElement boxLoginEmail;
        @FindBy(xpath = "//*[@data-qa='login-password']") public WebElement boxLoginPassword;
        @FindBy(xpath = "//*[@data-qa='login-button']") public WebElement buttonLogin;
        @FindBy(xpath = "//*[.='Your email or password is incorrect!']")public WebElement textIncorrectMesaj;
        @FindBy(xpath = "//a[@href='/logout']") public WebElement buttonLogout;
        @FindBy(xpath = "//*[.='Email Address already exist!']")public WebElement textEmailAddressAlreadyExistMesaj;

        @FindBy(xpath = "//a[@href='/contact_us']") public WebElement buttonContactUs;

        @FindBy(xpath = "(//*[.=' Test Cases'])[1]") public WebElement buttonLoginTestCase;
        @FindBy(xpath = "//b[.='Test Cases']") public WebElement textLoginTestCase;
        @FindBy(xpath = "//*[@class='material-icons card_travel']") public WebElement buttonProducts;

        @FindBy(xpath = "//*[.='Subscription']") public WebElement textSubscription;
        @FindBy(xpath = "//*[@id='susbscribe_email']") public WebElement boxSubscriptionEmail;
        @FindBy(xpath = "//*[@class='fa fa-arrow-circle-o-right']") public WebElement buttonSubscriptionEmail;
        @FindBy(xpath = "//*[@class='alert-success alert']") public WebElement textAlertSuccesSubscription;
        @FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[1]") public  WebElement buttonCart;
        @FindBy(id = "susbscribe_email") public WebElement boxEmailCart;
        @FindBy(xpath = "(//i[@class='fa fa-plus-square'])[1]") public WebElement buttonViewProduct;
        @FindBy(xpath = "//*[.='Proceed To Checkout']") public WebElement buttonProceedToCheckout;
        @FindBy(xpath = "//u[text()='Register / Login']") public WebElement buttonRegisterLogin;
        @FindBy(xpath = "//*[@href='/delete_account']")public WebElement buttonDeleteAccount;

    }


