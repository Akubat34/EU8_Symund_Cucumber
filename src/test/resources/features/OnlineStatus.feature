Feature: As a user, I should be able to change my online status and set a status message

  Background: User can login with valid credentials
    Given User navigates to the symund login page
    When User leaves "Employee121" in username
    And User leaves "Employee123" in password
    And User clicks login button

  @wip
  Scenario: User can view Online Status
    Then user can view Online Status on Dashboard




