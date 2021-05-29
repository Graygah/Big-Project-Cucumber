@Logout
Feature: Logout
	I want to logout from http://qa.cilsy.id/symfony/web/index.php/auth/login

@PositiveLogout
Scenario: User logout
Given 4User on homepage with authorization using "Admin" as username & "s3Kol4HQA!*" as password
When I in orangehrm for logout
Then I click my profile
Then I click logout