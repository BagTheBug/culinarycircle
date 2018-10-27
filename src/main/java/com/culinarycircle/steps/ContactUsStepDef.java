package com.culinarycircle.steps;

import com.culinarycircle.pages.ContactUsPage;
import com.culinarycircle.utils.Utils;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.qmetry.qaf.automation.util.StringMatcher;
import com.quantum.utils.ReportUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

@QAFTestStepProvider
public class ContactUsStepDef {
	ContactUsPage contactUsPage = new ContactUsPage();
	Utils projectUtils = new Utils();

	/**
	 * Clicks Contact Us Page Link in HeroBar
	 * 
	 * @author Mullai Chezhiyan
	 */
	@QAFTestStep(description = "Go to Contact Us Page")
	public void go_to_ContactUs_Page() {
		contactUsPage.goTo_ContactUsPageLink();
	}

	/**
	 * Enters First Name in Contact Us Page
	 * 
	 * @param firstName
	 *            is the FirstName entered
	 * @author Mullai Chezhiyan
	 */
	@QAFTestStep(description = "Enter First Name {0}")
	public void enter_FirstName(String firstName) {
		contactUsPage.enter_FirstName(firstName);
	}

	/**
	 * Enters First Name in Contact Us Page
	 * 
	 * @param lastName
	 *            is the LastName Entered
	 * @author Mullai Chezhiyan
	 */
	@QAFTestStep(description = "Enter Last Name {0}")
	public void enter_LastName(String lastName) {
		contactUsPage.enter_LastName(lastName);
	}

	/**
	 * Enters Email Address in Contact Us Page
	 * 
	 * @param email
	 *            is the Email Address Entered
	 * @author Mullai Chezhiyan
	 */
	@QAFTestStep(description = "Enter Email Address {0}")
	public void enter_EmailAddress(String email) {
		contactUsPage.enter_EmailAddress(email);
	}

	/**
	 * Enters Phone Number in Contact Us Page
	 * 
	 * @param phoneNumber
	 * @author Mullai Chezhiyan
	 */
	@QAFTestStep(description = "Enter PhoneNumber {0}")
	public void enter_PhoneNumber(String phoneNumber) {
		contactUsPage.enter_PhoneNumber(phoneNumber);
	}

	/**
	 * Enters Street Address in Contact Us Page
	 * 
	 * @param streetAddress
	 *            is the Street Address entered
	 * @author Mullai Chezhiyan
	 */
	@QAFTestStep(description = "Enter Street Address {0}")
	public void enter_StreetAddress(String streetAddress) {
		contactUsPage.enter_StreetAddress(streetAddress);
	}

	/**
	 * Enters City in Contact Us Page
	 * 
	 * @param city
	 *            is the City entered
	 * @author Mullai Chezhiyan
	 */
	@QAFTestStep(description = "Enter City {0}")
	public void enter_city(String city) {
		contactUsPage.enter_City(city);
	}

	/**
	 * Enters ZipCode in Contact Us Page
	 * 
	 * @param zipCode
	 *            is the Zip Code Entered
	 * @author Mullai Chezhiyan
	 */
	@QAFTestStep(description = "Enter Zipcode {0}")
	public void enter_ZipCode(String zipCode) {
		contactUsPage.enter_ZipCode(zipCode);
	}

	/**
	 * Enters Preferred Shop Name in Contact Us Page
	 * 
	 * @param shopName
	 *            is the Shop Name preferred by User
	 * @author Mullai Chezhiyan
	 */
	@QAFTestStep(description = "Enter Shop {0}")
	public void enter_Shop(String shopName) {
		contactUsPage.enter_Shop(shopName);
	}

	/**
	 * Enters Time Of Occurrence
	 * 
	 * @param occurenceTime
	 *            is the time user visits store
	 * @author Mullai Chezhiyan
	 */

	@QAFTestStep(description = "Enter Time of Occurence {0}")
	public void enter_occurenceTime(String occurenceTime) {
		contactUsPage.enter_OccurenceTimeTextBox(occurenceTime);
	}

	/**
	 * Enters Best Time Contact User
	 * 
	 * @param contactTime
	 *            the Contact Time User Give
	 * @author Mullai Chezhiyan
	 */
	@QAFTestStep(description = "Enter Best Time to Contact {0}")
	public void enter_ContactTime(String contactTime) {
		contactUsPage.enter_ContactTime(contactTime);
	}

	/**
	 * Enters User Comments
	 * 
	 * @param comments
	 *            is User Comments
	 * @author Mullai Chezhiyan
	 */
	@QAFTestStep(description = "Enter comments {0}")
	public void enter_Comments(String comments) {
		contactUsPage.enter_Comments(comments);
	}

	/**
	 * Clicks Submit Form Button
	 * 
	 * @author Mullai Chezhiyan
	 */
	@QAFTestStep(description = "Click Submit Button")
	public void click_SubmitButton() {
		contactUsPage.click_SubmitFormButton();
	}

	/**
	 * Validates Error Message
	 * 
	 * @param errorMessage
	 *            is the expected error message to be displayed
	 * @author Mullai Chezhiyan
	 */
	@QAFTestStep(description = "Validate the error message {0}")
	public void validate_ErrorMessage(String errorMessage) {
		contactUsPage.Validate_ErrorMessageDisplayed(errorMessage);
	}

	/**
	 * Validates Contact Us Page Form Submission Success Message
	 * 
	 * @param successMessage
	 *            is the expected success Message
	 * @param thankYou
	 *            is the expected gratitude message
	 * @author Mullai Chezhiyan
	 */
	@QAFTestStep(description = "Validate the success message {1} and {0}")
	public void validate_SuccessMessage(String successMessage, String thankYou) {
		projectUtils.pause(7000);
		contactUsPage.validate_SuccessMessage(successMessage, thankYou);
	}

	/**
	 * Validates error message displayed for invalid First Name
	 * 
	 * @param errorMessage
	 *            is the expected error message
	 * @author Mullai Chezhiyan
	 */
	@QAFTestStep(description = "Validate the first name error message {0}")
	public void validate_FirstNameErrorMessage(String errorMessage) {
		contactUsPage.validate_FirstNameInvalidErrorMessage(errorMessage);
	}

	/**
	 * Validates error message displayed for invalid Last Name
	 * 
	 * @param errorMessage
	 *            is the expected error message
	 * @author Mullai Chezhiyan
	 */
	@QAFTestStep(description = "Validate the last name error message {0}")
	public void validate_LastNameErrorMessage(String errorMessage) {
		contactUsPage.validate_LastNameInvalidErrorMessage(errorMessage);
	}

	/**
	 * Validates error message displayed for invalid Email Address
	 * 
	 * @param errorMessage
	 *            is the expected error message
	 * @author Mullai Chezhiyan
	 */
	@QAFTestStep(description = "Validate invalid email error message {0}")
	public void validate_InvalidEmailErrorMessage(String errorMessage) {
		contactUsPage.validate_EmailInvalidErrorMessage(errorMessage);
	}

	/**
	 * Validates error message displayed for invalid Phone Number
	 * 
	 * @param errorMessage
	 *            is the expected error message
	 * @author Mullai Chezhiyan
	 */
	@QAFTestStep(description = "Validate invalid phone number error message {0}")
	public void validate_InvalidPhoneNumberErrorMessage(String errorMessage) {
		contactUsPage.validate_PhoneNumberInvalidErrorMessage(errorMessage);
	}
}
