Feature: Facebook Login Test

Scenario: User enter valid details
Given user launch chrome browser
And user load url
When user enter valid credential
Then user click login button
And user Validate test


Scenario: User enter Ivalid details
Given user launch chrome browser
And user load url
When user enter Invalid credential
Then user click login button
And user Validate test

Scenario: User enter Valid Signup details
Given user launch chrome browser
And user load url
When user enter valid singup details
Then user click login button
And user Validate test

Scenario: User enter Invalid signup details
Given user launch chrome browser
And user load url
When user enter invalid signup details
Then user click login button
And user Validate test

Scenario: User enter Sample details
Given user launch chrome browser
And user load url
When user enter samle details
Then user click login button
And user Validate test


