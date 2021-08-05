Feature: Innsight Login
@smoke
  Scenario: Verify the Login of Innsight Application
    Given User Navigates to login page
    When user enter valid <username> as "pravesh" and  <password> as "Pravesh@#321"
    And click on login button
    Then user should Login successfully
