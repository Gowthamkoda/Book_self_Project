Feature: Home page scenarios

  Scenario: Search for bookshelves
    Given navigate to home page
    When search for bookshelves
    And handle banner
    And retrive any one SubMenu data from living menu
    Then display searched results

  #Scenario: Fetch Living Storage Details
    #Given 
