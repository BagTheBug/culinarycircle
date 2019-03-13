@search 
Feature: Search Results 
Scenario: Validate search - Positive
	Given Launch site "${site.url}" 
	Then Search for random item "${search.key.valid}"
	Then Validate the results produced
	
Scenario: Validate search - Negative
	Given Launch site "${site.url}" 
	Then Search for random item "${search.key.invalid}"
	Then Validate the results produced
	
Scenario: Time taken to produce results
 	Given Launch site "${site.url}" 
	Then Search for random item "${search.key.invalid}"
	Then Print the time logged