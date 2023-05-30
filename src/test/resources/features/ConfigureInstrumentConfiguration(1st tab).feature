Feature: Configure - Instrument Configuration (1st tab)

  @Smoke
  Scenario Outline: This scenario verified all in section one
    Given Open METCAL Runtime and enter valid login and password for MC user
    Then Click on the LogIn button
    When Select Configure tab
    And Select Instrument Configuration section
    Then Verify APPLY and DISCARD button is disabled
    #1CheckBox
    And click on the 4000A checkbox
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then Verify Yellow banner is disappear
    Then Verify 4000A checkbox is checked
    And click on the 4000A checkbox
    And Click APPLY button
    Then Verify APPLY and DISCARD button is disabled
    Then Verify Yellow banner is disappear
    Then verify check box 4000A is unchecked
    And click on the 4000A checkbox
    And Click APPLY button
    Then Verify Yellow banner is disappear
    #2CheckBox
    And click on the 34401A checkbox
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then verify check box 34401A is unchecked
    And click on the 34401A checkbox
    And Click APPLY button
    Then Verify Yellow banner is disappear
    Then Verify APPLY and DISCARD button is disabled
    Then Verify 34401A checkbox is checked
    And click on the 34401A checkbox
    And Click APPLY button
    Then Verify Yellow banner is disappear
    #3CheckBox
    And click on the 3420A checkbox
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then verify check box 3420A is unchecked
    And click on the 3420A checkbox
    And Click APPLY button
    Then Verify Yellow banner is disappear
    Then Verify APPLY and DISCARD button is disabled
    Then Verify 3420A checkbox is checked
    And click on the 3420A checkbox
    And Click APPLY button
    Then Verify Yellow banner is disappear
    #4CheckBox
    And click on the 2000SRQ checkbox
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then verify check box 2000SRQ is unchecked
    And click on the 2000SRQ checkbox
    And Click APPLY button
    Then Verify Yellow banner is disappear
    Then Verify APPLY and DISCARD button is disabled
    Then Verify 2000SRQ checkbox is checked
    And click on the 2000SRQ checkbox
    And Click APPLY button
    #5CheckBox
    And click on the 2001SRQ SDC checkbox
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then verify check box 2001SRQ SDC is unchecked
    And click on the 2001SRQ SDC checkbox
    And Click APPLY button
    Then Verify Yellow banner is disappear
    Then Verify APPLY and DISCARD button is disabled
    Then Verify 2001SRQ SDC checkbox is checked
    And click on the 2001SRQ SDC checkbox
    And Click APPLY button
    Then Verify Yellow banner is disappear
    #1DD
    Then Select A for the 8903Model Suffix
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then verify value for 8903Model Suffix is "<8903Default  Value>"
    Then Select A for the 8903Model Suffix
    And Click APPLY button
    Then Verify Yellow banner is disappear
    Then verify value for 8903Model Suffix is "<8903A  Value>"
    And change value 8903Model Suffix "B (Default)"
    And Click APPLY button
    Then Verify Yellow banner is disappear
    #1Slider
    Then Move 8901A/B Data Avail. Timeout slider to the 160 ms value
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Verify value is changed for 8901A/B Data Avail. Timeout
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then Move 8901A/B Data Avail. Timeout to the 260 ms value
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    And Click APPLY button
    Then Verify Yellow banner is disappear
    Then Verify APPLY and DISCARD button is disabled
    Then Verify value is changed for 8901A/B Data Avail. Timeout
    And Change location of the 8901A/B  slider to original
    And Click APPLY button
    Then Verify Yellow banner is disappear

    Examples: 
      | 8903Default  Value              | 8903A  Value          |
      | cmbo8903ModelSuffix:B (Default) | cmbo8903ModelSuffix:A |

  @Smoke
  Scenario Outline: This scenario verified all in section 525 A/B
    Given Open METCAL Runtime and enter valid login and password for MC user
    Then Click on the LogIn button
    When Select Configure tab
    And Select Instrument Configuration section
    Then Verify APPLY and DISCARD button is disabled
    Then Verify Yellow banner is disappear
    #CheckBox
    Then Click 525A  IEEE488 checkbox
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then Click 525A  IEEE488 checkbox
    And Click APPLY button
    Then Verify Yellow banner is disappear
    Then Verify APPLY and DISCARD button is disabled
    And Verify Terminator IEEE488 to RS232 Converter and Pressure Module Timeout is disabled
    Then Click 525A  IEEE488 checkbox
    And Click APPLY button
    Then Verify Yellow banner is disappear
    And Verify 525EIEE488 check box is checked
    And Verify Terminator IEEE488 to RS232 Converter and Pressure Module Timeout is enabled
    Then Select CR for the Terminator IEEE488 to RS232 Converter
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then Verify Yellow banner is disappear
    Then verify value for Terminator IEEE488 to RS232 Converter is "<Terminator IEEE488 to RS232 Converter Default>"
    Then Select LF for the Terminator IEEE488 to RS232 Converter
    And Click APPLY button
    Then Verify Yellow banner is disappear
    Then verify value for Terminator IEEE488 to RS232 Converter "<Terminator IEEE488 to RS232 Converter Value LF>"
    And change value Terminator IEEE488 to RS232 Converter To default value
    And Click APPLY button
    Then Verify Yellow banner is disappear
    #slider
    Then Move Pressure Module Timeout slider to the 100 ms value
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Verify value is changed for Pressure Module Timeout
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then Move Pressure Module Timeout to the 150 ms value
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    And Click APPLY button
    Then Verify APPLY and DISCARD button is disabled
    Then Verify value is changed for Pressure Module Timeout slider
    And Change location of the Pressure Module Timeout  slider to original
    And Click APPLY button

    Examples: 
      | Terminator IEEE488 to RS232 Converter Default    | Terminator IEEE488 to RS232 Converter Value LF |
      | cmboTerminatorIEEEToRS232Converter:EOI (Default) | cmboTerminatorIEEEToRS232Converter:LF          |

  @Smoke
  Scenario Outline: This scenario verified all in section 9100
    Given Open METCAL Runtime and enter valid login and password for MC user
    Then Click on the LogIn button
    When Select Configure tab
    And Select Instrument Configuration section
    Then Verify APPLY and DISCARD button is disabled
    #CheckBox1
    Then Click Near Cal Due SRQ checkbox
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then Click Near Cal Due SRQ checkbox
    And Click APPLY button
    Then Verify APPLY and DISCARD button is disabled
    #CheckBox2
    Then Click Past Cal Due SRQ checkbox
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then Click Past Cal Due SRQ checkbox
    And Click APPLY button
    Then Verify APPLY and DISCARD button is disabled
    #DD
    Then Select Datron-Yokogawa for the Manufacturer Suffix
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then verify value for Manufacturer is "<value1>"
    Then Select Fluke for the Manufacturer
    And Click APPLY button
    Then verify value for Manufacturer is "<value2>"
    And Verify Near and Past check boxes is checked
    And Discard all changes in section
    And Click APPLY button

    Examples: 
      | value1                | value2                     |
      | cmbo9100Manufacturer: | cmbo9100Manufacturer:Fluke |
