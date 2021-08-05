Feature: Login Action
    Description: This feature will test a LogIn and LogOut functionality

  Scenario Outline: Login with valid and Invalid Credentials
    Given User is on Authshield Home Page
    When User navigate to Login Page
    Then User enters "<username>" and "<password>"
    Then User should get logged in
    And Message displayed Login Successfully

    Examples: 
      | username | password   |
      | Usermfid | UP11BZ5484 |

  Scenario: Successful logout from application
    When user logs out from application
    Then Message displayed Logout successfully
    And Browser quit by driver
