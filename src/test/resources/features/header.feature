Feature: Home page scenarios

  Scenario: Search for bookshelves
    Given navigate to home page
    And handle banner
    When searched for bookshelves 
    Then display searched results
