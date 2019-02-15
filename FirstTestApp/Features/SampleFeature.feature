Feature: Sample Feature
  I want to use this template for my feature file

  
  //Scenario: Launch Browser and load home page
   // Given User is at google page
    
  Scenario: Login with provided user credentials
    Given User is at home page
    When user clicks Login link
    And provides the username, password and submit
    Then welcome message is displayed