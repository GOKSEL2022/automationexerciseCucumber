package pages;

import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AllProductsPage {
    public AllProductsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='title text-center']") public WebElement textAllProduct;
    @FindBy(xpath = "(//*[.='View Product'])[1]") public WebElement viewFirstProduct;
    @FindBy(xpath = "//*[.='Condition:']") public WebElement textDetailCondition;


}
