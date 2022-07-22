Feature: As a user, I should be able to create a new task list or a single task and add any task to completed and important tasks list.

  Background: Pre_condition User can login with valid credentials
    Given user navigates to the symund login page
    And user leaves "Employee21" in username
    And user leaves "Employee123" in password
    And user clicks login button
    Then verify that user can login

  @UND-1244
  Scenario Outline: User can add any file to favorites from its own three dots menu
    Given user navigates to Files module
    And user clicks on the three dots next to the file with "<name>"
    And user clicks on Add to favorites button
    And user clicks on the Favorites button on the left menu
    Then user verifies that the file with the "<fileName>" is seen on the Favorites page
    Examples: File names will be as below:
      | name      | fileName       |
      | Talk      | Talk           |
      | Commented | Commented.docx |
      | Favorites | Favorites.docx |
