$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ConfigureInstrumentConfiguration(1st%20tab).feature");
formatter.feature({
  "name": "Configure - Instrument Configuration (1st tab)",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "This scenario verified all in section 9100",
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
  "name": "Select Configure tab",
  "keyword": "When "
});
formatter.step({
  "name": "Select Instrument Configuration section",
  "keyword": "And "
});
formatter.step({
  "name": "Verify APPLY and DISCARD button is disabled",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Near Cal Due SRQ checkbox",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Yellow banner is popUp",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify APPLY and DISCARD button is enabled",
  "keyword": "And "
});
formatter.step({
  "name": "Click DISCARD button AND assert confirmation message \"Are you sure you want to discard your changes?\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Yes on confirmation message and assert APPLY and Discard button is disabled",
  "keyword": "And "
});
formatter.step({
  "name": "Click Near Cal Due SRQ checkbox",
  "keyword": "Then "
});
formatter.step({
  "name": "Click APPLY button",
  "keyword": "And "
});
formatter.step({
  "name": "Verify APPLY and DISCARD button is disabled",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Past Cal Due SRQ checkbox",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Yellow banner is popUp",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify APPLY and DISCARD button is enabled",
  "keyword": "And "
});
formatter.step({
  "name": "Click DISCARD button AND assert confirmation message \"Are you sure you want to discard your changes?\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Yes on confirmation message and assert APPLY and Discard button is disabled",
  "keyword": "And "
});
formatter.step({
  "name": "Click Past Cal Due SRQ checkbox",
  "keyword": "Then "
});
formatter.step({
  "name": "Click APPLY button",
  "keyword": "And "
});
formatter.step({
  "name": "Verify APPLY and DISCARD button is disabled",
  "keyword": "Then "
});
formatter.step({
  "name": "Select Datron-Yokogawa for the Manufacturer Suffix",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Yellow banner is popUp",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify APPLY and DISCARD button is enabled",
  "keyword": "And "
});
formatter.step({
  "name": "Click DISCARD button AND assert confirmation message \"Are you sure you want to discard your changes?\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Yes on confirmation message and assert APPLY and Discard button is disabled",
  "keyword": "And "
});
formatter.step({
  "name": "verify value for Manufacturer is \"\u003cvalue1\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Select Fluke for the Manufacturer",
  "keyword": "Then "
});
formatter.step({
  "name": "Click APPLY button",
  "keyword": "And "
});
formatter.step({
  "name": "verify value for Manufacturer is \"\u003cvalue2\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Near and Past check boxes is checked",
  "keyword": "And "
});
formatter.step({
  "name": "Discard all changes in section",
  "keyword": "And "
});
formatter.step({
  "name": "Click APPLY button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "value1",
        "value2"
      ]
    },
    {
      "cells": [
        "cmbo9100Manufacturer:",
        "cmbo9100Manufacturer:Fluke"
      ]
    }
  ]
});
formatter.scenario({
  "name": "This scenario verified all in section 9100",
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
  "name": "Verify APPLY and DISCARD button is disabled",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.verify_APPLY_and_DISCARD_button_is_disabled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Near Cal Due SRQ checkbox",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentConfigurationSteps.click_Near_Cal_Due_SRQ_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Yellow banner is popUp",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.verify_Yellow_banner_is_popUp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify APPLY and DISCARD button is enabled",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.verify_APPLY_and_DISCARD_button_is_enabled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click DISCARD button AND assert confirmation message \"Are you sure you want to discard your changes?\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.click_DISCARD_button_AND_assert_confirmation_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Yes on confirmation message and assert APPLY and Discard button is disabled",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.click_Yes_on_confirmation_message_and_assert_APPLY_and_Discard_button_is_disabled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Near Cal Due SRQ checkbox",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentConfigurationSteps.click_Near_Cal_Due_SRQ_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click APPLY button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.click_APPLY_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify APPLY and DISCARD button is disabled",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.verify_APPLY_and_DISCARD_button_is_disabled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Past Cal Due SRQ checkbox",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentConfigurationSteps.click_Past_Cal_Due_SRQ_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Yellow banner is popUp",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.verify_Yellow_banner_is_popUp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify APPLY and DISCARD button is enabled",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.verify_APPLY_and_DISCARD_button_is_enabled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click DISCARD button AND assert confirmation message \"Are you sure you want to discard your changes?\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.click_DISCARD_button_AND_assert_confirmation_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Yes on confirmation message and assert APPLY and Discard button is disabled",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.click_Yes_on_confirmation_message_and_assert_APPLY_and_Discard_button_is_disabled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Past Cal Due SRQ checkbox",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentConfigurationSteps.click_Past_Cal_Due_SRQ_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click APPLY button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.click_APPLY_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify APPLY and DISCARD button is disabled",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.verify_APPLY_and_DISCARD_button_is_disabled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Datron-Yokogawa for the Manufacturer Suffix",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentConfigurationSteps.select_Datron_Yokogawa_for_the_Manufacturer_Suffix()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Yellow banner is popUp",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.verify_Yellow_banner_is_popUp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify APPLY and DISCARD button is enabled",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.verify_APPLY_and_DISCARD_button_is_enabled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click DISCARD button AND assert confirmation message \"Are you sure you want to discard your changes?\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.click_DISCARD_button_AND_assert_confirmation_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Yes on confirmation message and assert APPLY and Discard button is disabled",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.click_Yes_on_confirmation_message_and_assert_APPLY_and_Discard_button_is_disabled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify value for Manufacturer is \"cmbo9100Manufacturer:\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentConfigurationSteps.verify_value_for_Manufacturer_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Fluke for the Manufacturer",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentConfigurationSteps.select_Fluke_for_the_Manufacturer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click APPLY button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.click_APPLY_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify value for Manufacturer is \"cmbo9100Manufacturer:Fluke\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentConfigurationSteps.verify_value_for_Manufacturer_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Near and Past check boxes is checked",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentConfigurationSteps.verify_near_and_past_check_boxes_is_checked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Discard all changes in section",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentConfigurationSteps.discard_all_changes_in_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click APPLY button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.click_APPLY_button()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "This scenario verified all in section 9100");
formatter.after({
  "status": "passed"
});
});