Feature: Orange HRM Login Feature

  #Scenario: Orange HRM Login Test Scenario
  	#Given user is on Login Page
   	#When title of login page is Orange HRM
    #Then user enter "Admin" and "admin123"
    #Then user click on login button
		#Then user is on HomePage
	
	  Scenario Outline: Orange HRM Login Test Scenario
    Given user is on Login Page
    When title of login page is Orange HRM
    Then user enter "<username>" and "<password>"
    Then user click on login button
		Then user is on HomePage
		Then close the browser
		
		
		Examples:
			| username | password |
			| Admin    | admin123 |
			| Admin    | admin23  |