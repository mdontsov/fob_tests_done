Feature: Create routes

  Scenario: Create route between 2 locations and verify that route
    has been calculated for different activity types

    Given webpage is opened
    When directions is selected
    And starting point is set
    And destination point is set
    Then different route options are calculated and shown
