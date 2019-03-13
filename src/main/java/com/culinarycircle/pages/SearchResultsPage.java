package com.culinarycircle.pages;

import java.util.List;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class SearchResultsPage {
	@FindBy(locator = "searchResults.list")
	private List<QAFWebElement> searchResults;

	@FindBy(locator = "searchResults.displayed")
	private List<QAFWebElement> searchResultsDisplayed;

	/**
	 * Validates Search Key produce exact result "SearchKey" (String) set in
	 * RecipeStepDef
	 */
	public void validate_SearchResults() {

		String SearchKey = (String) ConfigurationManager.getBundle().getProperty("SearchKey");
		// System.out.println(
		// ConfigurationManager.getBundle().getString("searchResults.displayed") +
		// "search results xpath");
		QAFExtendedWebElement searchedItem = new QAFExtendedWebElement(
				String.format(ConfigurationManager.getBundle().getString("searchResults.displayed"), SearchKey));
		searchedItem.verifyVisible();
	}

}
