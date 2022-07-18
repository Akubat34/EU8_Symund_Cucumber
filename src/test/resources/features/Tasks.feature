Feature: As a user, I should be able to create a new task list or a single task and add any task to completed and important tasks list.
# Task Module
  Background: Pre_condition User can login with valid credentials
    Given user navigates to the symund login page
    And user leaves "Employee71" in username
    And user leaves "Employee123" in password
    And user clicks login button
    Then verify that user can login
@1
  Scenario:  User can create a new list of tasks
    Then user navigates to the "Tasks" module


