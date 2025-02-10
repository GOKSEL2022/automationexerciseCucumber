@SearchProductsVerifyCartAfterLogin

Feature:Search Products and Verify Cart After Login
  Scenario:Search Products and Verify Cart After Login
  Given Navigate to url "http://automationexercise.com"
  And Click on Products button
  And Verify user is navigated to ALL PRODUCTS page successfully
  And Enter product name "polo" in search input and click search button
  And Verify SEARCHED PRODUCTS is visible
  And Verify all the products related to search are visible
  And Add those products to cart
  And Click Cart button and verify that products are visible in cart
  And Click on Signup_Login button
  And  Enter correct email adress "ferhat01@gmail.com"
  And  Enter correct password "123456"
  And  Click login button
  And Again, go to Cart page
  And Verify that those products are visible in cart after login as well

