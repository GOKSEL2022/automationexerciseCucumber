@register
Feature:autometion_exercise
  Scenario:TC01_Register_User

    Given Navigate to url "http://automationexercise.com"
    When  Verify that home page is visible successfully
    And   Click on Signup_Login button
    And   Verify New User Signup! is visible
    And   Enter name "ferhat7"
    And   Enter email address "ferhat01@gmail.com"
    And   Click Signup button
    And   Verify that ENTER ACCOUNT INFORMATION is visible
    And   Enter Title select
    And   Enter Register name "ferhat"
    And   Enter password "123456"
    And   Enter day of birth "5"
    And   Enter month of birth "April"
    And   Enter year of birth "1985"
    And   Select checkbox Sign up for our newsletter!
    And   Select checkbox Receive special offers from our partners!
    And   Enter firstname "ferhat"
    And   Enter lastname  "bay"
    And   Enter company "tech"
    And   Enter adressOne "carsamba"
    And   Enter adressTwo "carsamba"
    And   Enter country "Canada"
    And   Enter state "akkus"
    And   Enter city "ordu"
    And   Enter zipcode "52300"
    And   Enter mobile number "05017202125"
    And   Click Create Account button
    And   Verify that ACCOUNT CREATED! is visible
    And   Click Continue button
    And   Verify that Logged in as username is visible
    When  Click Delete Account button
    Then  Verify that ACCOUNT DELETED! is visible and click Continue button