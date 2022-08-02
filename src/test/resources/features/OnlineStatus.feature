Feature: As a user, I should be able to change my online status and set a status message

  Background: User can login with valid credentials
    Given User navigates to the symund login page
    When User leaves "Employee121" in username
    And User leaves "Employee123" in password
    And User clicks login button


  @UND-1302 @wip
  Scenario: User can view Online Status
    Then user can view Online Status on Dashboard

  @UND-1303 @wip
  Scenario Outline: User can change Online Status
    When user clicks status button on the dashboard
    And user selects online "<status>"
    And user clicks close button
    Then user can see "<icons>" on the dashboard
    Examples:
      | status       | icons     |
      | online       | online    |
      | away         | away      |
      | doNotDisturb | dnd       |
      | invisible    | invisible |

  @UND-1304 @wip
  Scenario Outline: User can set a status message from default options
    When user clicks status button on the dashboard
    And user selects "<options>"
    And user clicks set status message button
    Then user can see "<expectedText>" on the status text
    Examples:
      | options         | expectedText        |
      | inMeeting       | 📅 In a meeting     |
      | commuting       | 🚌 Commuting        |
      | workingRemotely | 🏡 Working remotely |
      | outSick         | 🤒 Out sick         |
      | vacationing     | 🌴 Vacationing      |

  @UND-1305 @wip
  Scenario Outline: User can set a custom status message with also using any emoji option provided
    When user clicks status button on the dashboard
    And user clicks status message box
    And user clears message box
    And user leaves a "<message>"
    And user clicks emoji button
    And user clicks "<emojiName>"
    And user clicks set status message button
    Then user can see "<expectedMessage>" on the status
    Examples:
      | message                      | emojiName     | expectedMessage                 |
      | Hello!!                      | wink          | 😉 Hello!!                      |
      | Please urgent calls only     | speak_no_evil | 🙊 Please urgent calls only     |
      | Hey there! I am using Symund | 100           | 💯 Hey there! I am using Symund |












