Feature: As a user, I should be able to create a new contact and edit/delete any contact under Contacts module


  Background: Pre_condition User can login with valid credentials
    Given user navigates to the symund login page
    And user leaves "Employee41" in username
    And user leaves "Employee123" in password
    And user clicks login button
    Then verify that user can login


  Scenario Outline: Pos-Verify to create a new board with valid data
    When user navigates to the "Deck" module
    And Click to “Add board” button on the left side bar
    And  Type board name as a "<boardName>"
    And  Hit enter or click arrow icon
    Then can see "<boardName>" board in the All board list

    Examples:
      | boardName   |
      | Halil_Board |

  @wip_halil
  Scenario: Neg-Verify to can’t create a new board with invalid data(space)
    When user navigates to the "Deck" module
    And Click to “Add board” button on the left side bar
    And  Hit enter or click arrow icon
    Then user should see "Please fill out this field."





