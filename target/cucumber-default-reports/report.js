$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CreateNewProcedure.feature");
formatter.feature({
  "name": "setUp procedure",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Open METCAL Runtime and enter valid login and password for MC user",
  "keyword": "Given "
});
formatter.step({
  "name": "Click on the LogIn button",
  "keyword": "Then "
});
formatter.step({
  "name": "move slider to simulation mode",
  "keyword": "And "
});
formatter.step({
  "name": "click on the Select DUT button",
  "keyword": "And "
});
formatter.step({
  "name": "verify the \"\u003cwindows name\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "enter the \"\u003cAsset Number\u003e\" and click ok button",
  "keyword": "And "
});
formatter.step({
  "name": "click save button",
  "keyword": "And "
});
formatter.step({
  "name": "select \"\u003cPXE\u003e\" from the PC",
  "keyword": "Then "
});
formatter.step({
  "name": "navigate to the Run window and click run button",
  "keyword": "And "
});
formatter.step({
  "name": "enter \"\u003cWorkOrderNumber\u003e\" click ok button",
  "keyword": "Then "
});
formatter.step({
  "name": "enter \"\u003cTemperature\u003e\" and \"\u003cHunidity\u003e\" and click ok button",
  "keyword": "Then "
});
formatter.step({
  "name": "on the Post-Prompt screen select \"\u003cAs-Found/As-Left\u003e\" dropdown and enter \"\u003cNotes\u003e\" to the textbox",
  "keyword": "And "
});
formatter.step({
  "name": "get text from the MetCal Information and asssert \"\u003cHow exported data\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "windows name",
        "Asset Number",
        "PXE",
        "WorkOrderNumber",
        "Temperature",
        "Hunidity",
        "As-Found/As-Left",
        "Notes",
        "How exported data"
      ]
    },
    {
      "cells": [
        "Asset Number",
        "AutomationTestAsset",
        "z540_Proc.pxe",
        "AutomatedIDworkOrder",
        "77",
        "37",
        "As-Found",
        "This is automated test note",
        "Data exported successfully"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Open METCAL Runtime and enter valid login and password for MC user",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.LoginScreenTestDefinitions.open_METCAL_Runtime_and_enter_valid_login_and_password_for_MC_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the LogIn button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.LoginScreenTestDefinitions.click_on_the_LogIn_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "move slider to simulation mode",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateTestProcedure.move_slider_to_simulation_mode()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the Select DUT button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateTestProcedure.click_on_the_Select_DUT_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the \"Asset Number\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateTestProcedure.verify_the(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the \"AutomationTestAsset\" and click ok button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateTestProcedure.enter_the_and_click_ok_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click save button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateTestProcedure.click_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select \"z540_Proc.pxe\" from the PC",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateTestProcedure.select_from_the_PC(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to the Run window and click run button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateTestProcedure.navigate_to_the_Run_window_and_click_run_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter \"AutomatedIDworkOrder\" click ok button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateTestProcedure.enter_click_ok_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter \"77\" and \"37\" and click ok button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateTestProcedure.enter_and_and_click_ok_button(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "on the Post-Prompt screen select \"As-Found\" dropdown and enter \"This is automated test note\" to the textbox",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateTestProcedure.on_the_Post_Prompt_screen_select_dropdown_and_enter_to_the_textbox(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get text from the MetCal Information and asssert \"Data exported successfully\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateTestProcedure.get_text_from_the_Met_call_Information_and_asssert(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Create");
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/loginScreenTest.feature");
formatter.feature({
  "name": "Login screen tests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login With valid credentials(MC)",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Open METCAL Runtime and enter valid login and password for MC user",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.LoginScreenTestDefinitions.open_METCAL_Runtime_and_enter_valid_login_and_password_for_MC_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the LogIn button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.LoginScreenTestDefinitions.click_on_the_LogIn_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that for MC user \"RUN\" and \"CONFIGURE\" tabs is enabled",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.LoginScreenTestDefinitions.verify_that_for_MC_user_and_tabs_is_enabled(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", "Login With valid credentials(MC)");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login With valid credentials(Admin)",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Open METCAL Runtime and enter valid login and password for Admin user",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.LoginScreenTestDefinitions.open_METCAL_Runtime_and_enter_valid_login_and_password_for_Admin_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the LogIn button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.LoginScreenTestDefinitions.click_on_the_LogIn_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that for MC user RUN and CONFIGURE tabs is disabled",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.LoginScreenTestDefinitions.verify_that_for_MC_user_RUN_and_CONFIGURE_tabs_is_disabled()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", "Login With valid credentials(Admin)");
formatter.after({
  "status": "passed"
});
});