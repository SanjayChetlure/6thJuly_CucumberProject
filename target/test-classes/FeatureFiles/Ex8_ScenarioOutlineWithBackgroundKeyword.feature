Feature: login feature with Scenario outline

Background:
Given user in at signup page

Scenario Outline: login to application
When user enters name as "<name>" inside form
And user enters age as <Age> 
And user confirm gender as "<gender>"
Then user gets created

Examples:
| name | Age | gender |
| rahul | 21 |  male |
| mahesh | 22 |  male |
| Priti | 25 |  female |

Scenario: url verification
Then url should contain "login"
