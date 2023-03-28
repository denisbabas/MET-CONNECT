Feature: 	SetUp procedure

  @Smoke
  Scenario Outline: Create
    Given Open METCAL Runtime and enter valid login and password for MC user
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
    And on the Post-Prompt screen select "<As-Found/As-Left>" dropdown and enter "<Notes>" to the textbox
    And get text from the MetCal Information and asssert "<How exported data>"

    Examples: 
      | windows name | Asset Number        | PXE       | WorkOrderNumber      | Temperature | Hunidity | As-Found/As-Left | Notes                       | How exported data           |
      | Asset Number | AutomationTestAsset | z540_Proc | AutomatedIDworkOrder |          77 |       37 | As-Found         | This is automated test note | Data exported successfully: |
