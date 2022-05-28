Feature: LeafTaps login functionality
Scenario: Login with positive credential
Given Open the chrome browser
And Load the application URL
And Enter username as 'DemosalesManager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed