@Loginbefore
Feature:Login before Checkout

  Scenario: Test Case 16: Place Order: Login before Checkout

    Given Navigate to url "http://automationexercise.com"
    When Verify that home page is visible successfully
    And Click on Signup_Login button

 #   And Fill email, password and click 'Login' button
 #   And Verify 'Logged in as username' at top
    And  Enter correct email adress "ferhat11020@gmail.com"
    And  Enter correct password "123456"
    And Click login button
    And  Verify that Logged in as username is visible
###########################################################
    And Add products to cart
#    eksik adim var   "And Click Continue Shopping button" EKLEDIM
    And Click Continue Shopping button
    And Click Cart button
    And Verify that cart page is displayed
    And Click Proceed To Checkout
    And Verify Address Details and Review Your Order
    And Enter description in comment text area and click Place Order

#    And Enter payment details: Name on Card, Card Number, CVC, Expiration date
    And Enter payment Name on Card "FERHAT"
    And Enter payment Card Number "123456789"
    And Enter payment CVC "123"
    And Enter payment Expiration "10"
    And Enter date "123"
    ##############################################
    And Click Pay and Confirm Order button
    And Verify success message Your order has been placed successfully!
    And Click Delete Account button
    Then Verify ACCOUNT DELETED! and click Continue button