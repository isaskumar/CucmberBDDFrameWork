Feature: Orange HRM Admin Feature

Scenario Outline: Orange HRM Admin search Test Scenario
    Given user is on Login Page
    When title of login page is Orange HRM
    Then user enter "<username>" and "<password>"
    Then user click on login button
	Then user is on HomePage
	Then user moves to admin page
	Then user enters the "<employeename>"
	Then close the browser
	
Examples:
	| username | password | employeename |
	| Admin    | admin123 | John   |