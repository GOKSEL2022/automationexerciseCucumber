package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ContactPage;
import pages.LoginPage;
import utilities.Driver;

public class T06_ContactUsFormStepDefinitions {
    LoginPage loginPage=new LoginPage();
    ContactPage contactPage=new ContactPage();

    @And("Click on Contact Us button")
    public void clickOnContactUsButton() {
        loginPage.buttonContactUs.click();

    }

    @And("Verify GET IN TOUCH is visible")
    public void verifyGETINTOUCHIsVisible() {
        Assert.assertTrue(contactPage.textGetInTouch.isDisplayed());
    }

    @And("Enter contact name {string}")
    public void enterContactName(String string) {
        contactPage.boxContactName.sendKeys(string);
    }

    @And("Enter contact email {string}")
    public void enterContactEmail(String string) {
        contactPage.boxContactEmail.sendKeys(string);
    }

    @And("Enter subject {string}")
    public void enterSubject(String string) {
        contactPage.boxContactSubject.sendKeys(string);
    }

    @And("Enter message {string}")
    public void enterMessage(String string) {
        contactPage.boxContactMessage.sendKeys(string);
    }

    @And("Upload file")
    public void uploadFile() {
    contactPage.buttonContactUploadFile.sendKeys("C:\\Users\\Lenovo\\Desktop\\1.png");
    }

    @And("Click Submit button")
    public void clickSubmitButton() {

        Driver.clickWithJS(contactPage.buttonContactSubmit);
        Driver.wait(10);

    }

    @And("Click OK button")
    public void clickOKButton() {


    }

    @When("Verify success message Success! Your details have been submitted successfully. is visible")
    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {
        Assert.assertTrue(contactPage.textContactAlertSuccessMessage.isDisplayed());
    }

    @Then("Click Home button and verify that landed to home page successfully")
    public void clickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() {
        contactPage.buttonContactHome.click();
        Assert.assertEquals("https://automationexercise.com/",Driver.getDriver().getCurrentUrl());
    }
}
