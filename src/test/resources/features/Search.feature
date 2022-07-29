@oz
Feature: As a user, I should be able to search file or contact from the Dashboard and see the photos under Photos Module


  Background: Pre_condition User can login with valid credentials
    Given user navigates to the symund login page
    And user leaves "Employee111" in username
    And user leaves "Employee123" in password
    And user clicks login button
    Then verify that user can login


  @oz1
  Scenario Outline: User can search file typing its name through the magnifying glass icon and
  see the details side page of the file when clicked on it.
    And user clicks to the Magnify icon
    And user types "<searchFileName>" name
    And user click on outputFile
    Then verify that user can see the details of "<expectedFileTitle>" file

    Examples:
      | searchFileName | expectedFileTitle |
      | Hakan1.txt     | Hakan1.txt        |


  @oz2
  Scenario Outline: User can search contacts by clicking on the contacts icon and typing its name
    And user click to the contacts icon
    And user type "<contactName>" name
    Then verify that user can see the "lists" name

    Examples:
      | contactName |
      | Will        |


  @oz3
  Scenario: User can also see the images files under the Photos module when uploaded them
    And user navigates to the "Photos" module
    And user clicks on image
    Then verify that user can see the image

  @oz4
  Scenario: User can navigate to the Dashboard page whenever clicking
  the Symund icon at the top left corner on the page
    And user navigates to the "Photos" module
    And user clicks on Symund icon
    Then verify that user land on Dashboard page

