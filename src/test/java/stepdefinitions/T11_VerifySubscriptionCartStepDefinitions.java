package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class T11_VerifySubscriptionCartStepDefinitions {
    LoginPage loginPage=new LoginPage();

    @And("Click Cart button")
    public void clickCartButton() {
        loginPage.buttonCart.click();
    }

    @When("Enter email address {string} in input and click arrow button")
    public void enterEmailAddressInInputAndClickArrowButton(String string) {
        loginPage.boxEmailCart.sendKeys(string);
        loginPage.buttonSubscriptionEmail.click();

    }
}
