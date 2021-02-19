
Feature: Google Search for text

 
  Scenario: Verify results for a simple text search
    Given User launches the browser
    Given User navigates to google home page
    When User inputs duck in the search box
    And clicks Enter
    Then Verify the search results contains duck 
    
    
    