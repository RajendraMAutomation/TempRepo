Feature: CRM Login Feature 



Scenario: Search selenium test			#5555	# with header at step level # data table with map
Given User is already on login page
When User enter login credentials
	|username|password|
	|mauryar16@gmail.com|Rcogj@123|
Then User is on Home page
And Close browser