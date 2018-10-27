package com.culinarycircle.utils;

import java.util.List;
import java.util.Random;

import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class Utils {

	/**
	 * Returns random WebElement from list of WebElements
	 * 
	 * @param webElements
	 *            - list of WebElements
	 * @return one WebElement
	 * @author Mullai Chezhiyan
	 */
	public QAFWebElement pickRandomWebElement(List<QAFWebElement> webElements) {
		Random rand = new Random();
		return webElements.get(rand.nextInt(webElements.size()));
	}

	/**
	 * Holds Automation execution for given time
	 * 
	 * @param millisecs
	 * @author Mullai Chezhiyan
	 */
	public void pause(long millisecs) {
		try {
			Thread.sleep(millisecs);
		} catch (InterruptedException e) {
		}
	}

}
