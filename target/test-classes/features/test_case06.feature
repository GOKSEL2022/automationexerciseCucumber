@contact_us_form
Feature:Contact Us Form
  Scenario:Contact Form

  Given Navigate to url "http://automationexercise.com"
  And Verify that home page is visible successfully
  And Click on Contact Us button
  And Verify GET IN TOUCH is visible
  And Enter contact name " Göksel"
  And Enter contact email " Goksel52@gmail.com"
  And Enter subject "Sayfa hatası"
  And Enter message "Adam gibi sayfa yapın"
  And Upload file
  And  Click Submit button
  And  Click OK button
  When Verify success message Success! Your details have been submitted successfully. is visible
  Then Click Home button and verify that landed to home page successfully