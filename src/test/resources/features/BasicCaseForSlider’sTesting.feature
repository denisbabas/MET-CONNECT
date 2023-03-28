Feature: Login screen tests

  @Smoke
  Scenario Outline: the basic case for the slider’s testing
    Given Open METCAL Runtime and enter valid login and password for MC user
    Then Click on the LogIn button
    When Select Configure tab
    And Select Instrument Configuration section
    Then Select Instrument Configuration(Continued) tab
    And Check Enable checkbox and get values from 504 Frequency Low and 504 Frequency High in section N5532A/B
    Then Verify Five Hundred For Freguency dropdowns and sliders are enabled.
    And Drag Five Hundred For Frequency Low slider and drop it somewhere at the middle of its line.
    Then Verify value in the box low got changed.
    And Drag Five Hundred For Frequency High slider and drop it somewhere at the middle of its line.
    And Verify value in the box high got changed
    Then Uncheck Enabled check box and verify value is restored as original value
    And Make “504 Frequency High” value box red and click Apply button.
    Then Verify Invalid settingd "<Error>" message is displayed
    And Click OK on the error message, restore original value, verify values
    And Verify changes are saved with no error.

    Examples: 
      | Error                                                 |
      | Invalid setting on 'Instrument Configuration' Section |
