$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/BasicCaseForSlider%E2%80%99sTesting.feature");
formatter.feature({
  "name": "Login screen tests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "the basic case for the slider’s testing",
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
  "name": "Select Configure tab",
  "keyword": "When "
});
formatter.step({
  "name": "Select Instrument Configuration section",
  "keyword": "And "
});
formatter.step({
  "name": "Select Instrument Configuration(Continued) tab",
  "keyword": "Then "
});
formatter.step({
  "name": "Check Enable checkbox and get values from 504 Frequency Low and 504 Frequency High in section N5532A/B",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Five Hundred For Freguency dropdowns and sliders are enabled.",
  "keyword": "Then "
});
formatter.step({
  "name": "Drag Five Hundred For Frequency Low slider and drop it somewhere at the middle of its line.",
  "keyword": "And "
});
formatter.step({
  "name": "Verify value in the box low got changed.",
  "keyword": "Then "
});
formatter.step({
  "name": "Drag Five Hundred For Frequency High slider and drop it somewhere at the middle of its line.",
  "keyword": "And "
});
formatter.step({
  "name": "Verify value in the box high got changed",
  "keyword": "And "
});
formatter.step({
  "name": "Uncheck Enabled check box and verify value is restored as original value",
  "keyword": "Then "
});
formatter.step({
  "name": "Make “504 Frequency High” value box red and click Apply button.",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Invalid settingd \"\u003cError\u003e\" message is displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "Click OK on the error message, restore original value, verify values",
  "keyword": "And "
});
formatter.step({
  "name": "Verify changes are saved with no error.",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Error"
      ]
    },
    {
      "cells": [
        "Invalid setting on \u0027Instrument Configuration\u0027 Section"
      ]
    }
  ]
});
formatter.scenario({
  "name": "the basic case for the slider’s testing",
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
  "name": "Select Configure tab",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.SlidersTest.select_Configure_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Instrument Configuration section",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.SlidersTest.select_Instrument_Configuration_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Instrument Configuration(Continued) tab",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.SlidersTest.select_Instrument_Configuration_Continued_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check Enable checkbox and get values from 504 Frequency Low and 504 Frequency High in section N5532A/B",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.SlidersTest.check_Enable_checkbox_and_get_values_from_Frequency_Low_and_Frequency_High_in_section_N5532A_B(java.lang.Integer,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Five Hundred For Freguency dropdowns and sliders are enabled.",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.SlidersTest.verify_Five_Hundred_For_Freguency_dropdowns_and_sliders_are_enabled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Drag Five Hundred For Frequency Low slider and drop it somewhere at the middle of its line.",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.SlidersTest.drag_Five_Hundred_For_Frequency_Low_slider_and_drop_it_somewhere_at_the_middle_of_its_line()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify value in the box low got changed.",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.SlidersTest.verify_value_in_the_box_low_got_changed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Drag Five Hundred For Frequency High slider and drop it somewhere at the middle of its line.",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.SlidersTest.drag_Five_Hundred_For_Frequency_High_slider_and_drop_it_somewhere_at_the_middle_of_its_line()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify value in the box high got changed",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.SlidersTest.verify_value_in_the_box_high_got_changed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Uncheck Enabled check box and verify value is restored as original value",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.SlidersTest.uncheck_Enabled_check_box_and_verify_value_is_restored_as_original_value()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Make “504 Frequency High” value box red and click Apply button.",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.SlidersTest.make_Frequency_High_value_box_red_and_click_Apply_button(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Invalid settingd \"Invalid setting on \u0027Instrument Configuration\u0027 Section\" message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.SlidersTest.verify_Invalid_settingd_message_is_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click OK on the error message, restore original value, verify values",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.SlidersTest.click_OK_on_the_error_message_restore_original_value_verify_values()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify changes are saved with no error.",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.SlidersTest.verify_changes_are_saved_with_no_error()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "the basic case for the slider’s testing");
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/CreateNewProcedure.feature");
formatter.feature({
  "name": "SetUp procedure",
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
        "z540_Proc",
        "AutomatedIDworkOrder",
        "77",
        "37",
        "As-Found",
        "This is automated test note",
        "Data exported successfully:"
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
  "name": "select \"z540_Proc\" from the PC",
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
  "name": "get text from the MetCal Information and asssert \"Data exported successfully:\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateTestProcedure.get_text_from_the_Met_call_Information_and_asssert(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", "Create");
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
formatter.embedding("image/png", "embedded2.png", "Login With valid credentials(MC)");
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
formatter.embedding("image/png", "embedded3.png", "Login With valid credentials(Admin)");
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login with invalid Login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Open METCAL Runtime and enter invalid \"\u003cLogin\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter valid password",
  "keyword": "When "
});
formatter.step({
  "name": "Click on the LogIn button",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Invalid settingd \"\u003cError\u003e\" message is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Login",
        "Error"
      ]
    },
    {
      "cells": [
        "mc!",
        "E278:  User name is not valid: Database login failed."
      ]
    },
    {
      "cells": [
        "!mc",
        "E278:  User name is not valid: Database login failed."
      ]
    },
    {
      "cells": [
        "admin!",
        "E278:  User name is not valid: Database login failed."
      ]
    },
    {
      "cells": [
        ".admin",
        "E278:  User name is not valid: Database login failed."
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with invalid Login",
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
  "name": "Open METCAL Runtime and enter invalid \"mc!\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.InvalidCredentialsSteps.open_METCAL_Runtime_and_enter_invalid(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter valid password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.InvalidCredentialsSteps.Enter_valid_password()"
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
  "name": "Verify Invalid settingd \"E278:  User name is not valid: Database login failed.\" message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.SlidersTest.verify_Invalid_settingd_message_is_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png", "Login with invalid Login");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with invalid Login",
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
  "name": "Open METCAL Runtime and enter invalid \"!mc\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.InvalidCredentialsSteps.open_METCAL_Runtime_and_enter_invalid(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter valid password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.InvalidCredentialsSteps.Enter_valid_password()"
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
  "name": "Verify Invalid settingd \"E278:  User name is not valid: Database login failed.\" message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.SlidersTest.verify_Invalid_settingd_message_is_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png", "Login with invalid Login");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with invalid Login",
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
  "name": "Open METCAL Runtime and enter invalid \"admin!\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.InvalidCredentialsSteps.open_METCAL_Runtime_and_enter_invalid(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter valid password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.InvalidCredentialsSteps.Enter_valid_password()"
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
  "name": "Verify Invalid settingd \"E278:  User name is not valid: Database login failed.\" message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.SlidersTest.verify_Invalid_settingd_message_is_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded6.png", "Login with invalid Login");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with invalid Login",
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
  "name": "Open METCAL Runtime and enter invalid \".admin\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.InvalidCredentialsSteps.open_METCAL_Runtime_and_enter_invalid(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter valid password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.InvalidCredentialsSteps.Enter_valid_password()"
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
  "name": "Verify Invalid settingd \"E278:  User name is not valid: Database login failed.\" message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.SlidersTest.verify_Invalid_settingd_message_is_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded7.png", "Login with invalid Login");
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login with invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Open METCAL Runtime and enter valid login",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter invalid \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Click on the LogIn button",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Invalid settingd \"\u003cError\u003e\" message is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Login",
        "Error"
      ]
    },
    {
      "cells": [
        "mc!",
        "E278:  Password is incorrect: Database login failed."
      ]
    },
    {
      "cells": [
        "!mc",
        "E278:  Password is incorrect: Database login failed."
      ]
    },
    {
      "cells": [
        "admin",
        "E278:  Password is incorrect: Database login failed."
      ]
    },
    {
      "cells": [
        ".admin",
        "E278:  Password is incorrect: Database login failed."
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with invalid password",
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
  "name": "Open METCAL Runtime and enter valid login",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.InvalidCredentialsSteps.open_METCAL_Runtime_and_enter_valid_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter invalid \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.InvalidCredentialsSteps.enter_invalid(java.lang.String)"
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
  "name": "Verify Invalid settingd \"E278:  Password is incorrect: Database login failed.\" message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.SlidersTest.verify_Invalid_settingd_message_is_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded8.png", "Login with invalid password");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with invalid password",
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
  "name": "Open METCAL Runtime and enter valid login",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.InvalidCredentialsSteps.open_METCAL_Runtime_and_enter_valid_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter invalid \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.InvalidCredentialsSteps.enter_invalid(java.lang.String)"
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
  "name": "Verify Invalid settingd \"E278:  Password is incorrect: Database login failed.\" message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.SlidersTest.verify_Invalid_settingd_message_is_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded9.png", "Login with invalid password");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with invalid password",
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
  "name": "Open METCAL Runtime and enter valid login",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.InvalidCredentialsSteps.open_METCAL_Runtime_and_enter_valid_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter invalid \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.InvalidCredentialsSteps.enter_invalid(java.lang.String)"
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
  "name": "Verify Invalid settingd \"E278:  Password is incorrect: Database login failed.\" message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.SlidersTest.verify_Invalid_settingd_message_is_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded10.png", "Login with invalid password");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with invalid password",
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
  "name": "Open METCAL Runtime and enter valid login",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.InvalidCredentialsSteps.open_METCAL_Runtime_and_enter_valid_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter invalid \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.InvalidCredentialsSteps.enter_invalid(java.lang.String)"
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
  "name": "Verify Invalid settingd \"E278:  Password is incorrect: Database login failed.\" message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.SlidersTest.verify_Invalid_settingd_message_is_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded11.png", "Login with invalid password");
formatter.after({
  "status": "passed"
});
});