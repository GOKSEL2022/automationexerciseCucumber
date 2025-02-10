@AddReviewOnProduct
Feature: Add Review On Product
  Scenario: Add review on product
  Given Navigate to url "http://automationexercise.com"
  And Click on Products button
  And Verify user is navigated to ALL PRODUCTS page successfully
  And Click on View Product button
  And Verify Write Your Review is visible
  And Enter name is "Göksel"
  And Enter email address is "ferhat01@gmail.com"
  And  Enter review "review"
  And Click is Submit button
  Then Verify success message Thank you for your review.