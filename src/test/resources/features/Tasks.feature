Feature: As a user, I should be able to create a new task list or a single task and add any task to completed and important tasks list.
# Task Module
  Background: Pre_condition User can login with valid credentials
    Given user navigates to the symund login page
    And user leaves "Employee71" in username
    And user leaves "Employee123" in password
    And user clicks login button
    Then verify that user can login

  @1
  Scenario Outline: User can create a new list of tasks
    And user navigates to the "Tasks" module
    And user clicks Add List... button
    And user types "<lists>" name
    And user click the save button
    Then verify that user can create "<lists>" with given name

    Examples:
      | lists    |
      | To Do   |
      | 12Tasks |
      | &Todo   |


  Scenario Outline:User can create a new task
    And user navigates to the "Tasks" module
    And user clicks Add List... button
    And user types "To Do" name
    And user click the save button
    And user types "<tasks>" to the placeholder which includes "Add a current task to "To Do"..." message and user hits the enter
    Then verify that user can create "<tasks>" with given name

    Examples:
      | tasks        |
      | First Task   |
      | 2nd Task     |
      | & Third Task |

