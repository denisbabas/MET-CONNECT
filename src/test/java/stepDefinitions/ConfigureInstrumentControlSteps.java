package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class ConfigureInstrumentControlSteps extends CommonMethods {
	
	/**
	 * Feature1 start
	 */
	@When("Select Configure then Instrument Control section and verify APPLY and DISCARD buttons are disabled")
	public void select_Configure_then_Instrument_Control_section_and_verify_APPLY_and_DISCARD_buttons_are_disabled() {
		CommonMethods.setUpPageElements.configureButton.click();
		CommonMethods.setUpPageElements.InstrumentControlMenu.click();
		Assert.assertFalse(setUpPageElements.discardButton.isEnabled());
		Assert.assertFalse(setUpPageElements.applyButton.isEnabled());
	}

	@When("Select {string} for Default RS232 Port and verify APPLY and DISCARD buttons are enabled")
	public void select_for_Default_RS232_Port_and_verify_APPLY_and_DISCARD_buttons_are_enabled(String string) {

		CommonMethods.clickThenSelectOptionFromDropdownByText(recurringElemets.comboBox.get(0),
				instrumentControlPageElements.ADefaultRS232PortList, string);
		Assert.assertTrue(setUpPageElements.discardButton.isEnabled());
		Assert.assertTrue(setUpPageElements.applyButton.isEnabled());

	}

	@Then("Click DISCARD button AND assert confirmation message {string}")
	public void click_DISCARD_button_AND_assert_confirmation_message(String string) {
		setUpPageElements.discardButton.click();
		Assert.assertEquals(string, setUpPageElements.confirmWindowText.getAttribute("Name"));

	}

	@Then("Verify Yellow banner is popUp")
	public void verify_Yellow_banner_is_popUp() {
		Assert.assertTrue(setUpPageElements.alertBunnerAboutChanges.isEnabled());
	}

	@Then("Click Yes on confirmation message and assert APPLY and Discard button is disabled")
	public void click_Yes_on_confirmation_message_and_assert_APPLY_and_Discard_button_is_disabled() {
		setUpPageElements.yesButton.click();
		Assert.assertFalse(setUpPageElements.discardButton.isEnabled());
		Assert.assertFalse(setUpPageElements.applyButton.isEnabled());

	}

	@Then("Assert default part for  RS232 is {string}")
	public void assert_default_part_for_RS232_is(String string) {
		Assert.assertEquals(string, recurringElemets.comboBox.get(0).getAttribute("AutomationId"));

	}

	@Then("Select {string} for Default RS232 Port and verify APPLY and DISCARD buttons are enabled then click APPLY button")
	public void select_for_Default_RS232_Port_and_verify_APPLY_and_DISCARD_buttons_are_enabled_then_click_APPLY_button(
			String string) {
		CommonMethods.clickThenSelectOptionFromDropdownByText(recurringElemets.comboBox.get(0),
				instrumentControlPageElements.ADefaultRS232PortList, string);
		Assert.assertTrue(setUpPageElements.discardButton.isEnabled());
		Assert.assertTrue(setUpPageElements.applyButton.isEnabled());
		setUpPageElements.applyButton.click();
	}

	@Then("Assert APPLY and Discard button is disabled and default part is {string}")
	public void assert_APPLY_and_Discard_button_is_disabled_and_default_part_is(String string) {
		Assert.assertFalse(setUpPageElements.discardButton.isEnabled());
		Assert.assertFalse(setUpPageElements.applyButton.isEnabled());

		Assert.assertEquals(string,
				instrumentControlPageElements.DefaultRS232PortCom2Value.getAttribute("AutomationId"));

	}

	@Then("Change Default RS232 Port on {string}")
	public void change_Default_RS232_Port_on(String string) throws Throwable {
		recurringElemets.comboBox.get(0).click();
		Actions actions = new Actions(driver);
		actions.click(recurringElemets.pageUp).build().perform();
		int a = recurringElemets.listBoxItem.size();
		System.out.println(a + " - this is size list ");
		instrumentControlPageElements.DefaultRS232Port.click();
		setUpPageElements.applyButton.click();
	}

	@Then("Select {string} for IEEE-{int} Num. Boards")
	public void select_for_IEEE_Num_Boards(String string, Integer int1) {
		recurringElemets.comboBox.get(1).click();
		instrumentControlPageElements.oneValueIEEE488NumBoards.click();

	}

	@Then("Verify APPLY and DISCARD button is enabled")
	public void verify_APPLY_and_DISCARD_button_is_enabled() {
		Assert.assertTrue(setUpPageElements.discardButton.isEnabled());
		Assert.assertTrue(setUpPageElements.applyButton.isEnabled());

	}
	

	@Then("Verify numbers boards is {string}")
	public void verify_numbers_boards_is(String string) {

		Assert.assertEquals(string, recurringElemets.comboBox.get(1).getAttribute("AutomationId"));

	}

	@Then("Click APPLY button")
	public void click_APPLY_button() {
		setUpPageElements.applyButton.click();
	}

	@Then("Verify APPLY and DISCARD button is disabled")
	public void verify_APPLY_and_DISCARD_button_is_disabled() {
		Assert.assertFalse(setUpPageElements.discardButton.isEnabled());
		Assert.assertFalse(setUpPageElements.applyButton.isEnabled());

	}

	@Then("Change number boards to None and click APPLY")
	public void change_number_boards_to_None_and_click_APPLY() {
		recurringElemets.comboBox.get(1).click();
		instrumentControlPageElements.defaultValueIEEE488NumBoards.click();
		setUpPageElements.applyButton.click();

	}

	@Then("Select {string} for IEEE-{int} Port0 SRQ  and assert {string}")
	public void select_for_IEEE_Port0_SRQ_and_assert(String string, Integer int1, String string2) {

		recurringElemets.comboBox.get(2).click();
		instrumentControlPageElements.clearValueForEEE488Port0SRQ.click();

		Assert.assertEquals(string2, recurringElemets.comboBox.get(2).getAttribute("AutomationId"));

	}

	@Then("Assert IEEE-{int} Port {int} SRQ is {string}")
	public void assert_IEEE_Port_SRQ_is(Integer int1, Integer int2, String string) {
		Assert.assertEquals(string, recurringElemets.comboBox.get(2).getAttribute("AutomationId"));
	}

	@Then("Assert that IEEE-{int} Port {int} SRQ is {string}")
	public void assert_that_IEEE_Port_SRQ_is(Integer int1, Integer int2, String string) {
		recurringElemets.comboBox.get(2).click();
		instrumentControlPageElements.errorValueForEEE488Port0SRQ.click();
		Assert.assertEquals(string, recurringElemets.comboBox.get(2).getAttribute("AutomationId"));
	}

	@Then("Select {string} for IEEE488 Port0 SRQ and assert {string}")
	public void select_for_IEEE488_Port0_SRQ_and_assert(String string, String string2) {
		recurringElemets.comboBox.get(2).click();
		instrumentControlPageElements.errorValueForEEE488Port0SRQ.click();
		Assert.assertEquals(string2, recurringElemets.comboBox.get(2).getAttribute("AutomationId"));
	}

	@Then("Change IEEE-{int} Port {int} SRQ to default value")
	public void change_IEEE_Port_SRQ_to_default_value(Integer int1, Integer int2) {
		recurringElemets.comboBox.get(2).click();
		instrumentControlPageElements.defaultValueForEEE488Port0SRQ.click();
		setUpPageElements.applyButton.click();

	}

	@Then("Select {string} for IEEE-{int} Port1 SRQ and assert {string}")
	public void select_for_IEEE_Port1_SRQ_and_assert(String string, Integer int1, String string2) {
		recurringElemets.comboBox.get(3).click();
		instrumentControlPageElements.errorValueForIEEE488Port1SRQ.click();
		Assert.assertEquals(string2, recurringElemets.comboBox.get(3).getAttribute("AutomationId"));
	}

	@Then("Verify {string} is selected for IEEE-{int} Port1 SRQ")
	public void verify_is_selected_for_IEEE_Port1_SRQ(String string, Integer int1) {
		Assert.assertEquals(string, recurringElemets.comboBox.get(3).getAttribute("AutomationId"));
	}

	@Then("Change Port1 to {string} and click APPLY")
	public void change_Port1_to_and_click_APPLY(String string) {
		recurringElemets.comboBox.get(3).click();
		instrumentControlPageElements.defaultValueForEEE488Port1SRQ.click();
		setUpPageElements.applyButton.click();
	}
	/**
	 * Feature2 start
	 */

	String sliderValue;

	@Then("Move IEEE-{int} FIND LISTENER Delay slider to the {int} ms value")
	public void move_IEEE_FIND_LISTENER_Delay_slider_to_the_ms_value(Integer int1, Integer int2) {
		sliderValue = instrumentControlPageElements.IEEE_ListenerDelayValue.getAttribute("Name");

		for (int i = 0; i <= 2; i++) {
			recurringElemets.increaseLarge.get(0).click();
		}
	}

	@Then("Verify value is changed for IEEE-{int} FIND LISTENER Delay slider")
	public void verify_value_is_changed_for_IEEE_FIND_LISTENER_Delay_slider(Integer int1) {
		Assert.assertNotEquals(sliderValue, instrumentControlPageElements.IEEE_ListenerDelayValue.getAttribute("Name"));
		
	}

	@Then("Move IEEE488 FIND LISTENER Delay slider to the {int} ms value")
	public void move_IEEE488_FIND_LISTENER_Delay_slider_to_the_ms_value(Integer int1) {
		for (int i = 0; i < 2; i++) {
			CommonMethods.doubleClick(recurringElemets.increaseLarge.get(0));
			
		}
	}

	@Then("Change location of the IEEE-{int} FIND LISTENER Delay slider to original and click APPLY")
	public void change_location_of_the_IEEE_FIND_LISTENER_Delay_slider_to_original_and_click_APPLY(Integer int1) {
		for (int i = 0; i < 2; i++) {
			CommonMethods.doubleClick(recurringElemets.decreaseLarge.get(0));
	
		}
		setUpPageElements.applyButton.click();
		Assert.assertEquals(sliderValue, instrumentControlPageElements.IEEE_ListenerDelayValue.getAttribute("Name"));
	}
//////////////////////////////////////////////////////
	@Then("Move IEEE2\\/SCPI Query Delay slider to the {int} ms value")
	public void move_IEEE2_SCPI_Query_Delay_slider_to_the_ms_value(Integer int1) {
		sliderValue = instrumentControlPageElements.IEEE_SCPI_QueryDelayValue.getAttribute("Name");

		for (int i = 0; i <= 2; i++) {
			recurringElemets.increaseLarge.get(1).click();
		}
	}

	@Then("Verify value is changed for IEEE2\\/SCPI Query Delay slider")
	public void verify_value_is_changed_for_IEEE2_SCPI_Query_Delay_slider() {
		Assert.assertNotEquals(sliderValue, instrumentControlPageElements.IEEE_SCPI_QueryDelayValue.getAttribute("Name"));
	}
	
	
	@Then("Move IEEE2SCPI Query Delay slider to the {int} ms value")
	public void move_IEEE2SCPI_Query_Delay_slider_to_the_ms_value(Integer int1) {
		for (int i = 0; i < 2; i++) {

			CommonMethods.doubleClick(recurringElemets.increaseLarge.get(1));
		}
	}

	@Then("Change location of the IEEE2\\/SCPI Query Delay slider to original and click APPLY")
	public void change_location_of_the_IEEE2_SCPI_Query_Delay_slider_to_original_and_click_APPLY() throws Throwable {
	       CommonMethods.doubleClick(recurringElemets.decreaseLarge.get(1));
	       CommonMethods.doubleClick(recurringElemets.decreaseLarge.get(1));
	       setUpPageElements.applyButton.click();
	       Assert.assertEquals(sliderValue, instrumentControlPageElements.IEEE_SCPI_QueryDelayValue.getAttribute("Name"));
	}
	//////////////////////////////////////////////////
	@Then("Move {int}\\/{int} Serial Poll Slow slider to the {int} ms value")
	public void move_Serial_Poll_Slow_slider_to_the_ms_value(Integer int1, Integer int2, Integer int3) {
		sliderValue = instrumentControlPageElements.SerialPollSlowValue.getAttribute("Name");

		for (int i = 0; i <= 2; i++) {
			recurringElemets.increaseLarge.get(2).click();
		}
	}

	@Then("Verify value is changed for {int}\\/{int} Serial Poll Slow slider")
	public void verify_value_is_changed_for_Serial_Poll_Slow_slider(Integer int1, Integer int2) {
		Assert.assertNotEquals(sliderValue, instrumentControlPageElements.SerialPollSlowValue.getAttribute("Name"));
	}

	@Then("Move {int}\\/{int}_Serial Poll Slow slider to the {int} ms value")
	public void move__Serial_Poll_Slow_slider_to_the_ms_value(Integer int1, Integer int2, Integer int3) {
		for (int i = 0; i < 2; i++) {

			CommonMethods.doubleClick(recurringElemets.increaseLarge.get(2));
		}
	}

	@Then("Change location of the {int}\\/{int} Serial Poll Slow slider to original and click APPLY")
	public void change_location_of_the_Serial_Poll_Slow_slider_to_original_and_click_APPLY(Integer int1, Integer int2) {
		 CommonMethods.doubleClick(recurringElemets.decreaseLarge.get(2));
	       CommonMethods.doubleClick(recurringElemets.decreaseLarge.get(2));
	       setUpPageElements.applyButton.click();
	       Assert.assertEquals(sliderValue, instrumentControlPageElements.SerialPollSlowValue.getAttribute("Name"));
	}
	/////////////////////////
	@Then("Move Pre-serial Poll Delay slider to the {int} ms value")
	public void move_Pre_serial_Poll_Delay_slider_to_the_ms_value(Integer int1) {
		sliderValue = instrumentControlPageElements.PreSerialPollDelayValue.getAttribute("Name");

		for (int i = 0; i <= 2; i++) {
			recurringElemets.increaseLarge.get(3).click();
		}
	}
	    

	@Then("Verify value is changed for Pre-serial Poll Delay slider")
	public void verify_value_is_changed_for_Pre_serial_Poll_Delay_slider() {
		Assert.assertNotEquals(sliderValue, instrumentControlPageElements.PreSerialPollDelayValue.getAttribute("Name"));
	}
	@Then("Move PreSerial Poll Delay slider to the {int} ms value")
	public void move_PreSerial_Poll_Delay_slider_to_the_ms_value(Integer int1) {
		for (int i = 0; i < 2; i++) {

			CommonMethods.doubleClick(recurringElemets.increaseLarge.get(3));
		}
	}

	@Then("Change location of the Pre-serial Poll Delay to original and click APPLY")
	public void change_location_of_the_Pre_serial_Poll_Delay_to_original_and_click_APPLY() {
		 CommonMethods.doubleClick(recurringElemets.decreaseLarge.get(3));
	       CommonMethods.doubleClick(recurringElemets.decreaseLarge.get(3));
	       setUpPageElements.applyButton.click();
	       Assert.assertEquals(sliderValue, instrumentControlPageElements.PreSerialPollDelayValue.getAttribute("Name"));
	}
	/////////////////////////////////////
	
	@Then("Move Post-serial Poll Delay slider to the {int} ms value")
	public void move_Post_serial_Poll_Delay_slider_to_the_ms_value(Integer int1) {
		sliderValue = instrumentControlPageElements.PostSerialPollDelayValue.getAttribute("Name");

		for (int i = 0; i <= 2; i++) {
			recurringElemets.increaseLarge.get(4).click();
		}
	}

	@Then("Verify value is changed for Post-serial Poll Delay slider")
	public void verify_value_is_changed_for_Post_serial_Poll_Delay_slider() {
		Assert.assertNotEquals(sliderValue, instrumentControlPageElements.PostSerialPollDelayValue.getAttribute("Name"));
	}

	@Then("Move PostSerial Poll Delay slider to the {int} ms value")
	public void move_PostSerial_Poll_Delay_slider_to_the_ms_value(Integer int1) {
		for (int i = 0; i < 2; i++) {

			CommonMethods.doubleClick(recurringElemets.increaseLarge.get(4));
		}
	}

	@Then("Change location of the Post-serial Poll Delay slider to original and click APPLY")
	public void change_location_of_the_Post_serial_Poll_Delay_slider_to_original_and_click_APPLY() {
		CommonMethods.doubleClick(recurringElemets.decreaseLarge.get(4));
	       CommonMethods.doubleClick(recurringElemets.decreaseLarge.get(4));
	       setUpPageElements.applyButton.click();
	       Assert.assertEquals(sliderValue, instrumentControlPageElements.PostSerialPollDelayValue.getAttribute("Name"));
	}
	////////////////////////////

	@Then("Move Serial Poll Retries slider to the 30ms value")
	public void move_Serial_Poll_Retries_slider_to_the_30ms_value() {
		sliderValue = instrumentControlPageElements.SerialPollRetriesValue.getAttribute("Name");

		for (int i = 0; i <= 2; i++) {
			recurringElemets.increaseLarge.get(5).click();
		}
	}

	@Then("Verify value is changed for Serial Poll Retries slider")
	public void verify_value_is_changed_for_Serial_Poll_Retries_slider() {
		Assert.assertNotEquals(sliderValue, instrumentControlPageElements.SerialPollRetriesValue.getAttribute("Name"));
	}

	@Then("Move SerialPoll Retries slider to the 40ms value")
	public void move_SerialPoll_Retries_slider_to_the_40ms_value() {
		for (int i = 0; i < 2; i++) {

			CommonMethods.doubleClick(recurringElemets.increaseLarge.get(5));
		}
	}

	@Then("Change location of the Serial Poll Retries to original and click APPLY")
	public void change_location_of_the_Serial_Poll_Retries_to_original_and_click_APPLY() {
		CommonMethods.doubleClick(recurringElemets.decreaseLarge.get(5));
	       CommonMethods.doubleClick(recurringElemets.decreaseLarge.get(5));
	       setUpPageElements.applyButton.click();
	       Assert.assertEquals(sliderValue, instrumentControlPageElements.SerialPollRetriesValue.getAttribute("Name"));
}



	/**
	 * Feature2 end
	 */








	}







