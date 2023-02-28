@LoginCorrect
Feature: autometion_exercise
  Scenario: TC02_Login_User_With_Correct_Email_And_Password



  Given Navigate to url "http://automationexercise.com"
  Then Verify that home page is visible successfully
  And  Click on Signup_Login button
  And  Verify Login to your account is visible
  And  Enter correct email adress "ferhat10@gmail.com"
  And  Enter correct password "123456"
  And  Click login button
  And  Verify that Logged in as username is visible
  When Click Delete Account button
  Then Verify that ACCOUNT DELETED! is visible