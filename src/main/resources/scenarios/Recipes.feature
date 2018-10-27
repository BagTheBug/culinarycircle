Feature: Recipes 

Scenario: Validate availabitity of recipes 
	Given Launch site "${site.url}" 
	Then Go to Recipe Page 
	And Validate Recipes Displayed

Scenario: Search for Recipe 
	Given Launch site "${site.url}" 
	Then Go to Recipe Page 
	And Get a random recipe name available 
	Then Enter the recipe name in search box
	And Click Search icon
	Then Validate the recipes search result for particular recipe 
	
Scenario: Recipe Details 
	Given Launch site "${site.url}" 
	Then Go to Recipe Page 
	And Select a Recipe 
	Then Validate the recipe details page