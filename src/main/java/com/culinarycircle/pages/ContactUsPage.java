package com.culinarycircle.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.StringMatcher;
import com.quantum.utils.ReportUtils;

public class ContactUsPage extends WebDriverBaseTestPage {

	@FindBy(locator = "contactUsPage.link")
	private QAFWebElement contactUsPageLink;

	@FindBy(locator = "firstNameField.textBox")
	private QAFWebElement firstNameTextBox;

	@FindBy(locator = "lastNameField.textBox")
	private QAFWebElement lastNameTextBox;

	@FindBy(locator = "emailField.textBox")
	private QAFWebElement emailTextBox;

	@FindBy(locator = "phoneNumber.textBox")
	private QAFWebElement phoneNumberTextBox;

	@FindBy(locator = "streetAddress.textBox")
	private QAFWebElement streetAddressTextBox;

	@FindBy(locator = "cityField.textBox")
	private QAFWebElement cityTextBox;

	@FindBy(locator = "zipCodeField.textBox")
	private QAFWebElement zipCodeTextBox;

	@FindBy(locator = "contactTimeField.textBox")
	private QAFWebElement contactTimeTextBox;

	@FindBy(locator = "preferredShopField.textBox")
	private QAFWebElement preferredShopTextBox;

	@FindBy(locator = "occurenceTimeField.textBox")
	private QAFWebElement occurenceTimeTextBox;

	@FindBy(locator = "commentsField.textBox")
	private QAFWebElement commentsTextBox;

	@FindBy(locator = "submitForm.button")
	private QAFWebElement submitFormButton;

	@FindBy(locator = "state.dropDown")
	private QAFWebElement stateDropDown;

	@FindBy(locator = "title.dropDown")
	private QAFWebElement titleDropDown;

	@FindBy(locator = "country.dropDown")
	private QAFWebElement countyDropDown;

	@FindBy(locator = "errorMessage.txt")
	private QAFWebElement errorMessageText;

	@FindBy(locator = "thankYou.txt")
	private QAFWebElement thankYouText;

	@FindBy(locator = "successMessage.txt")
	private QAFWebElement successMessageText;

	@FindBy(locator = "firstName.invalid.errorMessage.txt")
	private QAFWebElement firstNameInvalidErrorMessageText;

	@FindBy(locator = "lastName.invalid.errorMessage.txt")
	private QAFWebElement lastNameInvalidErrorMessageText;

	@FindBy(locator = "email.invalid.errorMessage.txt")
	private QAFWebElement emailInvalidErrorMessageText;

	@FindBy(locator = "phoneNumber.invalid.errorMessage.txt")
	private QAFWebElement phoneNumberInvalidErrorMessageText;

	@Override
	protected void openPage(PageLocator arg0, Object... arg1) {
		// TODO Auto-generated method stub

	}

	public void goTo_ContactUsPageLink() {
		contactUsPageLink.click();
	}

	public void enter_FirstName(String firstName) {
		firstNameTextBox.sendKeys(firstName);
	}

	public void enter_LastName(String lastName) {
		lastNameTextBox.sendKeys(lastName);
	}

	public void enter_EmailAddress(String email) {
		emailTextBox.sendKeys(email);
	}

	public void enter_PhoneNumber(String phoneNumber) {
		phoneNumberTextBox.sendKeys(phoneNumber);
	}

	public void enter_StreetAddress(String streetAddress) {
		streetAddressTextBox.sendKeys(streetAddress);
	}

	public void enter_City(String city) {
		cityTextBox.sendKeys(city);
	}

	public void enter_ZipCode(String zipCode) {
		zipCodeTextBox.sendKeys(zipCode);
	}

	public void enter_Shop(String shopName) {
		preferredShopTextBox.sendKeys(shopName);
	}

	public void enter_OccurenceTimeTextBox(String occurenceTime) {
		occurenceTimeTextBox.sendKeys(occurenceTime);
	}

	public void enter_ContactTime(String contactTime) {
		contactTimeTextBox.sendKeys(contactTime);
	}

	public void enter_Comments(String comments) {
		commentsTextBox.sendKeys(comments);
	}

	public void click_SubmitFormButton() {
		submitFormButton.click();
	}

	public void Validate_ErrorMessageDisplayed(String errorMessage) {
		if (errorMessageText.isDisplayed()) {
			errorMessageText.verifyText(StringMatcher.contains(errorMessage));
		} else {
			ReportUtils.reportComment("Error Message Not Displayed");
		}
	}

	public void validate_SuccessMessage(String successMessage, String thankYou) {
		if (successMessageText.isDisplayed() && thankYouText.isDisplayed()) {
			successMessageText.verifyText(StringMatcher.contains(successMessage));
			thankYouText.verifyText(StringMatcher.contains(thankYou));
		} else {
			ReportUtils.reportComment("Contact Us Page Form Submission Success Message Not Displayed");
		}
	}

	public void validate_FirstNameInvalidErrorMessage(String errorMessage) {
		if (firstNameInvalidErrorMessageText.isDisplayed()) {
			firstNameInvalidErrorMessageText.verifyText(StringMatcher.contains(errorMessage));
		} else {
			ReportUtils.reportComment("Invalid First Name Error Message is not displayed");
		}
	}

	public void validate_LastNameInvalidErrorMessage(String errorMessage) {
		if (lastNameInvalidErrorMessageText.isDisplayed()) {
			lastNameInvalidErrorMessageText.verifyText(StringMatcher.contains(errorMessage));
		} else {
			ReportUtils.reportComment("Invalid Last Name Error Message is not displayed");
		}
	}

	public void validate_EmailInvalidErrorMessage(String errorMessage) {
		if (emailInvalidErrorMessageText.isDisplayed()) {
			emailInvalidErrorMessageText.verifyText(StringMatcher.contains(errorMessage));
		} else {
			ReportUtils.reportComment("Invalid Email Error Message is not displayed");
		}
	}

	public void validate_PhoneNumberInvalidErrorMessage(String errorMessage) {
		if (phoneNumberInvalidErrorMessageText.isDisplayed()) {
			phoneNumberInvalidErrorMessageText.verifyText(StringMatcher.contains(errorMessage));
		} else {
			ReportUtils.reportComment("Invalid Phone Number Error Message is not displayed");
		}		
	}

}
