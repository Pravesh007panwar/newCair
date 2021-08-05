Feature: verify Login funtionality
Scenario: Authshield login using valid credentials
Given user navigates to the website https://192.168.2.163/mfid
When User Navigate to Login Page
And user logs in through Login Window by using <Username> as "usermfid"
And <Password> as "UP11BZ5484"
Then login must be successful.
And close browsers




