Feature: User should be able to upload a file, move or delete any selected file under the Files module
# File Module
  Background: Pre_condition User can login with valid credentials
    Given user navigates to the symund login page
    And user leaves "Employee11" in username
    And user leaves "Employee123" in password
    And user clicks login button
    Then verify that user can login

  @1231
  Scenario: User can upload a file
    And user navigates to the "Files" module
    And user clicks + sign
    #//span[@class='icon icon-add']
    And user clicks Upload file button
  #//span[@class='svg icon icon-upload']
    And user uploads the file
    Then user verify that file is uploaded