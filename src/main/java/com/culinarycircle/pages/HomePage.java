package com.culinarycircle.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class HomePage extends WebDriverBaseTestPage{
	
	@FindBy(locator = "siteSearch.textBox")
	private QAFWebElement siteSearchTextBox;
	
	@FindBy(locator = "siteSearch.icon")
	private QAFWebElement siteSearchIcon;
	
	public void click_siteSearchIcon() {
		siteSearchIcon.click();
	}
	
	public void enter_siteSearchKey(String key) {
		siteSearchTextBox.sendKeys(key);
	}

	@Override
	protected void openPage(PageLocator arg0, Object... arg1) {
		// TODO Auto-generated method stub
		
	}

}
