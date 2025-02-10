package stepdefinitions;
import io.cucumber.java.en.*;
import static utilities.Driver.scrollTopJS;
public class T26_ScrollUpStepDefinition {
    @And("Scroll up page to top")
    public void scrollUpPageToTop() {
        scrollTopJS();
    }
}