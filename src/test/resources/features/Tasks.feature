Feature: Task Module

  Background: Pre_condition User can login with valid credentials
    Given user navigates to the symund login page
    And user leaves "Employee71" in username
    And user leaves "Employee123" in password
    And user clicks login button
    Then verify that user can login

  Scenario: asd
    Then user navigates to the "Tasks" module


