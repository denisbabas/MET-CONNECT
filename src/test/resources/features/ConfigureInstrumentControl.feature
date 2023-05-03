#Author: Denys Babasiuk
Feature: Configure Instrument Control

  @Smoke
  Scenario: Configure Instrument Control Drop downs 
    Given Open METCAL Runtime and enter valid login and password for MC user
    Then Click on the LogIn button
    When Select Configure then Instrument Control section and verify APPLY and DISCARD buttons are disabled
    And Select "COM1" for Default RS232 Port and verify APPLY and DISCARD buttons are enabled
    Then Verify Yellow banner is popUp
    And Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    Then Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then Assert default part for  RS232 is "cmboDefaultRS232Port:None (Default)"
    And Select "COM2" for Default RS232 Port and verify APPLY and DISCARD buttons are enabled then click APPLY button
    And Assert APPLY and Discard button is disabled and default part is "cmboDefaultRS232Port:COM2"
    Then Change Default RS232 Port on "cmboDefaultRS232Port:None (Default)"
 
    Then Select "1" for IEEE-488 Num. Boards
    And Verify APPLY and DISCARD button is enabled
    Then Verify Yellow banner is popUp
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then Verify numbers boards is "cmboIEEENumBoards:None (Default)"
    Then Select "1" for IEEE-488 Num. Boards
    And Verify APPLY and DISCARD button is enabled
      Then Verify Yellow banner is popUp
    And Click APPLY button
    Then Verify APPLY and DISCARD button is disabled
    Then Verify numbers boards is "cmboIEEENumBoards:1"
    And Change number boards to None and click APPLY
    
    
    Then Select "Clear" for IEEE-488 Port0 SRQ  and assert "cmboIEEEPort0SRQ:Clear"
    And Verify APPLY and DISCARD button is enabled
      Then Verify Yellow banner is popUp
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then Assert IEEE-488 Port 0 SRQ is "cmboIEEEPort0SRQ:Prompt (Default)"
    Then Select "Error" for IEEE488 Port0 SRQ and assert "cmboIEEEPort0SRQ:Error"
    And Verify APPLY and DISCARD button is enabled
      Then Verify Yellow banner is popUp
    And Click APPLY button
   Then Assert that IEEE-488 Port 0 SRQ is "cmboIEEEPort0SRQ:Error"
    Then Change IEEE-488 Port 0 SRQ to default value
    Then Select "Clear" for IEEE-488 Port1 SRQ and assert "cmboIEEEPort1SRQ:Error"
    And Verify APPLY and DISCARD button is enabled
      Then Verify Yellow banner is popUp
    And Click APPLY button
    Then Verify APPLY and DISCARD button is disabled
    Then Verify "cmboIEEEPort1SRQ:Error" is selected for IEEE-488 Port1 SRQ
    Then Change Port1 to "Prompt" and click APPLY
    
    
    
    @Progression
    Scenario: Configure Instrument Control sliders
    Given Open METCAL Runtime and enter valid login and password for MC user
    Then Click on the LogIn button
    When Select Configure then Instrument Control section and verify APPLY and DISCARD buttons are disabled
    Then Move IEEE-488 FIND LISTENER Delay slider to the 300 ms value
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Verify value is changed for IEEE-488 FIND LISTENER Delay slider
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then Move IEEE488 FIND LISTENER Delay slider to the 400 ms value
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    And Click APPLY button
    Then Verify APPLY and DISCARD button is disabled
    Then Verify value is changed for IEEE-488 FIND LISTENER Delay slider
    And Change location of the IEEE-488 FIND LISTENER Delay slider to original and click APPLY
    #2
    Then Move IEEE2/SCPI Query Delay slider to the 420 ms value
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Verify value is changed for IEEE2/SCPI Query Delay slider
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then Move IEEE2SCPI Query Delay slider to the 520 ms value
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    And Click APPLY button
    Then Verify APPLY and DISCARD button is disabled
    Then Verify value is changed for IEEE2/SCPI Query Delay slider
    And Change location of the IEEE2/SCPI Query Delay slider to original and click APPLY
    #3
    Then Move 8902/803 Serial Poll Slow slider to the 800 ms value
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Verify value is changed for 8902/803 Serial Poll Slow slider
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then Move 8902/803_Serial Poll Slow slider to the 900 ms value
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    And Click APPLY button
    Then Verify APPLY and DISCARD button is disabled
    Then Verify value is changed for 8902/803 Serial Poll Slow slider
    And Change location of the 8902/803 Serial Poll Slow slider to original and click APPLY
    #4
    Then Move Pre-serial Poll Delay slider to the 300 ms value
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Verify value is changed for Pre-serial Poll Delay slider
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then Move PreSerial Poll Delay slider to the 400 ms value
    And Verify APPLY and DISCARD button is enabled
    And Click APPLY button
    Then Verify APPLY and DISCARD button is disabled
    Then Verify value is changed for Pre-serial Poll Delay slider
    And Change location of the Pre-serial Poll Delay to original and click APPLY
    #5
    Then Move Post-serial Poll Delay slider to the 300 ms value
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Verify value is changed for Post-serial Poll Delay slider
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then Move PostSerial Poll Delay slider to the 400 ms value
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    And Click APPLY button
    Then Verify APPLY and DISCARD button is disabled
    Then Verify value is changed for Post-serial Poll Delay slider
    And Change location of the Post-serial Poll Delay slider to original and click APPLY
    #6
    Then Move Serial Poll Retries slider to the 30ms value
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    Then Verify value is changed for Serial Poll Retries slider
    Then Click DISCARD button AND assert confirmation message "Are you sure you want to discard your changes?"
    And Click Yes on confirmation message and assert APPLY and Discard button is disabled
    Then Move SerialPoll Retries slider to the 40ms value
    Then Verify Yellow banner is popUp
    And Verify APPLY and DISCARD button is enabled
    And Click APPLY button
    Then Verify APPLY and DISCARD button is disabled
    Then Verify value is changed for Serial Poll Retries slider
    And Change location of the Serial Poll Retries to original and click APPLY
    
    
