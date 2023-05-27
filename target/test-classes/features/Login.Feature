Feature: feature to test login functionality 

  Scenario: Check login is succesfull with valid credentials
  
    Given user is on login page
    When user enters username and password
    And clicks on login botton
    then user is navigated to the home page
    