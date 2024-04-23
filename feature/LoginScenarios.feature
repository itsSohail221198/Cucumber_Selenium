@LoginScenarios
Feature: Sample Login feature

  Scenario: Validate whether we can login the application using Valid Credentials

    Given the URL is launched
    Then click the Login button in the Home Screen
    Then user enters the username as "it_is_sohail"
    Then user enters the password as "Sohail"
    Then click the login button in the login popup
    Then click the logout button
    Then close the browser