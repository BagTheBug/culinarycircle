package com.culinarycircle.steps;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.quantum.utils.ReportUtils;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import com.culinarycircle.pages.HomePage;
import com.culinarycircle.pages.RecipePage;

@QAFTestStepProvider
public class RecipesStepDef {
	RecipePage recipePage = new RecipePage();

	/**
	 * Clicks Recipe Page link
	 */
	@QAFTestStep(description = "Go to Recipe Page")
	public void goTo_RecipePage() {
		recipePage.click_RecipePageLink();
	}

	/**
	 * Validates number of recipes displayed
	 */
	@QAFTestStep(description = "Validate Recipes Displayed")
	public void validate_RecipesDisplayed() {
		if (recipePage.count_recipesDisplayed() == 8) {
			ReportUtils.reportComment("8 recipes displayed");
		} else {
			ReportUtils.reportComment("8 recipes are not displayed");
		}
	}

	/**
	 * Gets random recipe name displayed to perform search
	 */
	@QAFTestStep(description = "Get a random recipe name available")
	public void get_RecipeAvailable() {
		ConfigurationManager.getBundle().setProperty("SearchKey", recipePage.randomRecipeNameDisplayed());
	}

	/**
	 * Validates recipe search result produced for search key
	 */
	@QAFTestStep(description = "Validate the recipes search result for particular recipe")
	public void validate_RecipeSearchResult_ForParticularRecipe() {
		recipePage.validate_RecipeSearchResult();
	}
}
