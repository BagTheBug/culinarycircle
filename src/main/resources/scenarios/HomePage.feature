Feature: Navigation 
Scenario: Home Page Navigation 
	Given Launch site "${site.url}" 
	And Validate headerlinks 
	Then Validate footerlinks 
	
Scenario: Products Page Navigation 
	Given Launch site "${site.url}" 
	And Validate the pages 
	