Feature: As a user, I should be able to see all deleted files and delete/restore them permanently under the Deleted Files tab.


  Background: Pre_condition User can login with valid credentials
    Given user navigates to the symund login page
    And user leaves "Employee81" in username
    And user leaves "Employee123" in password
    And user clicks login button
    Then verify that user can login
@UND-1260 @smoke
  Scenario: User can see the most recent deleted file in the first line of the deleted file list
  when deleted files are ordered by newest to oldest
    When user navigates to the "Files" module
    And user clicks deletedFilesTab
    And user clicks deletedButton
    Then verify that deleted files are ordered by newest to oldest
@UND-1261
  Scenario: User can order the all deleted files by newest to oldest or visa versa
    When user navigates to the "Files" module
    And user clicks deletedFilesTab
    And user clicks deletedButton
    And user clicks deletedButton
    Then verify that user can order the all deleted files by newest to oldest or visa versa
@UND-1262
  Scenario: User can order alphabetically all the deleted files based on their names
    When user navigates to the "Files" module
    And user clicks deletedFilesTab
    And user clicks name button
    Then verify that user can order alphabetically
@UND-1263
  Scenario: User can delete any deleted file permanently by using the three dots icon in the file’s line
    When user navigates to the "Files" module
    And user clicks deletedFilesTab
    And user clicks threeDot
    And user clicks deletePermanently
    Then verify that the file could be deleted permanently
@UND-1264
  Scenario: User can restore any deleted file and see it again under the All Files tab
    When user navigates to the "Files" module
    And user clicks deletedFilesTab
    And user clicks restore button
    And user clicks allFiles button
    Then verify that the file added to allFiles page

