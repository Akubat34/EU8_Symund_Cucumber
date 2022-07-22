Feature: As a user, I should be able to change profile info settings under the Profile module

  Scenario: user can see profile info settings.
    Given navigate to login page
    When click on the profile icon
    And click the setting button
    Then verify user is on the profile setting page

  Scenario: user can change "Full name" info under profile settings page
    Given navigate to login page
    When click on the profile icon
    And click the setting button
    And change the name in the "Full name" box
    Then verify user has changed the "Full name"

  Scenario: user can hide "Phone number"
    Given navigate to login page
    When click on the profile icon
    And click the setting button
    And make "Phone number" info as private
    Then verify that "Phone number" information can be made private

  Scenario: User can see the current local time under the Local dropdown
    Given navigate to login page
    When click on the profile icon
    And click the setting button
    Then Verify that the current local time appears under the Local dropdown menu




