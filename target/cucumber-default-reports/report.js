$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ConfigureInstrumentAgilentN1914A.feature");
formatter.feature({
  "name": "ConfigureInstrumentAgilentN1914A",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "System instrument test part two (Agilent N1914A)",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Progression"
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
  "name": "Add Agilent \"N1914A\", assert \"\u003cFSC\u003e\" and verify Asset info button disabled",
  "keyword": "And "
});
formatter.step({
  "name": "Add barcode \"\u003cBarcode\u003e\" and Verify Asset Info button is enabled",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Channel A and Channel B barcode fields are disabled",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Channel C and Channel D barcode fields are disabled",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Pover Sensors Drop Down is enabled for Chanel A and Chanel B",
  "keyword": "And "
});
formatter.step({
  "name": "select USB Ports check box",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Pover Sensors Drop Down is enabled for Chanel A and Chanel B",
  "keyword": "And "
});
formatter.step({
  "name": "Verify + buttons for all channels are enabled and - buttons for all channels are disabled",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Barcode fields for all channels are disabled and Asset Info buttons are disabled for all channels Barcode fields",
  "keyword": "Then "
});
formatter.step({
  "name": "Select any power sensor for Channel A and Verify Barcode field for that sensor is enabled",
  "keyword": "And "
});
formatter.step({
  "name": "Enter barcode for that sensor and Verify corresponding Asset Info button is enabled",
  "keyword": "Then "
});
formatter.step({
  "name": "Select all available power sensors for Channel A with their barcodes and Verify power sensor dropdowns are disabled for Channel B, C and D",
  "keyword": "Then "
});
formatter.step({
  "name": "Delete one power sensor from Channel A by clicking {string} button and Verify power sensor dropdowns are enabled for all channels",
  "keyword": "And "
});
formatter.step({
  "name": "Click Help button and verify help page is opened assert header {string} and click ok button",
  "keyword": "Then "
});
formatter.step({
  "name": "Click ok button",
  "keyword": "And "
});
formatter.step({
  "name": "Verify \"Agilent N1914A\" is present on the instrument page",
  "keyword": "Then "
});
formatter.step({
  "name": "Click on the instrument and click Delete button and verify instrument succesfully deleted",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "FSC",
        "Barcode",
        ""
      ]
    },
    {
      "cells": [
        "IEEE, EPM, SCPI",
        "TestBarcode",
        ""
      ]
    }
  ]
});
formatter.scenario({
  "name": "System instrument test part two (Agilent N1914A)",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Progression"
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
  "name": "Add Agilent \"N1914A\", assert \"IEEE, EPM, SCPI\" and verify Asset info button disabled",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConfigureAgilentN1914Atest.add_Agilent_assert_and_verify_Asset_info_button_disabled(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add barcode \"TestBarcode\" and Verify Asset Info button is enabled",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConfigureAgilentN1914Atest.add_barcode_and_Verify_Asset_Info_button_is_enabled(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Channel A and Channel B barcode fields are disabled",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureAgilentN1914Atest.verify_Channel_A_and_Channel_B_barcode_fields_are_disabled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Channel C and Channel D barcode fields are disabled",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureAgilentN1914Atest.verify_Channel_C_and_Channel_D_barcode_fields_are_disabled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Pover Sensors Drop Down is enabled for Chanel A and Chanel B",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "select USB Ports check box",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConfigureAgilentN1914Atest.select_USB_Ports_check_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify Pover Sensors Drop Down is enabled for Chanel A and Chanel B",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Verify + buttons for all channels are enabled and - buttons for all channels are disabled",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureAgilentN1914Atest.verify_buttons_for_all_channels_are_enabled_and_buttons_for_all_channels_are_disabled()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify Barcode fields for all channels are disabled and Asset Info buttons are disabled for all channels Barcode fields",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureAgilentN1914Atest.verify_Barcode_fields_for_all_channels_are_disabled_and_Asset_Info_buttons_are_disabled_for_all_channels_Barcode_fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select any power sensor for Channel A and Verify Barcode field for that sensor is enabled",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConfigureAgilentN1914Atest.select_any_power_sensor_for_Channel_A_and_Verify_Barcode_field_for_that_sensor_is_enabled()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter barcode for that sensor and Verify corresponding Asset Info button is enabled",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureAgilentN1914Atest.enter_barcode_for_that_sensor_and_Verify_corresponding_Asset_Info_button_is_enabled()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select all available power sensors for Channel A with their barcodes and Verify power sensor dropdowns are disabled for Channel B, C and D",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureAgilentN1914Atest.select_all_available_power_sensors_for_Channel_A_with_their_barcodes_and_Verify_power_sensor_dropdowns_are_disabled_for_Channel_B_C_and_D()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Delete one power sensor from Channel A by clicking {string} button and Verify power sensor dropdowns are enabled for all channels",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConfigureAgilentN1914Atest.delete_one_power_sensor_from_Channel_A_by_clicking_button_and_Verify_power_sensor_dropdowns_are_enabled_for_all_channels()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click Help button and verify help page is opened assert header {string} and click ok button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureAgilentN1914Atest.click_Help_button_and_verify_help_page_is_opened_assert_header_and_click_ok_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click ok button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConfigureAgilentN1914Atest.click_ok_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify \"Agilent N1914A\" is present on the instrument page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureAgilentN1914Atest.verify_is_present_on_the_instrument_page(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on the instrument and click Delete button and verify instrument succesfully deleted",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConfigureAgilentN1914Atest.click_on_the_instrument_and_click_Delete_button_and_verify_instrument_succesfully_deleted()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "System instrument test part two (Agilent N1914A)");
formatter.after({
  "status": "passed"
});
});