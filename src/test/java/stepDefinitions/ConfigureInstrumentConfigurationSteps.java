package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import utils.CommonMethods;

public class ConfigureInstrumentConfigurationSteps extends CommonMethods {

	/**
	 * Feature1 start
	 */
	@Then("click on the 4000A checkbox")
	public void click_on_the_4000A_checkbox() {
		CommonMethods.click(instrumentConfigurationPageElementsOne.fourThousand_SRQ_SDC_checkBox);
	}

	@Then("Verify 4000A checkbox is checked")
	public void verify_4000A_checkbox_is_checked() {
		Assert.assertTrue(instrumentConfigurationPageElementsOne.fourThousand_SRQ_SDC_checkBox.isSelected());

	}

	@Then("verify check box 4000A is unchecked")
	public void verify_check_box_4000A_is_unchecked() {
		Assert.assertFalse(instrumentConfigurationPageElementsOne.fourThousand_SRQ_SDC_checkBox.isSelected());
	}

	@Then("click on the 34401A checkbox")
	public void click_on_the_34401A_checkbox() {
		CommonMethods.click(instrumentConfigurationPageElementsOne.thirtyFourThousandFourHundredOne_SRQ_SDC_checkBox);
	}

	@Then("Verify 34401A checkbox is checked")
	public void verify_34401A_checkbox_is_checked() {
		Assert.assertTrue(
				instrumentConfigurationPageElementsOne.thirtyFourThousandFourHundredOne_SRQ_SDC_checkBox.isSelected());
	}

	@Then("verify check box 34401A is unchecked")
	public void verify_check_box_34401A_is_unchecked() {
		Assert.assertFalse(
				instrumentConfigurationPageElementsOne.thirtyFourThousandFourHundredOne_SRQ_SDC_checkBox.isSelected());
	}

	@Then("click on the 3420A checkbox")
	public void click_on_the_3420A_checkbox() {
		CommonMethods
				.click(instrumentConfigurationPageElementsOne.thirtyFourThousandFourHundredTwenty_SRQ_SDC_checkBox);
	}

	@Then("verify check box 3420A is unchecked")
	public void verify_check_box_3420A_is_unchecked() {
		Assert.assertFalse(instrumentConfigurationPageElementsOne.thirtyFourThousandFourHundredTwenty_SRQ_SDC_checkBox
				.isSelected());
	}

	@Then("Verify 3420A checkbox is checked")
	public void verify_3420A_checkbox_is_checked() {
		Assert.assertTrue(instrumentConfigurationPageElementsOne.thirtyFourThousandFourHundredTwenty_SRQ_SDC_checkBox
				.isSelected());
	}

	@Then("click on the 2000SRQ checkbox")
	public void click_on_the_2000SRQ_checkbox() {
		CommonMethods.click(instrumentConfigurationPageElementsOne.twoThousand_SRQ_SDC_checkBox);

	}

	@Then("verify check box 2000SRQ is unchecked")
	public void verify_check_box_2000SRQ_is_unchecked() {
		Assert.assertFalse(instrumentConfigurationPageElementsOne.twoThousand_SRQ_SDC_checkBox.isSelected());

	}

	@Then("Verify 2000SRQ checkbox is checked")
	public void verify_2000SRQ_checkbox_is_checked() {

		Assert.assertTrue(instrumentConfigurationPageElementsOne.twoThousand_SRQ_SDC_checkBox.isSelected());
	}

	@Then("click on the 2001SRQ SDC checkbox")
	public void click_on_the_2001SRQ_SDC_checkbox() {
		CommonMethods.click(instrumentConfigurationPageElementsOne.twoThousandOne_2woThousandTwo_SRQ_SDC_checkBox);
	}

	@Then("verify check box 2001SRQ SDC is unchecked")
	public void verify_check_box_2001SRQ_SDC_is_unchecked() {
		Assert.assertFalse(
				instrumentConfigurationPageElementsOne.twoThousandOne_2woThousandTwo_SRQ_SDC_checkBox.isSelected());
	}

	@Then("Verify 2001SRQ SDC checkbox is checked")
	public void verify_2001SRQ_SDC_checkbox_is_checked() {
		Assert.assertTrue(
				instrumentConfigurationPageElementsOne.twoThousandOne_2woThousandTwo_SRQ_SDC_checkBox.isSelected());
	}

	@Then("Select A for the 8903Model Suffix")
	public void select_A_for_the_8903Model_Suffix() {
		recurringElemets.comboBox.get(0).click();
		instrumentConfigurationPageElementsOne.valueAfROM8903ModuleSuffix.click();

	}

