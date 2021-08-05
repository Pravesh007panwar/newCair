Feature: Login To Webmail
@SmokeTest
Scenario: Verify the Login of Webmail using valid Credentails With GeoFencing Allowed

Given WebMail Login Page Should be Open
When User Enters Valid Username and Enters valid Password
And Click on Login SingIn Button
Then User should successfully Login 



Scenario: Verify the Login of Webmail using valid Credentails With GeoFencing Allowed

Given WebMail Login Page Should be Open
When User Enters Valid "pravesh@zimbra.com" and Enters valid "123123"
And Click on Login SingIn Button
Then User should successfully Login 


Scenario Outline: Verify the Login of Webmail using valid Credentails With GeoFencing Allowed

Given WebMail Login Page Should be Open
When User Enters Valid <usernmae> and Enters valid <password>
And Click on Login SingIn Button
Then User should successfully Login 

Examples:
|username|  |password|
|pravesh@zimbra.com|  |123123|


Scenario: Verify the Login of Webmail using valid Credentails With GeoFencing Allowed

Given WebMail Login Page Should be Open
When User Enters Valid <usernmae> and Enters valid <password>
                        |pravesh@zimbra.com| |123123|
And Click on Login SingIn Button
Then User should successfully Login 