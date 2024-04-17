Feature: Home page scenarios
	
	@smoke @regression
  Scenario: Search for bookshelve
    Given navigate to home page
    When search for bookshelves
    And handle banner
    Then display searched results