	@Then("verify value for 8903Model Suffix is {string}")
	public void verify_value_for_8903Model_Suffix_is(String string) {
		Assert.assertEquals(string,
				instrumentConfigurationPageElementsOne.eightthousandNinehundredThreeDD.getAttribute("AutomationId"));
	}

	@Then("change value 8903Model Suffix {string}")
	public void change_value_8903Model_Suffix(String string) {
		recurringElemets.comboBox.get(0).click();
		instrumentConfigurationPageElementsOne.valueBfROM8903ModuleSuffix.click();
	}

	String sliderValue;

	@Then("Move 8901A\\/B Data Avail. Timeout slider to the {int} ms value")
	public void move_8901A_B_Data_Avail_Timeout_slider_to_the_ms_value(Integer int1) {
		sliderValue = instrumentConfigurationPageElementsOne.valueFrom8901abSlider.getAttribute("AutomationId");
		recurringElemets.increaseLarge.get(0).click();
		System.out.println(sliderValue);
		System.out.println(instrumentConfigurationPageElementsOne.valueFrom8901abSlider.getAttribute("AutomationId"));
	}

	@Then("Verify value is changed for 8901A\\/B Data Avail. Timeout")
	public void verify_value_is_changed_for_8901A_B_Data_Avail_Timeout() {
		Assert.assertNotEquals(sliderValue,
				instrumentConfigurationPageElementsOne.valueFrom8901abSlider.getAttribute("Name"));
	}

	@Then("Move 8901A\\/B Data Avail. Timeout to the {int} ms value")
	public void move_8901A_B_Data_Avail_Timeout_to_the_ms_value(Integer int1) {
		sliderValue = instrumentConfigurationPageElementsOne.valueFrom8901abSlider.getAttribute("AutomationId");
		recurringElemets.increaseLarge.get(0).click();
		recurringElemets.increaseLarge.get(0).click();
	}

	@Then("Change location of the 8901A\\/B  slider to original")
	public void change_location_of_the_8901A_B_slider_to_original() {
		recurringElemets.decreaseLarge.get(0).click();
		recurringElemets.decreaseLarge.get(0).click();
	}

	/**
	 * Feature2 start
	 */

	@Then("Click 525A  IEEE488 checkbox")
	public void Click_525A_IEEE488_checkbox() {
		instrumentConfigurationPageElementsOne._525AIEEE488checkBox.click();
	}

	@Then("Verify 525EIEE488 check box is checked")
	public void Verify_525EIEE488_check_box_is_checked() {
		Assert.assertTrue(instrumentConfigurationPageElementsOne._525AIEEE488checkBox.isSelected());
	}

	@Then("Verify Terminator IEEE488 to RS232 Converter and Pressure Module Timeout is disabled")
	public void verify_Terminator_IEEE488_to_RS232_Converter_and_Pressure_Module_Timeout_is_disabled() {
		Assert.assertFalse(recurringElemets.comboBox.get(1).isEnabled());
		Assert.assertFalse(recurringElemets.increaseLarge.get(1).isEnabled());
	}

	@Then("Verify Terminator IEEE488 to RS232 Converter and Pressure Module Timeout is enabled")
	public void verify_Terminator_IEEE488_to_RS232_Converter_and_Pressure_Module_Timeout_is_enabled() {
		Assert.assertTrue(recurringElemets.comboBox.get(1).isEnabled());
		Assert.assertTrue(recurringElemets.increaseLarge.get(1).isEnabled());
	}

	@Then("Select CR for the Terminator IEEE488 to RS232 Converter")
	public void select_CR_for_the_Terminator_IEEE488_to_RS232_Converter() {
		recurringElemets.comboBox.get(1).click();
		instrumentConfigurationPageElementsOne.CRValueFromTheTerminatorieee488DD.click();
	}

	@Then("verify value for Terminator IEEE488 to RS232 Converter is {string}")
	public void verify_value_for_Terminator_IEEE488_to_RS232_Converter_is(String string) {
		Assert.assertEquals(string, instrumentConfigurationPageElementsOne.terminatorIEEE488toRS232ConverterDD
				.getAttribute("AutomationId"));

	}

	@Then("Select LF for the Terminator IEEE488 to RS232 Converter")
	public void select_LF_for_the_Terminator_IEEE488_to_RS232_Converter() {
		recurringElemets.comboBox.get(1).click();
		instrumentConfigurationPageElementsOne.LFValueFromTheTerminatorieee488DD.click();
	}

