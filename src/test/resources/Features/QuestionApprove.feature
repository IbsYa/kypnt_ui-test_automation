Feature: Question Approve Functionality

  Scenario: Expert should be able to approve questions
    Given the user navigates landing page
    And the user logs in as "expert"
    When the user navigates to "Questions" menu
    And the user clicks "Pending Questions"
    And the user click edit button on waiting approval question
#    And the user clicks approve button
#    Then the user clicks All Questions
#    And the user should see the status of question is approved