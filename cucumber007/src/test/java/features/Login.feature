Feature: Innsight Login
Scenario Outline: Login functionality for Innsight.
Given user navigates to Innsight
When I enter Username as "<username>" and Password as "<password>"
And click on login button
Then login should be unsuccessful



Examples:
| username  | password  | 
| pravesh | Pravesh@3214# | 
| usermfid12 | UP123456 |