	@Then("verify value for Terminator IEEE488 to RS232 Converter {string}")
	public void verify_value_for_Terminator_IEEE488_to_RS232_Converter(String string) {
		Assert.assertEquals(string, instrumentConfigurationPageElementsOne.terminatorIEEE488toRS232ConverterDD
				.getAttribute("AutomationId"));

	}

	@Then("change value Terminator IEEE488 to RS232 Converter To default value")
	public void change_value_Terminator_IEEE488_to_RS232_Converter_To_default_value() {
		recurringElemets.comboBox.get(1).click();
		instrumentConfigurationPageElementsOne.EOIValueFromTheTerminatorieee488DD.click();
	}

	// slider

	@Then("Move Pressure Module Timeout slider to the {int} ms value")
	public void move_Pressure_Module_Timeout_slider_to_the_ms_value(Integer int1) {
		sliderValue = instrumentConfigurationPageElementsOne.pressureModuleTimeoutValue.getAttribute("AutomationId");
		recurringElemets.increaseLarge.get(1).click();

	}

	@Then("Verify value is changed for Pressure Module Timeout")
	public void verify_value_is_changed_for_Pressure_Module_Timeout() {
		Assert.assertNotEquals(sliderValue,
				instrumentConfigurationPageElementsOne.pressureModuleTimeoutValue.getAttribute("Name"));
	}

	@Then("Move Pressure Module Timeout to the {int} ms value")
	public void move_Pressure_Module_Timeout_to_the_ms_value(Integer int1) {
		sliderValue = instrumentConfigurationPageElementsOne.pressureModuleTimeoutValue.getAttribute("AutomationId");
		CommonMethods.doubleClick(recurringElemets.increaseLarge.get(1));

	}

	@Then("Verify value is changed for Pressure Module Timeout slider")
	public void verify_value_is_changed_for_Pressure_Module_Timeout_slider() {
		Assert.assertNotEquals(sliderValue,
				instrumentConfigurationPageElementsOne.pressureModuleTimeoutValue.getAttribute("Name"));

	}

	@Then("Change location of the Pressure Module Timeout  slider to original")
	public void change_location_of_the_Pressure_Module_Timeout_slider_to_original() {
		CommonMethods.doubleClick(recurringElemets.decreaseLarge.get(1));

	}

	/**
	 * Feature 3 start
	 */

	@Then("Click Near Cal Due SRQ checkbox")
	public void click_Near_Cal_Due_SRQ_checkbox() {
		instrumentConfigurationPageElementsOne.nearCalDueSRQcheckBox.click();
	}

	@Then("Click Past Cal Due SRQ checkbox")
	public void click_Past_Cal_Due_SRQ_checkbox() {
		instrumentConfigurationPageElementsOne.pastCalDueSRQcheckBox.click();

	}

	@Then("Select Datron-Yokogawa for the Manufacturer Suffix")
	public void select_Datron_Yokogawa_for_the_Manufacturer_Suffix() {
		instrumentConfigurationPageElementsOne.manufacturerDD.click();
		instrumentConfigurationPageElementsOne.datronYokogawaValueDD.click();

	}

	@Then("verify value for Manufacturer is {string}")
	public void verify_value_for_Manufacturer_is(String string) {
		Assert.assertEquals(string, instrumentConfigurationPageElementsOne.manufacturerDD.getAttribute("AutomationId"));
	}

	@Then("Select Fluke for the Manufacturer")
	public void select_Fluke_for_the_Manufacturer() {
		instrumentConfigurationPageElementsOne.manufacturerDD.click();
		instrumentConfigurationPageElementsOne.flukeValueManufacturedDD.click();
	}

	@Then("Verify Near and Past check boxes is checked")
	public void verify_near_and_past_check_boxes_is_checked() {
		Assert.assertTrue(instrumentConfigurationPageElementsOne.nearCalDueSRQcheckBox.isSelected());
		Assert.assertTrue(instrumentConfigurationPageElementsOne.pastCalDueSRQcheckBox.isSelected());
	}

	@Then("Discard all changes in section")
	public void discard_all_changes_in_section() {
		instrumentConfigurationPageElementsOne.nearCalDueSRQcheckBox.click();
		instrumentConfigurationPageElementsOne.pastCalDueSRQcheckBox.click();
		instrumentConfigurationPageElementsOne.manufacturerDD.click();
		instrumentConfigurationPageElementsOne.defaultManufacturer.click();

	}

}
