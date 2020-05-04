$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/semmalai/eclipse-workspace/BDDFramework/src/main/java/Features/hradmin.feature");
formatter.feature({
  "line": 1,
  "name": "Orange HRM Admin Feature",
  "description": "",
  "id": "orange-hrm-admin-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Orange HRM HR Admin search Test Scenario",
  "description": "",
  "id": "orange-hrm-admin-feature;orange-hrm-hr-admin-search-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of login page is Orange HRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter username and password",
  "rows": [
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 7
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user moves to admin page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters the employeename",
  "rows": [
    {
      "cells": [
        "John"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "HrAdminSteps.user_login_page()"
});
formatter.result({
  "duration": 21902979600,
  "status": "passed"
});
formatter.match({
  "location": "HrAdminSteps.title_of_login_page_is_Orange_HRM()"
});
formatter.result({
  "duration": 11412100,
  "status": "passed"
});
formatter.match({
  "location": "HrAdminSteps.user_enter_username_and_password(DataTable)"
});
formatter.result({
  "duration": 230340200,
  "status": "passed"
});
formatter.match({
  "location": "HrAdminSteps.user_click_on_login_button()"
});
formatter.result({
  "duration": 1701574500,
  "status": "passed"
});
formatter.match({
  "location": "HrAdminSteps.user_is_on_HomePage()"
});
formatter.result({
  "duration": 1004218500,
  "status": "passed"
});
formatter.match({
  "location": "HrAdminSteps.user_moves_to_admin_page()"
});
formatter.result({
  "duration": 3561175800,
  "status": "passed"
});
formatter.match({
  "location": "HrAdminSteps.user_enter(DataTable)"
});
formatter.result({
  "duration": 140800400,
  "status": "passed"
});
formatter.match({
  "location": "HrAdminSteps.close_the_browser()"
});
formatter.result({
  "duration": 390935200,
  "status": "passed"
});
});