Feature: Orange HRM Login Feature

  Scenario: Orange HRM Login Test Scenario
  	Given user is on Login Page
   	When title of login page is Orange HRM
    Then the use logs into the application
	Then validate home page title
	Then logout from the application