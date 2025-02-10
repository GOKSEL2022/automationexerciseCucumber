@ViewCartBrandProducts

Feature:ViewCartBrandProducts
  Scenario:View & Cart Brand Products

  Given Navigate to url "http://automationexercise.com"
  And Click on Products button
  And Verify that Brands are visible on left side bar
  And Click on any brand name
  And Verify that user is navigated to brand page and brand products are displayed
  And On left side bar, click on any other brand link
 Then Verify that user is navigated to that brand page and can see products
