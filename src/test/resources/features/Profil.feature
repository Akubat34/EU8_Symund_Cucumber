
Feature: As a user, I should be able to change profile info settings under the Profile module

  Background: Pre_condition User can login with valid credentials
    Given user navigates to the symund login page
    When user leaves "Employee91" in username
    And user leaves "Employee123" in password
    And user clicks login button
    Then verify that user can login
  @UND-1275 @wip
  Scenario: user can see profile info settings.
    Given click on the profile icon
    When click the setting button
    Then User can see the following from the personal information headings
    |Full name    |
    |Email        |
    |Phone number |
    |Address      |


  @UND-1277 @wip
  Scenario: user can change "Full name" info under profile settings page
    Given click on the profile icon
    When click the setting button
    And change the name in the Full name box with "Fatma"
    Then verify user has changed the "Fatma"

  @UND-1278 @wip
  Scenario: user can hide "Phone number"
    Given click on the profile icon
    When click the setting button
    And make "Phone number" info as private
    Then verify that "Phone number" information can be made private


   @UND-1279 @wip
  Scenario: User can see the current local time under the Local dropdown
    Given click on the profile icon
    When click the setting button
    Then Verify that the current local time appears under the Local dropdown menu




