$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ConfigureInstrumentControl.feature");
formatter.feature({
  "name": "Configure Instrument Control",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Configure Instrument Control sliders",
  "description": "",
  "keyword": "Scenario",
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
  "name": "Select Configure then Instrument Control section and verify APPLY and DISCARD buttons are disabled",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.select_Configure_then_Instrument_Control_section_and_verify_APPLY_and_DISCARD_buttons_are_disabled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Move IEEE-488 FIND LISTENER Delay slider to the 300 ms value",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.move_IEEE_FIND_LISTENER_Delay_slider_to_the_ms_value(java.lang.Integer,java.lang.Integer)"
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
  "name": "Verify value is changed for IEEE-488 FIND LISTENER Delay slider",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.verify_value_is_changed_for_IEEE_FIND_LISTENER_Delay_slider(java.lang.Integer)"
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
  "name": "Move IEEE488 FIND LISTENER Delay slider to the 400 ms value",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.move_IEEE488_FIND_LISTENER_Delay_slider_to_the_ms_value(java.lang.Integer)"
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
  "name": "Verify value is changed for IEEE-488 FIND LISTENER Delay slider",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.verify_value_is_changed_for_IEEE_FIND_LISTENER_Delay_slider(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Change location of the IEEE-488 FIND LISTENER Delay slider to original and click APPLY",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.change_location_of_the_IEEE_FIND_LISTENER_Delay_slider_to_original_and_click_APPLY(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Move IEEE2/SCPI Query Delay slider to the 420 ms value",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.move_IEEE2_SCPI_Query_Delay_slider_to_the_ms_value(java.lang.Integer)"
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
  "name": "Verify value is changed for IEEE2/SCPI Query Delay slider",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.verify_value_is_changed_for_IEEE2_SCPI_Query_Delay_slider()"
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
  "name": "Move IEEE2SCPI Query Delay slider to the 520 ms value",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.move_IEEE2SCPI_Query_Delay_slider_to_the_ms_value(java.lang.Integer)"
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
  "name": "Verify value is changed for IEEE2/SCPI Query Delay slider",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.verify_value_is_changed_for_IEEE2_SCPI_Query_Delay_slider()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Change location of the IEEE2/SCPI Query Delay slider to original and click APPLY",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.change_location_of_the_IEEE2_SCPI_Query_Delay_slider_to_original_and_click_APPLY()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Move 8902/803 Serial Poll Slow slider to the 800 ms value",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.move_Serial_Poll_Slow_slider_to_the_ms_value(java.lang.Integer,java.lang.Integer,java.lang.Integer)"
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
  "name": "Verify value is changed for 8902/803 Serial Poll Slow slider",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.verify_value_is_changed_for_Serial_Poll_Slow_slider(java.lang.Integer,java.lang.Integer)"
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
  "name": "Move 8902/803_Serial Poll Slow slider to the 900 ms value",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.move__Serial_Poll_Slow_slider_to_the_ms_value(java.lang.Integer,java.lang.Integer,java.lang.Integer)"
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
  "name": "Verify value is changed for 8902/803 Serial Poll Slow slider",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.verify_value_is_changed_for_Serial_Poll_Slow_slider(java.lang.Integer,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Change location of the 8902/803 Serial Poll Slow slider to original and click APPLY",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.change_location_of_the_Serial_Poll_Slow_slider_to_original_and_click_APPLY(java.lang.Integer,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Move Pre-serial Poll Delay slider to the 300 ms value",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.move_Pre_serial_Poll_Delay_slider_to_the_ms_value(java.lang.Integer)"
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
  "name": "Verify value is changed for Pre-serial Poll Delay slider",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.verify_value_is_changed_for_Pre_serial_Poll_Delay_slider()"
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
  "name": "Move PreSerial Poll Delay slider to the 400 ms value",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.move_PreSerial_Poll_Delay_slider_to_the_ms_value(java.lang.Integer)"
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
  "name": "Verify value is changed for Pre-serial Poll Delay slider",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.verify_value_is_changed_for_Pre_serial_Poll_Delay_slider()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Change location of the Pre-serial Poll Delay to original and click APPLY",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.change_location_of_the_Pre_serial_Poll_Delay_to_original_and_click_APPLY()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Move Post-serial Poll Delay slider to the 300 ms value",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.move_Post_serial_Poll_Delay_slider_to_the_ms_value(java.lang.Integer)"
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
  "name": "Verify value is changed for Post-serial Poll Delay slider",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.verify_value_is_changed_for_Post_serial_Poll_Delay_slider()"
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
  "name": "Move PostSerial Poll Delay slider to the 400 ms value",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.move_PostSerial_Poll_Delay_slider_to_the_ms_value(java.lang.Integer)"
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
  "name": "Verify value is changed for Post-serial Poll Delay slider",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.verify_value_is_changed_for_Post_serial_Poll_Delay_slider()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Change location of the Post-serial Poll Delay slider to original and click APPLY",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.change_location_of_the_Post_serial_Poll_Delay_slider_to_original_and_click_APPLY()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Move Serial Poll Retries slider to the 30ms value",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.move_Serial_Poll_Retries_slider_to_the_30ms_value()"
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
  "name": "Verify value is changed for Serial Poll Retries slider",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.verify_value_is_changed_for_Serial_Poll_Retries_slider()"
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
  "name": "Move SerialPoll Retries slider to the 40ms value",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.move_SerialPoll_Retries_slider_to_the_40ms_value()"
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
  "name": "Verify value is changed for Serial Poll Retries slider",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.verify_value_is_changed_for_Serial_Poll_Retries_slider()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Change location of the Serial Poll Retries to original and click APPLY",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConfigureInstrumentControlSteps.change_location_of_the_Serial_Poll_Retries_to_original_and_click_APPLY()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Configure Instrument Control sliders");
formatter.after({
  "status": "passed"
});
});