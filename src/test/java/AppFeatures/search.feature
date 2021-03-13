Feature: Google search

  Scenario: Open Google
    Given I open Google Homepage on "Chrome" Browser
    Then I landed on the Google page
    And Search box is availabe to search

  Scenario Outline: Search Results
    Given I open Google Homepage on "Chrome" Browser
#    When I search for <keyword>"
    Examples:
      |  |
