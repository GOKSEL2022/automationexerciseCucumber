@RemoveProducts
Feature:Remove_Products_From_Cart

  Scenario: Test Case 17: Remove Products From Cart

    Given Navigate to url "http://automationexercise.com"
    When Verify that home page is visible successfully

    And Add products to cart
#    eksik adim var   "And Click Continue Shopping button" EKLEDIM
    And Click Continue Shopping button
    And Click Cart button
    And Verify that cart page is displayed
    And Click X button corresponding to particular product
    Then Verify that product is removed from the cart