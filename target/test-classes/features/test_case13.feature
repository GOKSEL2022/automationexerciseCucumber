@quantity
Feature:Product quantity

  Scenario:Test Case 13: Verify Product quantity in Cart
    Given Navigate to url "http://automationexercise.com"
    When Verify that home page is visible successfully
    And Click View Product for any product on home page
    And Verify product detail is opened
    And Increase quantity to four
    And Click Add to cart button
    And Click View Cart button
    Then Verify that product is displayed in cart page with exact quantity