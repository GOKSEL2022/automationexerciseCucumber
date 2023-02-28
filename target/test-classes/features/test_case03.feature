@incorrect
Feature:incorrect email and password

  Scenario: Test Case 3: Login User with incorrect email and password
    Given Navigate to url "http://automationexercise.com"
    When Verify that home page is visible successfully
    And Click on Signup_Login button
    And Verify Login to your account is visible
    And  Enter incorrect email address "xxx@xxx.com"
    And Enter incorrect password "xxx"
    And Click login button
    Then Verify error Your email or password is incorrect! is visible