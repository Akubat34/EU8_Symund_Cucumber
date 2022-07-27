Feature: User should be able to upload a file, move or delete any selected file under the Files module
# File Module
  Background: Pre_condition User can login with valid credentials
    Given user navigates to the symund login page
    And user leaves "Employee11" in username
    And user leaves "Employee123" in password
    And user clicks login button
    Then verify that user can login


  Scenario: User can upload a file
    And user navigates to the "Files" module
    And user clicks + sign
    And user clicks Upload file button
    And user uploads the file
    Then user verify that file is uploaded

    #
  Scenario: User can create a new folder
    And user navigates to the "Files" module
    And user clicks + sign
    And user clicks New folder button
    And user enters the new file name
    And user hits the arrow
    Then user verify that New folder is in folders area

    #
  Scenario: User can move or copy any selected item to any folder
    And user navigates to the "Files" module
    And user right-clicks on the selected folder and clicks the Move or copy button from folders area
    And user selects target folder from Choose target folder area
    And user selects and clicks one of them Copy to or Move to
    And user clicks the targeted folder
    Then user verifies that selected folder is there
  @1231
  Scenario: User can delete any selected item from its three dots menu
    And user navigates to the "Files" module
    And user clicks on the selected item's three dots menu
    And user clicks the Delete folder button
    And user clicks the Deleted files button
    Then user verifies that deleted folder is there


    #
  Scenario: User can see the total number of files and folders under the files list table
    And user navigates to the "Files" module
    Then user can see the total number of files and folders under the files list table
