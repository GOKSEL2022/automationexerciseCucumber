@search_product
Feature:Search Product
  Scenario:Search Product

  Given Navigate to url "http://automationexercise.com"
  And   Verify that home page is visible successfully
  And   Click on Products button
  And   Verify user is navigated to ALL PRODUCTS page successfully
  And   Enter product name "TSHIRTS" in search input and click search button
  And   Verify SEARCHED PRODUCTS is visible
  Then  Verify all the products related to search are visible