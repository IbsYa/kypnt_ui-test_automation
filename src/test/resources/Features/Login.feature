@login
Feature: Login Functionality

  Background:
    Given the user navigates landing page

  @smoke @regression
  Scenario Outline: "<userType>" should be able to login
    When the user logs in as "<userType>"
    Then the user should see the "<userType>" email in Settings & Profile

    Examples:
      | userType    |
      | superAdmin  |
      | moderator   |
      | editor      |
      | expert      |
      | student     |
      | schoolAdmin |
      | teacher     |

  Scenario Outline: Invalid login "<user>"
    When the user enters invalid "<userName>" and "<password>"
    Then the user should NOT be able to login
    And the user should get an error message
    Examples:
      | user                    | userName                      | password    |
      | with an additional char | superadmin@example.com;       | Test123456! |
      | without domain suffix   | superadmin@example            | Test123456! |
      | without domain          | moderator                     | Test123456! |
      | with wrong credentials  | johanne.bergstrom@hotmail.com | jzby4dw6jm  |







