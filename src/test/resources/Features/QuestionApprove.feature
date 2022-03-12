Feature: Question Approve Functionality

  @questionApprove @smoke @regression
  Scenario: Expert should be able to approve questions
    Given the user navigates landing page
    And the user logs in as "expert"
    When the user navigates to "Questions" menu
    And the user navigates to "Pending Questions" menu
    And the user clicks "WAITING_APPROVAL" edit button
    And the user clicks "Approve" button
