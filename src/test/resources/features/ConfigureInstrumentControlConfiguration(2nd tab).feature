Feature: Configure - Instrument Configuration (2st tab)

  @Smoke
  Scenario Outline: This scenario verified all in section 9500
    Given Open METCAL Runtime and enter valid login and password for MC user
    Then Click on the LogIn button
    When Select Configure tab
    And Select Instrument Configuration section
    And Select Instrument Configuration (Continued) section
    Then Verify APPLY and DISCARD button is disabled
    #1stCheckBox
    And click on the Near Cal Due SRQ checkbox
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then verify check box Near Cal Due SRQ is unchecked
    And click on the Near Cal Due SRQ checkbox
    And Click APPLY button
    Then Verify Yellow banner is disappear
    Then Verify APPLY and DISCARD button is disabled
    Then Verify Near Cal Due SRQ checkbox is checked
    And click on the Near Cal Due SRQ checkbox
    And Click APPLY button
    Then Verify Yellow banner is disappear
    #2ndCheckBox
    And click on the Past Cal Due SRQ checkbox
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then verify check box Past Cal Due SRQ is unchecked
    And click on the Past Cal Due SRQ checkbox
    And Click APPLY button
    Then Verify Yellow banner is disappear
    Then Verify APPLY and DISCARD button is disabled
    Then Verify Past Cal Due SRQ checkbox is checked
    And click on the Past Cal Due SRQ checkbox
    And Click APPLY button
    Then Verify Yellow banner is disappear
    #1DD
    Then Select Fluke for the Manufacturer DD
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then verify value for Manufacturer DD is "<Manufacturer first>"
    Then Select Fluke for the Manufacturer DD
    And Click APPLY button
    Then Verify Yellow banner is disappear
    Then verify value for Manufacturer DD is "<Manufacturer second>"
    And change value Manufacturer DD to blank
    And Click APPLY button
    Then Verify Yellow banner is disappear

    Examples: 
      | Manufacturer first    | Manufacturer second        |
      | cmbo9500Manufacturer: | cmbo9500Manufacturer:Fluke |

  @Progression
  Scenario: This scenario verified all in section 9500
    Given Open METCAL Runtime and enter valid login and password for MC user
    Then Click on the LogIn button
    When Select Configure tab
    And Select Instrument Configuration section
    And Select Instrument Configuration (Continued) section
    Then Verify APPLY and DISCARD button is disabled
    #1 CheckBox (504 Frequency Low)
    #And click on the Enable 504Frequency Low checkbox
    #Then Verify Yellow banner is popUp
    #And Verify APPLY and DISCARD button is enabled
    #Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    #And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    #Then verify check box Enable 504Frequency is unchecked
    #And verify both sliders and DD for the 504Frequency Low and High is disabled
    #And click on the Enable 504Frequency Low checkbox
    #And Click APPLY button
    #Then Verify Yellow banner is disappear
    #Then Verify APPLY and DISCARD button is disabled
    #Then Verify 504Frequency Low checked
    #1st slider (504 Frequency Low)
    #Then Move the504 Frequency Low slider to the200 ms value
    #Then Verify Yellow banner is popUp
    #And Verify APPLY and DISCARD button is enabled
    #Then Verify value is changed for the504Frequency Low
    #Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    #And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    #Then Move the504 Frequency Low slider to the300 ms value
    #Then Verify Yellow banner is popUp
    #And Verify APPLY and DISCARD button is enabled
    #And Click APPLY button
    #Then Verify APPLY and DISCARD button is disabled
    #Then Verify value is changed for the504Frequency Low
    #And Change location of the504 Frequency Low  slider to original
    #And Click APPLY button
    #2nd Slider (504 Frequency Hihg)
    #Then Move the504 Frequency High slider to the104 ms value
    #Then Verify Yellow banner is popUp
    #And Verify APPLY and DISCARD button is enabled
    #Then Verify value is changed for504 Frequency High slider
    #Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    #And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    #Then Move the504 Frequency High slider to the204 ms value
    #Then Verify Yellow banner is popUp
    #And Verify APPLY and DISCARD button is enabled
    #And Click APPLY button
    #Then Verify MET/CAL Error is popUp assert header  "MET/CAL Error"
    #And Click ok button
    #And Verify APPLY and DISCARD button is enabled
    #Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    #And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    #Then Verify value is changed for504 Frequency High slider
    #And click on the Enable 504Frequency Low checkbox
    #And Click APPLY button
    #CheckBox (518 Frequency)
    #And click on the Enable 518Frequency Low checkbox
    #Then Verify Yellow banner is popUp
    #And Verify APPLY and DISCARD button is enabled
    #Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    #And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    #Then verify check box Enable 518Frequency is unchecked
    #And verify both sliders and DD for the 518Frequency Low and High is disabled
    #And click on the Enable 518Frequency Low checkbox
    #And Click APPLY button
    #Then Verify Yellow banner is disappear
    #Then Verify APPLY and DISCARD button is disabled
    #Then Verify 518Frequency Low checked
    #slider (518 Frequency Low)
    #Then Move the518 Frequency Low slider to the110 ms value
    #Then Verify Yellow banner is popUp
    #And Verify APPLY and DISCARD button is enabled
    #Then Verify value is changed for the518 Frequency Low
    #Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    #And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    #Then Move the518 Frequency Low slider to the210 ms value
    #Then Verify Yellow banner is popUp
    #And Verify APPLY and DISCARD button is enabled
    #And Click APPLY button
    #Then Verify APPLY and DISCARD button is disabled
    #Then Verify value is changed for the518 Frequency Low
    #And Change location of the518 Frequency Low  slider to original
    #And Click APPLY button
    #slider (518 Frequency High)
    #Then Move the518 Frequency High slider to the118 ms value
    #Then Verify Yellow banner is popUp
    #And Verify APPLY and DISCARD button is enabled
    #Then Verify value is changed for518 Frequency High slider
    #Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    #And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    #Then Move the518 Frequency High slider to the218 ms value
    #Then Verify Yellow banner is popUp
    #And Verify APPLY and DISCARD button is enabled
    #And Click APPLY button
    #Then Verify MET/CAL Error is popUp assert header  "MET/CAL Error"
    #And Click ok button
    #And Verify APPLY and DISCARD button is enabled
    #Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    #And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    #Then Verify value is changed for518 Frequency High slider
    #And click on the Enable 518Frequency Low checkbox
    #And Click APPLY button
    #1 CheckBox (526 Frequency Low)
    And click on the Enable 526Frequency Low checkbox
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then verify check box Enable 526Frequency is unchecked
    And verify both sliders and DD for the 504Frequency Low and High is disabled
    And click on the Enable 526Frequency Low checkbox
    And Click APPLY button
    Then Verify Yellow banner is disappear
    Then Verify APPLY and DISCARD button is disabled
    Then Verify 526Frequency Low checked
    # 1st slider (526 Frequency Low)
    Then Move the526 Frequency Low slider to the130 ms value
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Verify value is changed for the526Frequency Low
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then Move the526 Frequency Low slider to the230 ms value
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    And Click APPLY button
    Then Verify APPLY and DISCARD button is disabled
    Then Verify value is changed for the526Frequency Low
    And Change location of the526 Frequency Low  slider to original
    And Click APPLY button
    #  2nd Slider (526 Frequency Hihg)
    Then Move the526 Frequency High slider to the126.5 ms value
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Verify value is changed for526 Frequency High slider
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then Move the504 Frequency High slider to the226.5 ms value
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    And Click APPLY button
    Then Verify MET/CAL Error is popUp assert header  "MET/CAL Error"
    And Click ok button
    And Verify APPLY and DISCARD button is enabled
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then Verify value is changed for526 Frequency High slider
    And click on the Enable 526Frequency Low checkbox
    And Click APPLY button
    # CheckBox (550 Frequency)
    And click on the Enable 550Frequency Low checkbox
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then verify check box Enable 518Frequency is unchecked
    And verify both sliders and DD for the 518Frequency Low and High is disabled
    And click on the Enable 550Frequency Low checkbox
    And Click APPLY button
    Then Verify Yellow banner is disappear
    Then Verify APPLY and DISCARD button is disabled
    Then Verify 550Frequency Low checked
    # slider (550 Frequency Low)
    Then Move the518 Frequency Low slider to the150 ms value
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Verify value is changed for the550 Frequency Low
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then Move the550 Frequency Low slider to the250 ms value
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    And Click APPLY button
    Then Verify APPLY and DISCARD button is disabled
    Then Verify value is changed for the518 Frequency Low
    And Change location of the518 Frequency Low  slider to original
    And Click APPLY button
    #slider (550 Frequency High)
    Then Move the550 Frequency High slider to the150 ms value
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Verify value is changed for550 Frequency High slider
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then Move the550 Frequency High slider to the250 ms value
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    And Click APPLY button
    Then Verify MET/CAL Error is popUp assert header  "MET/CAL Error"
    And Click ok button
    And Verify APPLY and DISCARD button is enabled
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then Verify value is changed for550 Frequency High slider
    And click on the Enable 5Frequency Low checkbox
    And Click APPLY button
