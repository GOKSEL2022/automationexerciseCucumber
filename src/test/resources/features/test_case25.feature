@ScrollDownfunctionality
Feature:Scroll Down functionality
  Scenario:Test Case 25: Verify Scroll Up using 'Arrow' button and Scroll Down functionality
    Given Navigate to url "http://automationexercise.com"
    And Verify that home page is visible successfully
    And Scroll down page to bottom
    And Verify text SUBSCRIPTION
    And Click on arrow at bottom right side to move upward
    Then Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen