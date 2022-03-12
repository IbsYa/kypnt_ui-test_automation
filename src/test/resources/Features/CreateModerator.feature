Feature: Moderator create

  @CreateModerator
  Scenario: Super admin creates a moderator

    Given the user navigates landing page
    And the user logs in as "superAdmin"
    When the user navigates to "Staff" menu
    And the user navigates to "Moderator" menu
    And the user clicks "Add Moderator" button to create
    And User inputs the moderator information
    And User clicks "Save" button
    Then User verifies the created moderator.