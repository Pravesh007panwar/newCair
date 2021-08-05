Feature: Insert Blacklist IP CSV File
Scenario: Check the Insertion of Blacklist Ip Using Valid Excel File
Given After successfully Login to Authshield 
Then click on Administration and click on Insert Blacklist IP
And Select a valid excel file using choose file option 
And click on submit button 
Then file should be successfully insert.

Scenario: Check the Insertion of Blacklist Ip Using InValid Excel File
When Select an Invalid excel file using choose file option 
And click on submit button 
Then file should not be successfully inserted.


Scenario: Check the Addition of Blacklist Ip Using ADDNEW button
When click on save button without putting the ip ranges
Then An alert should be come
When ADD a Valid IP range by putting Start Ip range and End Ip Range  
Then click on save button. 
Then Selected IP range should be Successfully Add

Scenario: Check the Addition of Blacklist Ip Using ADDNEW button
When ADD a INValid IP range by putting Start Ip range and End Ip Range  
And click on save button. 
Then Selected IP range should not be Successfully Add


Scenario: Check the Deletion of added Blacklist Ip range Using DELETE button
When click on Delete button without putting the ip ranges
Then An alert should be come
When Search an added IP range Valid IP range by putting Start Ip range 
And click on Search button. 
Then Selected IP range should come
When select the IP range and click on Delete button
Then The IP range should be delete Successfully


Scenario: Check the Update of added Blacklist Ip range Using Edit button
When Enter IP and click on Search button
Then click on edit button and update the New IP
And Click the save button 
Then The IP range should be Successfully update



