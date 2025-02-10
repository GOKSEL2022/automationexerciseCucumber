@Subscription_Cart_page
Feature:Verify Subscription in Cart page
  Scenario:Verify Subscription in Cart page

 Given Navigate to url "http://automationexercise.com"
  When Verify that home page is visible successfully
  And Click Cart button
  And Scroll down to footer
  And Verify text SUBSCRIPTION
  When Enter email address "gokselcelik@gmail.com" in input and click arrow button
  Then Verify success message You have been successfully subscribed! is visible
