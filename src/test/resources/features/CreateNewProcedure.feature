Feature: setUp procedure

  @Progression
  Scenario Outline: Create
    Given Open METCAL Runtime and entel valid login and password
    Then Click on the LogIn button
    And move slider to simulation mode
    And click on the Select DUT button
    Then verify the "<windows name>"
    And enter the "<Asset Number>" and click ok button
    And click save button
    Then select "<PXE>" from the PC
    And navigate to the Run window and click run button
    Then enter "<WorkOrderNumber>" click ok button
    Then enter "<Temperature>" and "<Hunidity>" and click ok button
    
    
    
    And click advance button on Test information1 screen
    And click advance button on Test information2 screen
    And click advance button on Test information3 screen
    And click advance button on Test information4 screen
    And click advance button on Test information5 screen
    And click advance button on Test information6 screen
    And click advance button on Test information7 screen
    And click advance button on Test information8 screen
    Then click ok button on the Please Remove All connection screen

    Examples: 
      | windows name | Asset Number        | PXE           | WorkOrderNumber      | Temperature | Hunidity |
      | Asset Number | AutomationTestAsset | z540_Proc.pxe | AutomatedIDworkOrder |          77 |       37 |
