Feature: Collect star(s)

  Scenario: Open webpage and create new registration to sign-in. Then search for a location using the map and
  then pick up/collect a star for it. Next open the 'Collections' menu and verify that the collected place does
    exist there.

    Given open webpage
    And user is signed in
    Then search for an address from map
    When the address is found
    Then collect a star for it
    And start a new collection
    When done open then your collection
    And verify that collected place exists
    And remove all existing collections to start over


