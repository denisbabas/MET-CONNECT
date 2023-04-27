Feature: ConfigureInstrumentAgilentN1914A

  @Smoke
  Scenario Outline: System instrument test part one (Agilent N1914A)
    Given Open METCAL Runtime and enter valid login and password for MC user
    Then Click on the LogIn button
    And Add Agilent "N1914A", assert "<FSC>" and verify Asset info button disabled
    And Add barcode "<Barcode>" and Verify Asset Info button is enabled
    Then Click Asset Info button and assert "<Barcode>"
    And Assert "RemoteInterface:IEEE-488" is pre-selected and Verify Address "IEEEAddress:13" is pre-selected in the IEEE488 Adress
    Then change IEEE488 Adress "25"  and verify adress is selected properly "IEEEAddress:25"
    And Select Option003 check box and verify is selected
    Then Click Aliases Add button and Assert Instrument Alias "<Label>"
    Then Enter "Test77" alias and Assert "Test77" and "EPM" are present
    Then Add Alias number "16" and assert text from info page "Illegal alias string (16)."
    Then Add Alias number "Test77" and assert text from info page "Test77 already exists in the alias list."
    And Select "Test" alias, click Delete and Assert only "EPM" is present
    And discard all changes

    Examples: 
      | FSC             | Barcode     | Label            |
      | IEEE, EPM, SCPI | TestBarcode | Instrument Alias |

  @Smoke
  Scenario Outline: System instrument test part two (Agilent N1914A)
    Given Open METCAL Runtime and enter valid login and password for MC user
    Then Click on the LogIn button
    And Add Agilent "N1914A", assert "<FSC>" and verify Asset info button disabled
    And Add barcode "<Barcode>" and Verify Asset Info button is enabled
    Then Click Help button and verify help page is opened assert "<Header>" and click ok button
    Then Verify Channel A and Channel B barcode fields are disabled
    Then Verify Channel C and Channel D barcode fields are disabled
    And Verify Power Sensors Drop Down is enabled for Chanel A and Chanel B
    And Verify Power Sensors Drop Down is disabled for Chanel C and Chanel D
    And select USB Ports check box
    And Verify Power Sensors Drop Down is enabled for Chanel C and Chanel D
    Then Verify + buttons for all channels are enabled and - buttons for all channels are disabled
    Then Verify Barcode fields for all channels are disabled and Asset Info buttons are disabled for all channels Barcode fields
    And Select any power sensor for Channel A and Verify Barcode field for that sensor is enabled
    Then Enter barcode for that sensor and Verify corresponding Asset Info button is enabled
    Then Select all available power sensors for Channel A with their barcodes and Verify power sensor dropdowns are disabled for Channel B, C and D
    And Delete one power sensor from Channel A by clicking minus button and Verify power sensor dropdowns are enabled for all channels
    Then Click ok button
    Then Verify "Agilent N1914A" is present on the instrument page
    And Click on the instrument and click Delete button
    Then click Yes button on the Confirm window and verify instrument "Agilent N1914A" succesfully deleted

    Examples: 
      | FSC             | Barcode     | Header                   |
      | IEEE, EPM, SCPI | TestBarcode | System Instrument Dialog |
