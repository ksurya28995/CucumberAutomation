Feature: This is to check PhpTravels.com functionality

@chrome
@loginCheck
Scenario: This is to check login
Given open "phpTravelUrl" in the browser
When navigate to "Homepage" site
And login to the WebPortal
Then logout from the WebPortal

@quit
@signUpCheck
Scenario: This is to check login
Given open "phpTravelUrl" in the browser
When navigate to "Homepage" site
And signUp on the phpTravels
Then logout from the WebPortal