@Scrolluppage
Feature:Verify Scroll Up
  Scenario:Test Case 26: Verify Scroll Up without 'Arrow' button and Scroll Down functionality
    Given Navigate to url "http://automationexercise.com"
    And Verify that home page is visible successfully
    And Scroll down page to bottom
    And Verify text SUBSCRIPTION
    And Scroll up page to top
    Then Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen