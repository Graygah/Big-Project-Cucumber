@AdminAddEmployee
Feature: Add Employee

@AddEmployee
Scenario: Admin Add Employee
Given 1User on homepage with authorization using "Admin" as username & "s3Kol4HQA!*" as password
When Click PIM button
Then I go to add employee page
Then I input "graygah" as firstname & "roynando" as lastname
Then I input "0804" as employee id
Then I click create login details
Then I input "eunddora" as username
Then 1I input "Dragray177*" as password
Then 1I input "Dragray177*" as confirmation password
Then I click save in employee