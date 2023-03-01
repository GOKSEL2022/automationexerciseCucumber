@Subscrıptıon
Feature:Verify text SUBSCRIPTION
  Scenario:Verify text SUBSCRIPTION

  Given Navigate to url "http://automationexercise.com"
  And  Verify that home page is visible successfully
  And  Scroll down to footer
  And  Verify text SUBSCRIPTION
  When Enter email address "goksel@gmail.com"  in input and click arrow button
  Then Verify success message You have been successfully subscribed! is visible