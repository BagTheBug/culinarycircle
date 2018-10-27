@contactUs 
Feature: Contact Us 
Scenario: Submit form with valid details in required fields 
	Given Launch site "${site.url}" 
	Then Go to Contact Us Page 
	And Enter First Name "${firstName.valid}" 
	Then Enter Last Name "${lastName.valid}" 
	Then Enter Email Address "${email.valid}" 
	And Enter PhoneNumber "${phoneNumber.valid}" 
	Then Click Submit Button 
	Then Validate the success message "${success.message}" and "${thankyou.message}" 
	
Scenario: Submit form with no details 
	Given Launch site "${site.url}" 
	Then Go to Contact Us Page 
	Then Click Submit Button 
	Then Validate the error message "${error.message}" 
	
Scenario: Submit form with valid details in all fields 
	Given Launch site "${site.url}" 
	Then Go to Contact Us Page 
	And Enter First Name "${firstName.valid}" 
	Then Enter Last Name "${lastName.valid}" 
	Then Enter Email Address "${email.valid}" 
	And Enter PhoneNumber "${phoneNumber.valid}" 
	Then Enter Street Address "${streetAddress}" 
	And Enter City "${city}" 
	Then Enter Zipcode "${zipCode}" 
	And Enter Shop "${shop name}" 
	Then Enter Time of Occurence "${occurenceTime}" 
	And Enter Best Time to Contact "${contactTime}" 
	Then Enter comments "${comments}" 
	Then Validate the success message "${success.message}" and "${thankyou.message}" 
	
Scenario: Validate Name fields 
	Given Launch site "${site.url}" 
	Then Go to Contact Us Page 
	And Enter First Name "${firstName.invalid}" 
	Then Enter Last Name "${lastName.invalid}" 
	Then Click Submit Button 
	Then Validate the error message "${error.message}" 
	And Validate the first name error message "${firstName.invalid.error.message}" 
	Then Validate the last name error message "${lastName.invalid.error.message}" 
	
Scenario: Validate email field 
	Given Launch site "${site.url}" 
	Then Go to Contact Us Page 
	Then Enter Email Address "${email.invalid}" 
	Then Click Submit Button 
	Then Validate the error message "${error.message}" 
	And Validate invalid email error message "${email.invalid.error.message}" 
	
Scenario: Validate Phone Number field 
	Given Launch site "${site.url}" 
	Then Go to Contact Us Page 
	And Enter PhoneNumber "${phoneNumber.invalid}" 
	Then Click Submit Button 
	Then Validate the error message "${error.message}" 
	And Validate invalid phone number error message "${phoneNumber.invalid.error.message}"