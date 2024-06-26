Feature: Login
  Scenario: Validate user is able to login
    Given User navigates to the portal login page
    When User successfully enters the login details
    Then User should be able to view the Homepage
