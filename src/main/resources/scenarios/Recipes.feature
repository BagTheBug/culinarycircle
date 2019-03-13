@recipes
Feature: Recipes 
Scenario: Validate availabitity of recipes 
	Given Launch site "${site.url}" 
	Then Go to Recipe Page 
	And Validate Recipes Displayed 
	
Scenario: Validate availability of recipes in all  types 
	Given Launch site "${site.url}" 
	Then Go to Recipe Page 
	And Get all the option available
	Then  Validate Recipes Displayed for all options	
	
@try 
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
	And Select a recipe from available recipes 
	Then Validate the recipe details page