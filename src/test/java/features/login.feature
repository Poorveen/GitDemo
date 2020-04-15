Feature: Login into Application

Scenario: Positive test validating Login

Given Initialize browser with chrom
And Naviagte to "http://qaclickacademy.com" site
And Click on Login link in home page to land on secure sign in page
When User enter "Username@gmail.com" and "Password" and log in
Then Verify that user login successfully logged in 
