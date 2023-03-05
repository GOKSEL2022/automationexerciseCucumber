@beforeCheckout
Feature: Register before Checkout
  Scenario: Test Case 15: Place Order: Register before Checkout

    Given Navigate to url "http://automationexercise.com"
    When Verify that home page is visible successfully
    And Click on Signup_Login button
   # And Fill all details in Signup and create account
   # And Verify ACCOUNT CREATED! and click Continue button
   # And Verify Logged in as username at top
    And  Enter name "goksel52"
    And Enter email address "goksel52@celik.com"
    And  Click Signup button
    And Verify that ENTER ACCOUNT INFORMATION is visible
    And Enter Title select
    And Enter Register name "ferhat"
    And Enter password "123456"
    And Enter day of birth "5"
    And Enter month of birth "April"
    And Enter year of birth "1985"
    And Select checkbox Sign up for our newsletter!
    And Select checkbox Receive special offers from our partners!
    And Enter firstname "ferhat"
    And Enter lastname  "bay"
    And Enter company "tech"
    And Enter adressOne "carsamba"
    And Enter adressTwo "camas"
    And Enter country "Canada"
    And Enter state "akkus"
    And Enter city "ordu"
    And Enter zipcode "52300"
    And Enter mobile number "05017202125"
    And Click Create Account button
    And Verify that ACCOUNT CREATED! is visible
    And Click Continue button
    And Verify that Logged in as username is visible
    And Add products to cart
    And Click Cart button
    And Verify that cart page is displayed
    And Click Proceed To Checkout
    And Verify Address Details and Review Your Order
    And Enter description in comment text area and click Place Order
    And Enter payment Name on Card "FERHAT"
    And Enter payment Card Number "123456789"
    And Enter payment CVC "123"
    And Enter payment Expiration "10"
    And Enter date "123"
    And Click Pay and Confirm Order button
    And Verify success message Your order has been placed successfully!
    And Click Delete Account button
    Then Verify ACCOUNT DELETED! and click Continue button