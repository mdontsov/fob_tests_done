Feature: find phone

  Scenario: find phone with GPS support listed in specs

    When phone finder page is opened
    And select phone with some specs and show results
    Then selected phone details are shown with gps support listed