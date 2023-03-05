package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class AllProductsPage {
    public  AllProductsPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='title text-center']") public WebElement textAllProduct;
    @FindBy(xpath = "(//*[.='View Product'])[1]") public WebElement viewFirstProduct;
    @FindBy(xpath = "//*[.='Condition:']") public WebElement textDetailCondition;
    @FindBy(xpath = "//*[@id='search_product']") public WebElement boxSearchProduct;
    @FindBy(xpath = "//*[@id='submit_search']") public WebElement buttonSubmitSearchProduct;
    @FindBy(xpath = "//*[.='Searched Products']") public WebElement textSearchedProducts;
    @FindBy(xpath = "//*[@class='features_items']") public WebElement verifyAllProducts;
    @FindBy(xpath = "(//*[@data-product-id='1'])[2]") public WebElement buttonAddToCartFirst;
    @FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']") public WebElement buttonContinueShopping;
    @FindBy(xpath = "(//*[@data-product-id='2'])[2]") public WebElement buttonAddToCartTwo;
    @FindBy(xpath = "//u[.='View Cart']") public WebElement buttonViewCart;
    @FindBy(xpath = "//*[@src='/get_product_picture/1']") public WebElement firstProductPicture;
    @FindBy(xpath = "//*[@src='/get_product_picture/2']") public WebElement twoProductPicture;



    //18
    @FindBy(xpath = "//a[@href='/category_products/2']") public WebElement buttonWomenTopsProduct;
    @FindBy(xpath = "//h2[@class='title text-center']") public WebElement textWomenTopProducts;
    @FindBy(xpath = "//a[@href='#Men']") public WebElement buttonMenProduct;
    @FindBy(xpath = "//a[@href='/category_products/3']") public WebElement buttonMenTshırtsProduct;
    @FindBy(xpath = "//h2[@class='title text-center']") public WebElement textMenTshirtsProducts;


    //19

    @FindBy(xpath = "//h2[.='Brands']") public WebElement textBransdProducts;
    @FindBy(xpath = "//a[@href='/brand_products/Polo']") public WebElement buttonBrandProductsPolo;
    @FindBy(xpath = "//h2[@class='title text-center']") public WebElement textBrandPoloProducts;
    @FindBy(xpath = "//a[@href='/brand_products/H&M']") public WebElement buttonBrandProductsHM;
    @FindBy(xpath = "//h2[@class='title text-center']") public WebElement textBrandHMProducts;


}
