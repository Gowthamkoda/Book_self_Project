Feature: BookShelf Scenarios in UrbanLadder Application

  Scenario: Search BookShelves and Display the Results
    Given Filter  Bookshelves below Rs15000
		And exclude out of stock
		And Select anyone Category (like Wall Shelves / Kid Bookshelves / Study Tables, etc)
		And Sort by price High to Low
		When fetched the items
		Then print all details in console output
		

		
		