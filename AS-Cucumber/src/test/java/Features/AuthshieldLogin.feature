@FunctionalTest
Feature: Login To Authshield 
	Description: The Purpose of this feautre to Login Successfully



@SmokeTest
Scenario: Verify the Login of MFID 
	When User Enters Valid credentails to Login 
	When Click on Submit Button 
	Then user Should login Successfully 
@SmokeTest	
Scenario: Verify the Logout of MFID 
    When User Enters Valid credentails to Login 
    When Click on Submit Button
	When User select logout from AccountDropDown 
	Then User Should logout Successfully 
	
@SmokeTest
Scenario Outline: Verify the Login Using Invalid Credentials
    When User Enters Invalid "<username>" and Invalid "<Password>"
    When Click on Submit Button 
	Then User Should not login Successfully
	Examples:
	| username | | Password   |
	| user     | | Innefu@!@# |
	
@SmokeTest
Scenario: Verify Forgot Password
When User click on Forgot Password link
When user Enters Valid username
When select organization and Domain
When click on submit 