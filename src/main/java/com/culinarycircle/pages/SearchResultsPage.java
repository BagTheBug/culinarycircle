package com.culinarycircle.pages;

import java.util.List;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class SearchResultsPage {
	@FindBy(locator = "searchResults.list")
	private List<QAFWebElement> searchResults;

	public void validate_SearchResults() {
		
	}
}
