Feature: To validate the signin functionality of amazon application
Scenario: To validate the signin with valid email id or mobile number and password
Given To launch the browser and maximize the window
When To lauch the url of amazon sigin page
And To click the Signin button
And To pass the valid email id or mobile number in email field
And To click the continue button
And To pass the valid password in password field
And To click the signin button
Then To close the browser

Scenario Outline: To validate the signin fuctionality of amazon application
Given user has to launch the browser and maximize the window
When user has to launch the url of amazon signin page
And user has to click the signin button
And user has to pass the valid data"<emaildata>" in email field
And user has to click the continue button
And user has to pass the valid data"<password>" in password field
And user has to click signin button
Then user has to close the browser

Examples:

|emaildata          |password  |
|ayuvi2001@gmail.com|Yuva@2011 |
|9600575685         |123456789 |
|9940833364         |yuvaraj   |
