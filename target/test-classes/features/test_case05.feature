@existing_email
Feature:existing email

  Scenario:Test Case 5: Register User with existing email
    Given  Navigate to url "http://automationexercise.com"
    And Verify that home page is visible successfully
    And Click on Signup_Login button
    And Verify New User Signup! is visible
    And Enter name "ferha"
    And already registered email address "fe1@bay.com"
    And Click Signup button
    Then Verify error Email Address already exist! is visible