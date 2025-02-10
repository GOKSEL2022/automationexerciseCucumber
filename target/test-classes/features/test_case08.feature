@product
Feature:Verify All Products
  Scenario:Verify All Products and product detail page

  Given Navigate to url "http://automationexercise.com"
  And Verify that home page is visible successfully
  And Click on Products button
  And Verify user is navigated to ALL PRODUCTS page successfully
  And The products list is visible
  And Click on View Product of first product
  When User is landed to product detail page
  Then Verify that detail detail is visible: product name, category, price, availability, condition, brand