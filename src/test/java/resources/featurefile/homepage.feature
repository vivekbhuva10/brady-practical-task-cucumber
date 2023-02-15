Feature: Home Page
  As user I want to sign in to the application

  Scenario: User should Navigate to sign in page
    Given I am on homepage
    When I click on sign in button
    And I click on Email button
    And I enter email "test01041998@outlook.com"
    And I enter password "Vivek1998"
    And I click on email sign in button
   And I Select Asia Tab
   And Using search box on the top of page, search for currency pair "FX:GBPJPY" and click See overview button
   Then I Verify that I am on correct page