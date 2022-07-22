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
    And user clicks "AddList..." button and types "<lists>" name
    And user click the save button
    Then verify that user can create "<lists>" with given name

    Examples:
      | lists   |
      | To Do   |
      | 12Tasks |
      | &ToDo   |

@2
  Scenario Outline:User can create a new task
    And user navigates to the "Tasks" module
    And user clicks "AddList..." button and types "To Do" name
    And user click the save button
    And user types "<tasks>" to the placeholder which includes "Add a current task to "To Do"..." message and user hits the enter
    Then verify that user can create "<tasks>" with given name

    Examples:
      | tasks        |
      | First Task   |
      | 2nd Task     |
      | & Third Task |

  @3
  Scenario: User can add any task to the list of completed tasks by clicking on the checkbox near the task name
    And user navigates to the "Tasks" module
    And user clicks "AddList..." button and types "To Do" name
    And user click the save button
    And user types "First Task" to the placeholder which includes "Add a current task to "To Do"..." message and user hits the enter
    And Click the checkbox left side of the task name
    Then Verify that user can add task into completed tasks
@4
  Scenario: User can add any task to the list of important tasks by clicking on the star icon on the right side of task line
    And user navigates to the "Tasks" module
    And user clicks "AddList..." button and types "To Do" name
    And user click the save button
    And user types "First Task" to the placeholder which includes "Add a current task to "To Do"..." message and user hits the enter
    And Click the checkbox right side of the task bar
    Then Verify that user can checked as important

  @5
  Scenario Outline: User can see the number of all uncompleted tasks next to the Current tab
    And user navigates to the "Tasks" module
    And user clicks "AddList..." button and types "To Do" name
    And user click the save button
    And user types "<tasks>" to the placeholder which includes "Add a current task to "To Do"..." message and user hits the enter
    And verify that user can create "<tasks>" with given name
    Then verify that user can see number of all uncompleted tasks

    Examples:
      | tasks        |
      | First Task   |
      | 2nd Task     |
      | & Third Task |