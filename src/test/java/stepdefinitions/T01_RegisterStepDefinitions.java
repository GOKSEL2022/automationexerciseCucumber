package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AccountCreatedPage;
import pages.LoginPage;
import pages.SignupPage;
import utilities.Driver;

public class T01_RegisterStepDefinitions {
    LoginPage loginPage=new LoginPage();
    SignupPage signupPage=new SignupPage();
    AccountCreatedPage accountCreatedPage=new AccountCreatedPage();
    Faker faker=new Faker();

    @Given("Navigate to url {string}")
    public void navigate_to_url_gider(String string) {
        Driver.getDriver().get(string);

    }
    @When("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Automation"));

    }
    @When("Click on Signup_Login button")
    public void click_on_signup_login_button() {
        loginPage.buttonSignupLogin.click();


    }
    @When("Verify New User Signup! is visible")
    public void verify_new_user_signup_is_visible() {
        Assert.assertTrue(loginPage.textNewUserSignup.isDisplayed());
        Driver.wait(3);

    }
    @When("Enter name {string}")
    public void enter_name(String string) {
        loginPage.boxName.sendKeys(string);


    }
    @When("Enter email address {string}")
    public void enter_email_address(String string) {
     //   loginPage.boxRegisterEmail.sendKeys(faker.internet().emailAddress());
        loginPage.boxRegisterEmail.sendKeys(string);

    }
    @When("Click Signup button")
    public void click_signup_button() {
        loginPage.buttonSignup.click();

    }
    @When("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verify_that_enter_account_ınformatıon_is_visible() {
        Assert.assertTrue(signupPage.textEnterAccountInformation.isDisplayed());



    }
    @When("Enter Title select")
    public void enter_title_select() {
        signupPage.radioMr.click();

    }
    @When("Enter Register name {string}")
    public void enter_register_name(String string) {
        signupPage.signupName.clear();
        signupPage.signupName.sendKeys(string);


    }
    @When("Enter password {string}")
    public void enter_password(String string) {
        signupPage.signupPassword.sendKeys(string);

    }
    @When("Enter day of birth {string}")
    public void enter_day_of_birth(String string) {

        Driver.selectByVisibleText(signupPage.signupDay,string);


    }
    @When("Enter month of birth {string}")
    public void enter_month_of_birth(String string) {
        signupPage.signupMonth.sendKeys(string);

    }
    @When("Enter year of birth {string}")
    public void enter_year_of_birth(String string) {
        signupPage.signupYears.sendKeys(string);

    }
    @When("Select checkbox Sign up for our newsletter!")
    public void select_checkbox_sign_up_for_our_newsletter() {
        Driver.waitAndClick(signupPage.checkBox1Signup,5);

    }
    @When("Select checkbox Receive special offers from our partners!")
    public void select_checkbox_receive_special_offers_from_our_partners() {
        Driver.waitAndClick(signupPage.checkBox2Receive,5);

    }
    @When("Enter firstname {string}")
    public void enter_firstname(String string) {
        signupPage.boxFirstname.sendKeys(string);

    }
    @When("Enter lastname  {string}")
    public void enter_lastname(String string) {
        signupPage.boxLastname.sendKeys(string);

    }
    @When("Enter company {string}")
    public void enter_company(String string) {
        signupPage.boxCompany.sendKeys(string);

    }
    @And("Enter adressOne {string}")
    public void enterAdress(String arg0) {
        signupPage.boxAddress1.sendKeys(arg0);
    }
    @And("Enter adressTwo {string}")
    public void enterAdressTwo(String arg0) {
        signupPage.boxAddress2.sendKeys(arg0);
    }
    @When("Enter country {string}")
    public void enter_country(String string) {
        signupPage.countryDropdown.sendKeys(string);

    }
    @When("Enter state {string}")
    public void enter_state(String string) {
        signupPage.boxState.sendKeys(string);

    }
    @When("Enter city {string}")
    public void enter_city(String string) {
        signupPage.boxCity.sendKeys(string);

    }
    @When("Enter zipcode {string}")
    public void enter_zipcode(String string) {
        signupPage.boxZipcode.sendKeys(string);

    }
    @When("Enter mobile number {string}")
    public void enter_mobile_number(String string) {
        signupPage.boxMobileNumber.sendKeys(string);

    }
    @When("Click Create Account button")
    public void click_create_account_button() {
        signupPage.buttonCreateAccount.click();




    }
    @When("Verify that ACCOUNT CREATED! is visible")
    public void verify_that_account_created_is_visible() {
        Assert.assertTrue(accountCreatedPage.textCreateAccount.isDisplayed());

    }
    @When("Click Continue button")
    public void click_continue_button() {
        Driver.wait(2);
        accountCreatedPage.buttonAccountContinue.click();
        Driver.getDriver().navigate().refresh();
        accountCreatedPage.buttonAccountContinue.click();

    }
    @When("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {
        Assert.assertTrue(accountCreatedPage.textLoggedUsername.isDisplayed());


    }
    @When("Click Delete Account button")
    public void click_delete_account_button() {
      //  accountCreatedPage.buttonDeleteAccount.click();


    }
    @Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verify_that_account_deleted_is_visible_and_click_continue_button() {
       // Assert.assertTrue(accountCreatedPage.textAccountDeleted.isDisplayed());

    }

}
