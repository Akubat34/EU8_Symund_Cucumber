Feature: As a user, I should be able to create a new contact and edit/delete any contact under Contacts module


  Background: Pre_condition User can login with valid credentials
    Given user navigates to the symund login page
    And user leaves "Employee31" in username
    And user leaves "Employee123" in password
    And user clicks login button
    Then verify that user can login

  @wip
  Scenario Outline: User can create a new contact
    When user navigates to the "Contacts" module
    And user clicks the New Contacts button
    And user types "<Name>" on the name field
    And user types "<FirstName>" on the company field
    And user types "<LastName>" on the title field
    Then verify that "<Name>" should match on the all contacts

    Examples:
      | Name     | FirstName | LastName    |
      | bro      | Ertan     | Sert        |
      | 123456   | 123456    | 123456      |
      | ½{{$dsjf | !'^+%&/   | '3%567/     |
      | .,k123   | ç.ksle098 | 159,.=ueybs |