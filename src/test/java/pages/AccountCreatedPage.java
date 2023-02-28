package pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AccountCreatedPage {
     public AccountCreatedPage(){
          PageFactory.initElements(Driver.getDriver(),this);
     }
     @FindBy(xpath = "(//*[.='Account Created!'])[2]") public WebElement textCreateAccount;
     @FindBy(xpath = "//*[@class='btn btn-primary']") public WebElement buttonAccountContinue;

     @FindBy(xpath = "//*[.='ferhat']") public WebElement textLoggedUsername;
     @FindBy(xpath = "(//*[.=' Delete Account'])[2]") public WebElement buttonDeleteAccount;
     @FindBy(xpath = "(//*[.='Account Deleted!'])[2]") public WebElement textAccountDeleted;
}
