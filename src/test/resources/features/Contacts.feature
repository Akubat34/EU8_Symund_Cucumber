Feature: As a user, I should be able to create a new contact and edit/delete any contact under Contacts module


  Background: Pre_condition User can login with valid credentials
    Given user navigates to the symund login page
    And user leaves "Employee31" in username
    And user leaves "Employee123" in password
    And user clicks login button
    Then verify that user can login

@UND-1289
  Scenario Outline: User can create a new contact
    When user navigates to the "Contacts" module
    And user clicks the New Contacts button
    And user types "<Name>" instead of New Contact text
    And user types "<CompanyName>" on the company field
    And user types "<Title>" on the title field
    Then verify that "<Name>" should match on the all contacts

    Examples:
      | Name     | CompanyName | Title    |
      | bro      | Ertan     | Sert        |
      | 123456   | 123456    | 123456      |
      | ½{{$dsjf | !'^+%&/   | '3%567/     |
      | .,k123   | ç.ksle098 | 159,.=ueybs |
@UND-1291 @Smoke
    Scenario: User can see all the contacts as a list inside the middle column and total number of the contacts near the “All Contacts” tab
      When user navigates to the "Contacts" module
      Then verify that list of the contact number should equal number of the contacts near the All Contacts tab

@UND-1292
    Scenario: User can change the profile picture of any contact with a previously uploaded picture by using “Choose from files” option
      When user navigates to the "Contacts" module
      When user clicks the New Contacts button
      And user types "Ertan" instead of New Contact text
      And user types "CYDEO" on the company field
      And user types "Company" on the title field
      And user clicks picture button
      And user clicks Choose from files button
      And user selects 5.jpg file
      And user clicks choose button
      And user repeats last 4 steps with another picture
      Then verify that the URL of the both of the pictures are different
  @UND-1293
      Scenario: User can delete any selected contact
        When user navigates to the "Contacts" module
        When user clicks the New Contacts button
        And user types "Ertan" instead of New Contact text
        And user types "CYDEO" on the company field
        And user types "Company" on the title field
        And user clicks three dot button
        And user clicks Delete button
        Then verify that the contact should be removed


