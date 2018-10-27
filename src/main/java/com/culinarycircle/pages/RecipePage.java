package com.culinarycircle.pages;

import java.util.List;

import com.culinarycircle.utils.Utils;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class RecipePage extends WebDriverBaseTestPage {

	@FindBy(locator = "recipePage.link")
	private QAFWebElement recipePageLink;

	@FindBy(locator = "recipeLayout.class")
	private QAFWebElement recipeLayoutClass;

	@FindBy(locator = "recipesDisplayed.list")
	private List<QAFWebElement> recipesDisplayed;

	Utils projectUtils = new Utils();
	SearchResultsPage searchResultsPage = new SearchResultsPage();

	public void click_RecipePageLink() {
		recipePageLink.click();
	}

	public int count_recipesDisplayed() {
		return recipesDisplayed.size();
	}

	public String randomRecipeNameDisplayed() {
		QAFWebElement RecipeName = projectUtils.pickRandomWebElement(recipesDisplayed);
		return RecipeName.getText();
	}

	public void validate_RecipeSearchResult() {
		searchResultsPage.validate_SearchResults();
	}

	@Override
	protected void openPage(PageLocator arg0, Object... arg1) {
		// TODO Auto-generated method stub

	}

}
