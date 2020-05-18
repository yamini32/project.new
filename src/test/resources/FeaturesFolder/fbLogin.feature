Feature: Facebook Login Function Test
Scenario: User Test Valid Login Creditial
Given user launch chrome browser
And user load url
When user enter valid credential
| FirstName | SurName | Mobilenumber |NewPassword |
|Yamini| B | 90030 | jsgawir|
|Bala |murali|9632|hjgajwf|

Then user click login button
And user Validate test