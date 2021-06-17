Feature: Application Login

  Scenario: Home Page default Login
    Given user is on landing page
    When user login into application with u and p
    Then Home page is populated
    And cards are displayed
    