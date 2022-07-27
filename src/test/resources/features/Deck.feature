Feature: As a user, I should be able to create a new contact and edit/delete any contact under Contacts module

  Background: Pre_condition User can login with valid credentials
    Given user navigates to the symund login page
    And user leaves "Employee41" in username
    And user leaves "Employee123" in password
    And user clicks login button
    Then verify that user can login

  Scenario: Pos-Verify to create a new board with valid data
    When user navigates to the "Deck" module
    And Click to “Add board” button on the left side bar
    And  Type board name as a "Halil_Board"
    And  Hit enter or click arrow icon
    Then can see "Halil_Board" board in the All board list

  Scenario: Neg-Verify to can’t create a new board with invalid data(space)
    When user navigates to the "Deck" module
    And Click to “Add board” button on the left side bar
    And  Hit enter or click arrow icon
    Then user should see "Please fill out this field."


  Scenario: Pos-Verify to create a new list of card or task
    When user navigates to the "Deck" module
    And Click to “Add board” button on the left side bar
    And  Type board name as a "Halil_Board"
    And  Hit enter or click arrow icon
    And click "Halil_Board" on the board side
    And Click “+” icon at the right top of screen
    And Type list name as a "Halil list"
    And Hit enter or click arrow icon on the list name input
    Then can see "Halil list" on the list on the current board

  @wip_halil
  Scenario: Pos-Verify to create a new card or task on any list
    When user navigates to the "Deck" module
    And Click to “Add board” button on the left side bar
    And  Type board name as a "Halil_Board"
    And  Hit enter or click arrow icon
    And click "Halil_Board" on the board side
    And Click “+” icon at the right top of screen
    And Type list name as a "Halil list"
    And Hit enter or click arrow icon on the list name input
    And Click “+” icon at the right top of list column
    And Type task name as a "Task1_halil"
    And Hit enter or click arrow icon on the task name input
    Then can see the task as a "Task1_halil"  on the "Halil list" list column









