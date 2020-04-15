Feature: Login into Application

Scenario Outline: Positive test validating Login

Given Initialize browser with chrom
And Naviagte to "http://qaclickacademy.com" site
And Click on Login link in home page to land on secure sign in page
When User enter <username> and <password> and log in
Then Verify that user login successfully logged in 

Examples:
|username|password|
|abc@mail.com|12345|
|bcd@mail.com|123455|