@ManageLeave
Feature: Manage Leave
	I want manage leave

@LeaveList
Scenario: User want to manage leave
Given 3User on homepage with authorization using "Admin" as username & "s3Kol4HQA!*" as password
When I click Leave button
Then I click leave list
Then I select show all
Then I click search
#Then I select action
Then I click save in leave list

@LeaveListNegative
Scenario: User want to manage leave
Given 5User on homepage with authorization using "Admin" as username & "s3Kol4HQA!*" as password
When 1I click Leave button
Then 1I click leave list
Then 1I select show all
Then I input "2020-01-01" as to date
Then 1I click search