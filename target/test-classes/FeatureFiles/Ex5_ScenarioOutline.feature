Feature: login feature with Scenario outline

Scenario Outline: login to application

Given  user in at signup page
When user enters name as "<name>" inside form
And user enters age as <Age> 
And user confirm gender as "<gender>"
And user enters mobNum as <mobileNumber> 
Then user gets created

Examples:
| name | Age | gender | mobileNumber |
| rahul | 21 |  male |   1111        |
| mahesh | 22 |  male |  2222        |
| Priti | 25 |  female | 3333        |
| Swati | 26 |  female | 4444        |
| amol | 27 |  male | 5555        |
