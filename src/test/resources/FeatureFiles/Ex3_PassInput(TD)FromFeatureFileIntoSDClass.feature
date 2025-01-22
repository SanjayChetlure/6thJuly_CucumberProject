Feature: Login functionality with Test Data
Scenario: login with valid credentials using TestData

Given user is at login page
When user enter UN as "abcd"
And user enter PWD as "xyz"
And user enter pin 1234
Then user profile picture should be visible

