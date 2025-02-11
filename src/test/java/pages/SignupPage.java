package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignupPage {
    public SignupPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//*[.='Enter Account Information'])[2]")
    public WebElement textEnterAccountInformation;
    @FindBy(xpath = "//*[@id='id_gender1']")
    public WebElement radioMr;
    @FindBy(xpath = "//*[@id='name']")
    public WebElement signupName;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement signupPassword;
    @FindBy(xpath = "//*[@name='days']")
    public WebElement signupDay;
    @FindBy(xpath = "//*[@id='months']")
    public WebElement signupMonth;
    @FindBy(xpath = "//*[@id='years']")
    public WebElement signupYears;
    @FindBy(xpath = "//*[@id='newsletter']")
    public WebElement checkBox1Signup;
    @FindBy(xpath = "//*[@name='optin']")
    public WebElement checkBox2Receive;
    @FindBy(xpath = "//*[@id='first_name']")
    public WebElement boxFirstname;

    @FindBy(xpath = "//*[@id='last_name']")
    public WebElement boxLastname;

    @FindBy(xpath = "//*[@id='company']")
    public WebElement boxCompany;
    @FindBy(xpath = "//*[@id='address1']")
    public WebElement boxAddress1;
    @FindBy(xpath = "//*[@id='address2']")
    public WebElement boxAddress2;
    @FindBy(xpath = "//*[@id='country']")
    public WebElement countryDropdown;
    @FindBy(xpath = "//*[@id='state']")
    public WebElement boxState;
    @FindBy(xpath = "//*[@id='city']")
    public WebElement boxCity;
    @FindBy(xpath = "//*[@id='zipcode']")
    public WebElement boxZipcode;
    @FindBy(xpath = "//*[@id='mobile_number']")
    public WebElement boxMobileNumber;
    @FindBy(xpath = "(//*[@class='btn btn-default'])[1]")
    public WebElement buttonCreateAccount;



}
