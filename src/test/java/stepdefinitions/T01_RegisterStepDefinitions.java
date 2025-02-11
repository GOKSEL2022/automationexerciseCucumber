package stepdefinitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.AccountCreatedPage;
import pages.AllPages;
import pages.LoginPage;
import pages.SignupPage;
import utilities.Driver;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.waitAndClick;

public class T01_RegisterStepDefinitions {
    AllPages allPages=new AllPages();
    Faker faker=new Faker();

    @Given("Navigate to url {string}")
    public void navigate_to_url_gider(String string) {
        Driver.getDriver().get(string);
    }
    @When("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        assertTrue(Driver.getDriver().getTitle().contains("Automation"));
    }
    @When("Click on Signup_Login button")
    public void click_on_signup_login_button() {
        allPages.loginPage().buttonSignupLogin.click();
    }
    @When("Verify New User Signup! is visible")
    public void verify_new_user_signup_is_visible() {
        assertTrue(allPages.loginPage().textNewUserSignup.isDisplayed());
        //Driver.wait(3);
    }
    @When("Enter name {string}")
    public void enter_name(String string) {
        allPages.loginPage().boxName.sendKeys(string);
    }
    @When("Enter email address {string}")
    public void enter_email_address(String string) {
        allPages.loginPage().boxRegisterEmail.sendKeys(faker.internet().emailAddress());
       // loginPage.boxRegisterEmail.sendKeys(string);
    }
    @When("Click Signup button")
    public void click_signup_button() {
        allPages.loginPage().buttonSignup.click();
    }
    @When("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verify_that_enter_account_ınformatıon_is_visible() {
        assertTrue(allPages.signupPage().textEnterAccountInformation.isDisplayed());
    }
    @When("Enter Title select")
    public void enter_title_select() {
        allPages.signupPage().radioMr.click();
    }
    @When("Enter Register name {string}")
    public void enter_register_name(String string) {
        allPages.signupPage().signupName.clear();
        allPages.signupPage().signupName.sendKeys(string);
    }
    @When("Enter password {string}")
    public void enter_password(String string) {
        allPages.signupPage().signupPassword.sendKeys(string);
    }
    @When("Enter day of birth {string}")
    public void enter_day_of_birth(String string) {
        //Driver.selectByVisibleText(signupPage.signupDay,string);
        new Select(allPages.signupPage().signupDay).selectByVisibleText(string);
    }
    @When("Enter month of birth {string}")
    public void enter_month_of_birth(String string) {
        allPages.signupPage().signupMonth.sendKeys(string);
    }
    @When("Enter year of birth {string}")
    public void enter_year_of_birth(String string) {
        allPages.signupPage().signupYears.sendKeys(string);
    }
    @When("Select checkbox Sign up for our newsletter!")
    public void select_checkbox_sign_up_for_our_newsletter() {
        waitAndClick(allPages.signupPage().checkBox1Signup,5);
    }
    @When("Select checkbox Receive special offers from our partners!")
    public void select_checkbox_receive_special_offers_from_our_partners() {
        waitAndClick(allPages.signupPage().checkBox2Receive,5);
    }
    @When("Enter firstname {string}")
    public void enter_firstname(String string) {
        allPages.signupPage().boxFirstname.sendKeys(string);
    }
    @When("Enter lastname  {string}")
    public void enter_lastname(String string) {
        allPages.signupPage().boxLastname.sendKeys(string);
    }
    @When("Enter company {string}")
    public void enter_company(String string) {
        allPages.signupPage().boxCompany.sendKeys(string);
    }
    @And("Enter adressOne {string}")
    public void enterAdress(String arg0) {
        allPages.signupPage().boxAddress1.sendKeys(arg0);
    }
    @And("Enter adressTwo {string}")
    public void enterAdressTwo(String arg0) {
        allPages.signupPage().boxAddress2.sendKeys(arg0);
    }
    @When("Enter country {string}")
    public void enter_country(String string) {
        allPages.signupPage().countryDropdown.sendKeys(string);
    }
    @When("Enter state {string}")
    public void enter_state(String string) {
        allPages.signupPage().boxState.sendKeys(string);
    }
    @When("Enter city {string}")
    public void enter_city(String string) {
        allPages.signupPage().boxCity.sendKeys(string);
    }
    @When("Enter zipcode {string}")
    public void enter_zipcode(String string) {
        allPages.signupPage().boxZipcode.sendKeys(string);
    }
    @When("Enter mobile number {string}")
    public void enter_mobile_number(String string) {
        allPages.signupPage().boxMobileNumber.sendKeys(string);
    }
    @When("Click Create Account button")
    public void click_create_account_button() {
        allPages.signupPage().buttonCreateAccount.click();
    }
    @When("Verify that ACCOUNT CREATED! is visible")
    public void verify_that_account_created_is_visible() {
        assertTrue(allPages.accountCreatedPage().textCreateAccount.isDisplayed());
    }
    @When("Click Continue button")
    public void click_continue_button() throws InterruptedException {
        wait(2);
        allPages.accountCreatedPage().buttonAccountContinue.click();
        Driver.getDriver().navigate().refresh();
        wait(2);
        allPages.accountCreatedPage().buttonAccountContinue.click();
    }
    @When("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {
        assertTrue(allPages.accountCreatedPage().textLoggedUsername.isDisplayed());
    }
    @When("Click Delete Account button")
    public void click_delete_account_button() {
        allPages.accountCreatedPage().buttonDeleteAccount.click();
    }
    @Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verify_that_account_deleted_is_visible_and_click_continue_button() {
        assertTrue(allPages.accountCreatedPage().textAccountDeleted.isDisplayed());
    }
}
