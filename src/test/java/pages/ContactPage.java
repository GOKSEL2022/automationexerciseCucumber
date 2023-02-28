package pages;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactPage {
    public ContactPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h2[contains(text(),'Get In Touch')]") public WebElement textGetInTouch;
    @FindBy(xpath = "//input[@name='name']") public WebElement boxContactName;
    @FindBy(xpath = "//input[@name='email']") public WebElement boxContactEmail;
    @FindBy(xpath = "//input[@name='subject']") public WebElement boxContactSubject;
    @FindBy(xpath = "//*[@name='message']") public WebElement boxContactMessage;
    @FindBy(xpath = "//*[@name='upload_file']") public WebElement buttonContactUploadFile;
    @FindBy(xpath = "//input[@type='submit']") public WebElement buttonContactSubmit;
    @FindBy(xpath = "//div[@class='status alert alert-success']") public WebElement textContactAlertSuccessMessage;
    @FindBy(xpath = "/i[@class='fa fa-angle-double-left']") public WebElement buttonContactHome;

}
