Feature: Navigation 
Scenario: Validate Recipe Details 
	Given Launch site "${site.url}" 
	Then Go to Recipe Page 
	Then Get details of recipe "${recipe.name}" 
	
Scenario: Recipe with specific ingredient 
	Given Launch site "${site.url}" 
	Then Go to Recipe Page 
	Then Get recipe names with ingredient "${recipe.ingredient.name}" 
	
Scenario: Validate Recipe details expected view 
	Given Launch site "${site.url}" 
	Then Go to Recipe Page 
	And Select a random recipe 
	Then Validate the expected content available in recipe details 
	
Scenario: Validate third party links 
	Given Launch site "${site.url}" 
	Then Go to Recipe Page 
	And Select a random recipe
	Then Validate Facebook and Pintrest links in recipe details page
	