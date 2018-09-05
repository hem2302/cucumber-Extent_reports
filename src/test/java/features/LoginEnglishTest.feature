@LoginEngTest
Feature: Tameeni insurance Login Validation
 I want to validate the login scenarios in Tameeni insurance booking website in english language

@LoginWithCorrectUsernameAndPasswordEnglish
Scenario Outline: Validate if login is successful using correct username and password
Given I launch the <browser>
And I pass the <URL>
And I click on EN and verify it is translated
And I click on login
When I enter <uname> and <password>
And I click on login button
Then I should be able to login
Examples:
| browser|							 URL						  |			uname			    |password|
| chrome |http://policyuat.gettameeni.com/#comprehensive-insurance|abbasbriskst.ar@gmail.com	| 123456 |


@LoginAndLogoutEnglish
Scenario Outline: Validate if login is successful using correct username and password
Given I launch the <browser>
And I pass the <URL>
And I click on EN and verify it is translated
And I click on login
And I enter <uname> and <password>
And I click on login button
And I should be able to login
When I click on Logout
Then I should be able to logout
Examples:
| browser|							 URL						  |			uname			    |password|
| chrome |http://policyuat.gettameeni.com/#comprehensive-insurance|abbasbriskst.ar@gmail.com	| 123456 |