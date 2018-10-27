package com.culinarycircle.steps;

import com.culinarycircle.pages.HomePage;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;

import cucumber.api.java.en.Given;

@QAFTestStepProvider
public class HomePageStepDef {

	HomePage homePage = new HomePage();

	/**
	 * Launches the Site of given URL
	 * 
	 * @param url
	 *            is the Site URL to be launched
	 */
	@QAFTestStep(description = "Launch site {0}")
	public void launch_Site(String url) {
		WebDriverTestBase chromeDriver = new WebDriverTestBase();
		chromeDriver.getDriver().get(url);
		chromeDriver.getDriver().manage().window().maximize();
	}

	@QAFTestStep(description = "Click Search icon")
	public void click_SearchIcon() {
		homePage.click_siteSearchIcon();
		;
	}

	@QAFTestStep(description = "Enter the recipe name in search box")
	public void enter_RecipeNameInSearchBox() {
		homePage.enter_siteSearchKey(ConfigurationManager.getBundle().getPropertyValue("SearchKey"));				
	}
}
