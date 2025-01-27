@regression
Feature: login functionality using background keyword

Background:
Given user is at login page        
When user enter UN									
And user enter PWD
And user click on login btn

@smoke
Scenario: S1: verify title
Then get title & verify

@smoke
Scenario: s2: verify profile
When user click on profile tab
Then verify profile name

@sanity
Scenario: s3: verify profile picture
When user click on profile tab
Then verify profile picture

Scenario: s4: logout from app
When user click on profile tab
Then user click on logout btn
