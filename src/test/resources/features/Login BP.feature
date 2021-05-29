@Login
Feature: Login
	I want to login to http://qa.cilsy.id/symfony/web/index.php/auth/login

@PositiveLogin
Scenario: User login
Given I in orangehrm login page
When Input using "Admin" as username and "s3Kol4HQA!*" as password

@NegativeLogin
Scenario: User Login
Given In orangehrm login page again for login negative
When I using "Minda" as username and "sekolahqa" as password for login negative