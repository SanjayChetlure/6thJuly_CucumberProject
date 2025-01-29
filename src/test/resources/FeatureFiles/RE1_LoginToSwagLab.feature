Feature: login scenario

Scenario: login with valid crdentials
Given user should be at login
When user enter username as "standard_user"
When user enter password as "secret_sauce"
When user click on login button
Then Home page should be visible with logo Text "Swag Labs"
