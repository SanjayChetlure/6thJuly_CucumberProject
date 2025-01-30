Feature: login scenario

Background:
Given user should be at login
When user enter username as "standard_user"
And user enter password as "secret_sauce"
And user click on login button

Scenario: S1- login with valid crdentials
Then Home page should be visible with logo Text "Swag Labs"

Scenario: S2-logout from app
When user click on openMenu button
And user click on logout button

Scenario: S2-verify Product Name
Then product name should be "Sauce Labs Onesie"

Scenario: S4-verify Product Price
Then product price should be 7.99

Scenario: S5-verify All Product Size
Then product size should be 6

Scenario: S6-verify All Product Price Sum
Then all product price should be  129.94
