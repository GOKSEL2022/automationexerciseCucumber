@Add_Products
Feature: Add Products in Cart

  Scenario:Test Case 12: Add Products in Cart
    Given Navigate to url "http://automationexercise.com"
    When Verify that home page is visible successfully
    And Click on Products button
    And Hover over first product and click Add to cart
    And Click Continue Shopping button
    And Hover over second product and click Add to cart
    And Click View Cart button
    When Verify both products are added to Cart
    Then Verify their prices, quantity and total price