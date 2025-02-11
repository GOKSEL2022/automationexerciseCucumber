package stepdefinitions;
import io.cucumber.java.en.*;
import pages.AllPages;
import utilities.Driver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.clickWithJS;
public class T06_ContactUsFormStepDefinitions {
    AllPages allPages=new AllPages();
    @And("Click on Contact Us button")
    public void clickOnContactUsButton() {
        allPages.loginPage().buttonContactUs.click();
    }
    @And("Verify GET IN TOUCH is visible")
    public void verifyGETINTOUCHIsVisible() {
        assertTrue(allPages.contactPage().textGetInTouch.isDisplayed());
    }
    @And("Enter contact name {string}")
    public void enterContactName(String string) {
        allPages.contactPage().boxContactName.sendKeys(string);
    }
    @And("Enter contact email {string}")
    public void enterContactEmail(String string) {
        allPages.contactPage().boxContactEmail.sendKeys(string);
    }
    @And("Enter subject {string}")
    public void enterSubject(String string) {
        allPages.contactPage().boxContactSubject.sendKeys(string);
    }
    @And("Enter message {string}")
    public void enterMessage(String string) {
        allPages.contactPage().boxContactMessage.sendKeys(string);
    }
    @And("Upload file")
    public void uploadFile() {
        allPages.contactPage().buttonContactUploadFile.sendKeys("C:\\Users\\Lenovo\\Desktop\\1.png");
    }
    @And("Click Submit button")
    public void clickSubmitButton() throws InterruptedException {
        clickWithJS(allPages.contactPage().buttonContactSubmit);
        wait(10);
    }
    @And("Click OK button")
    public void clickOKButton() {
    }
    @When("Verify success message Success! Your details have been submitted successfully. is visible")
    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {
        assertTrue(allPages.contactPage().textContactAlertSuccessMessage.isDisplayed());
    }
    @Then("Click Home button and verify that landed to home page successfully")
    public void clickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() {
        allPages.contactPage().buttonContactHome.click();
        assertEquals("https://automationexercise.com/",Driver.getDriver().getCurrentUrl());
    }
}
