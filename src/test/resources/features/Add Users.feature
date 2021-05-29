@AdminAddUsers
Feature: Add User Admin

@AddUsers
Scenario: Admin AddUser
Given User on homepage with authorization using "Admin" as username & "s3Kol4HQA!*" as password
When Click Admin button
Then I go to add user page
Then I select user role
Then I input using "karyawan QA Cilsy" as employee name
Then I input using "dorara" as username
Then I select status
Then I input "Dragray177*" as password
Then I input "Dragray177*" as confirmation password
Then I click save in users