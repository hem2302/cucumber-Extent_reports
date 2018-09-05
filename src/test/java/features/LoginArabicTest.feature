@LoginArabicTest
Feature: Tameeni insurance Login Validation - Arabic
 I want to validate the login scenarios in Tameeni insurance booking website in Arabic language

@LoginWithCorrectUsernameAndPasswordArabic
Scenario Outline: Validate if login is successful using correct username and password
Given I launch the <browser>
And I pass the <URL>
And I verify it is in Arabic
And I click on login
When I enter <uname> and <password>
And I click on login button
Then I should be able to login
Examples:
| browser|							 URL						  |			uname			    |password|
| chrome |http://policyuat.gettameeni.com/#comprehensive-insurance|abbasbriskst.ar@gmail.com	| 123456 |


@LoginAndLogoutArabic
Scenario Outline: Validate if user is able to login and logout
Given I launch the <browser>
And I pass the <URL>
And I verify it is in Arabic
And I click on login
And I enter <uname> and <password>
And I click on login button
And I should be able to login
When I click on Logout
Then I should be able to logout
Examples:
| browser|							 URL						  |			uname			    |password|
| chrome |http://policyuat.gettameeni.com/#comprehensive-insurance|abbasbriskst.ar@gmail.com	| 123456 |