Feature: As a user, I should be able to change my online status and set a status message

  Background: User can login with valid credentials
    Given User navigates to the symund login page
    And User leaves "Employee121" in username
    And User leaves "Employee123" in password
    And User clicks login button


    Scenario: User can view Online Status
      When User clicks status button on dashboard



