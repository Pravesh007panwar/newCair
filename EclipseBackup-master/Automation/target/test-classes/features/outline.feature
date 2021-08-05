Feature: outline
Scenario Outline: Login functionality for Authshield.
Given user navigates to Authshield
When I enter Username as "<username>" and Password as "<password>"
Then login should be unsuccessful



Examples:
| username  | password  | 
| usermfid | UP11BZ5484 | 
| usermfid12 | UP123456 |




