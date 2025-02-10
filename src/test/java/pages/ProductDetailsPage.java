package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductDetailsPage {
    public ProductDetailsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='quantity']")
    public WebElement boxQuantity;
    @FindBy(xpath = "//button[@class='btn btn-default cart']")
    public WebElement buttonAddToCart;

}
