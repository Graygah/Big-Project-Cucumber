@Leave
Feature: Assign Leave
	I assign to leave

@AssignLeave
Scenario: User want to assign leave
Given 2User on homepage with authorization using "Admin" as username & "s3Kol4HQA!*" as password
When Click Leave button
Then I click assign leave
Then I input "karyawan QA baru" as employee name in assign leave
Then I select leave type
Then I choose from date
Then I choose to date
Then I choose partial days & duration
Then I input "Ini comment" as a comment
Then Click apply