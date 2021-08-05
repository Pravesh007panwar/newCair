Feature: Login Action 
    Description: This feature will test a LogIn and LogOut functionality


Scenario Outline: Login with valid and Invalid Credentials 

    Given User is on Authshield Home Page 
    When User navigate to Login Page
    Then User enters "<username>" and "<password>" 
    Then User should get logged in
    And Message displayed Login Successfully
    

Examples: 
        |username|password|Case|
        |abc@gmail.com|12345|Valid|
        |abc1@gmail.com|dfsd2|InValid|


Scenario: Successful logout from application 

    When user logs out from application 
    Then Message displayed Logout successfully 
    And Browser quit by driver