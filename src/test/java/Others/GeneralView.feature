Feature: General View
  Scenario: Validate User is able to view product without login
    Given User navigates to Product page
    When User clicks on formal shoes dropdown
    Then User should be able to view the products
