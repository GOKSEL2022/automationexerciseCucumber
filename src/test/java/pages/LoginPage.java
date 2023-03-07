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
        @FindBy(xpath = "//a[normalize-space()='Delete Account']")public WebElement buttonDeleteAccount;


        //18
        @FindBy(xpath = "//h2[.='Category']") public WebElement textLoginCategory;
        @FindBy(xpath = "//a[@href='#Women']") public WebElement buttonLoginWomen;
        @FindBy(xpath = "//a[@href='/category_products/1']") public WebElement buttonLoginWomenDress;

        //22
        @FindBy(xpath = "//h2[contains(text(),'recommended items')]") public WebElement textRecommendedİtemsLogin;
        @FindBy(xpath = "(//a[@data-product-id='5'])[3]") public WebElement buttonRecommennedAddToCartLogin;
        @FindBy(xpath = "(//a[@href='/view_cart'])[2]") public WebElement buttonRecommennedViewCartLogin;

        @FindBy(id = "scrollUp") public WebElement buttonScrollUp;
        @FindBy(xpath = "(//h2[.='Full-Fledged practice website for Automation Engineers'])[2]" )
        public WebElement textAutomationEngineers2;
        @FindBy(xpath = "(//h2[.='Full-Fledged practice website for Automation Engineers'])[1]" )
        public WebElement textAutomationEngineers1;

        @FindBy(xpath = "(//h2[.='Full-Fledged practice website for Automation Engineers'])[3]" )
        public WebElement textAutomationEngineers3;
    }


