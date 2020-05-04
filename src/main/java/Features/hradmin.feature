Feature: Orange HRM Admin Feature

Scenario: Orange HRM HR Admin search Test Scenario
    Given user is on Login Page
    When title of login page is Orange HRM
    Then user enter username and password
    | Admin | admin123 |
    Then user click on login button
	Then user is on HomePage
	Then user moves to admin page
	Then user enters the employeename
	| John |
	Then close the browser
