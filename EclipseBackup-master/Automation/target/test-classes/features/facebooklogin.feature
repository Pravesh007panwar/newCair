Feature: Login to My Facebook Account
Scenario Outline: Verify facebook login using valid Credentails
Given User navigates to Facebook Login Page using url "https://facebook.com"
When user enters a valid Emailid as "<email>" and valid Password as "<password>"
And clicks on login button
Then Successfully able to login into my facebook account

Examples:

|email| |password|
|testingq23@gmail.com| |Innefu@123|

@smokeTest
Scenario: Logout to my facebook Account
Given user should be at login account page
When user clicks at account option
When click on logout 
Then user account should be logout successfully
