package stepdefinitions;
import io.cucumber.java.en.*;
import pages.AllPages;
import static utilities.Driver.scrollIntoViewJS;
public class T26_ScrollUpStepDefinition {
    AllPages allPages=new AllPages();
    @And("Scroll up page to top")
    public void scrollUpPageToTop() {
    scrollIntoViewJS(allPages.allProductsPage().automationExcerciseTitleProduct);
    }
}