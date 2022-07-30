Feature: As a user, I should be able to add a file to favorites, rename any file and give some comments on any file.

  Background: Pre_condition User can login with valid credentials
    Given user navigates to the symund login page
    And user leaves "Employee21" in username
    And user leaves "Employee123" in password
    And user clicks login button
    Then verify that user can login

  @UND-1244
  Scenario Outline: User can add any file to favorites from its own three dots menu
    Given user navigates to Files module
    And user clicks on the three dots next to the file with "<name>"
    And user clicks on Add to favorites button
    And user clicks on the Favorites button on the left menu
    Then user verifies that the file with the "<fileName>" is seen on the Favorites page
    Examples: File names will be as below:
      | name | fileName |
      | Talk | Talk     |
      #| Commented | Commented.docx |
      #| Favorites | Favorites.docx |

  @UND-1246
  Scenario Outline: User can rename any file from its own three dots menu.
    Given user navigates to Files module
    And user clicks on the three dots next to the file with "<name>"
    And user clicks on Rename button
    And user types a "<differentName>" for the title and taps on Enter button
    Then the file name is changed to "<expectedName>"
    Examples: File names will be as below:
      | name | differentName | expectedName |
      | talk | talkRenamed   | talkRenamed  |
      #| talkRenamed           | talk             | talk                  |
      #| Commented.docx        | CommentedRenamed | CommentedRenamed.docx |
      #| CommentedRenamed.docx | Commented        | Commented.docx        |

  @UND-1247
  Scenario Outline: User can put some comments on any file from the file details menu opened right side
    Given user navigates to Files module
    And user clicks on the three dots next to the file with "<name>"
    And user clicks on Details button
    And user clicks on Comments tab button
    And user types a comment and presses Enter
    Then the comment is posted
    Examples: File names will be as below:
      | name      |
      | talk      |
      #| Commented |

  @UND-1250
  Scenario Outline: User can delete the comments made on any file from the the file details menu opened right side
    Given user navigates to Files module
    And user clicks on the three dots next to the file with "<name>"
    And user clicks on Details button
    And user clicks on Comments tab button
    And user clicks on posted comment actions button
    And user clicks on Delete comment button
    Then the comment is deleted
    Examples: File names will be as below:
      | name      |
      | talk      |
      #| Commented |