Feature: Login Test

Scenario Outline: fb test
Given user launch chrome browser
And user load fb url
When user enter valid credential "<username>" and <"password">
Then user click login button
And user Validate test

Examples:

|username| |password|
|yamini| |pass123|
|bala| |pass279|


Scenario Outline: insta test
Given user launch chrome browser
And user load insta url
When user enter insta valid credential "<usernamee>" and <"passwordd">
Then user click insta login button


Examples:

|usernamee| |passwordd|
|yamini| |pass123|
|bala| |pass279|