package stepdefinitions;

import io.cucumber.java.en.And;
import utilities.Driver;


public class T26_ScrollUpStepDefinition {

    @And("Scroll up page to top")
    public void scrollUpPageToTop() {
        Driver.scrollTopJS();
    }
}