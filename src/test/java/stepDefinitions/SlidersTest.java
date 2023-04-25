package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class SlidersTest extends CommonMethods{
	
     String FiveHundredForFreguencyLowBefore; 
     String FiveHundredForFreguencyHighBefore;
     String FiveHundredForFreguencyLowAfter;
     String FiveHundredForFreguencyHighAfter;
	
	@When("Select Configure tab")
	public void select_Configure_tab() {
		CommonMethods.click(setUpPageElements.configureButton);
	}
	@When("Select Instrument Configuration section")
	public void select_Instrument_Configuration_section() {
	   CommonMethods.click(confugurePageElements.instrimentConfigurationMenu);
	}
	@Then("Select Instrument Configuration\\(Continued) tab")
	public void select_Instrument_Configuration_Continued_tab() {
	CommonMethods.click(instrumentConfigurationPageElements.InstrumentConfigurationContinuedTab);
	}
	
	
	
	@Then("Check Enable checkbox and get values from {int} Frequency Low and {int} Frequency High in section N5532A\\/B")
	public void check_Enable_checkbox_and_get_values_from_Frequency_Low_and_Frequency_High_in_section_N5532A_B(Integer int1, Integer int2) throws Throwable {

		CommonMethods.click(instrumentConfigurationPageElements.enableN5532AB);
		
		
		WebElement Low = instrumentConfigurationPageElements.textFromAllIntBox.get(0);
		String text1 = Low.getAttribute("Name");
		
		FiveHundredForFreguencyLowBefore = text1;
		WebElement High = instrumentConfigurationPageElements.textFromAllIntBox.get(1);
		String text2 = High.getAttribute("Name");
		FiveHundredForFreguencyHighBefore =text2;
	}
	
	@Then("Verify Five Hundred For Freguency dropdowns and sliders are enabled.")
	public void verify_Five_Hundred_For_Freguency_dropdowns_and_sliders_are_enabled() {
		
		Assert.assertTrue(instrumentConfigurationPageElements.comboBoxMeasurementFrequencyHigh.isEnabled());
		Assert.assertTrue(instrumentConfigurationPageElements.comboBoxMeasurementFrequencyLow.isEnabled());
	
		Assert.assertTrue(instrumentConfigurationPageElements.sliderUp.get(0).isEnabled());
		Assert.assertTrue(instrumentConfigurationPageElements.sliderUp.get(1).isEnabled());
	}
	@Then("Drag Five Hundred For Frequency Low slider and drop it somewhere at the middle of its line.")
	public void drag_Five_Hundred_For_Frequency_Low_slider_and_drop_it_somewhere_at_the_middle_of_its_line() {
      CommonMethods.click((instrumentConfigurationPageElements.sliderUp).get(0));
      
	}
	@Then("Verify value in the box low got changed.")
	public void verify_value_in_the_box_low_got_changed() {
		WebElement Low = instrumentConfigurationPageElements.textFromAllIntBox.get(0);
		String text = Low.getAttribute("Name");
		FiveHundredForFreguencyLowAfter = text;
	    Assert.assertNotEquals(FiveHundredForFreguencyLowAfter , FiveHundredForFreguencyLowBefore);
	}

	@Then("Drag Five Hundred For Frequency High slider and drop it somewhere at the middle of its line.")
	public void drag_Five_Hundred_For_Frequency_High_slider_and_drop_it_somewhere_at_the_middle_of_its_line() {
		
		 CommonMethods.click((instrumentConfigurationPageElements.sliderUp).get(1));
	}
	
	@Then("Verify value in the box high got changed")
	public void verify_value_in_the_box_high_got_changed() {
		WebElement high = instrumentConfigurationPageElements.textFromAllIntBox.get(1);
		String text = high.getAttribute("Name");
		FiveHundredForFreguencyHighAfter = text;
		Assert.assertNotEquals(FiveHundredForFreguencyHighAfter ,FiveHundredForFreguencyHighBefore);
	}
	
	@Then("Uncheck Enabled check box and verify value is restored as original value")
	public void uncheck_Enabled_check_box_and_verify_value_is_restored_as_original_value() throws Throwable {
		CommonMethods.click(instrumentConfigurationPageElements.enableN5532AB);
		CommonMethods.click(instrumentConfigurationPageElements.enableN5532AB);
		WebElement Low = instrumentConfigurationPageElements.textFromAllIntBox.get(0);
		String text1 = Low.getAttribute("Name");
		FiveHundredForFreguencyLowAfter = text1;
		Assert.assertEquals(FiveHundredForFreguencyLowAfter , FiveHundredForFreguencyLowBefore);
	    WebElement high = instrumentConfigurationPageElements.textFromAllIntBox.get(1);
		String text2 = high.getAttribute("Name");
		FiveHundredForFreguencyHighAfter = text2;
		Assert.assertEquals(FiveHundredForFreguencyHighAfter ,FiveHundredForFreguencyHighBefore);
		
	}
	
	@Then("Make “{int} Frequency High” value box red and click Apply button.")
	public void make_Frequency_High_value_box_red_and_click_Apply_button(Integer int1) {
		
		 CommonMethods.click((instrumentConfigurationPageElements.sliderUp).get(1));
		setUpPageElements.applyButton.click();
	}
		
	@Then("Verify Invalid setting {string} message is displayed")
	public void verify_Invalid_setting_message_is_displayed(String string) {
		Assert.assertTrue(instrumentConfigurationPageElements.textFromErrorWindow.getAttribute("Name").contains(string));
	
	}
	@Then("Click OK on the error message, restore original value, verify values")
	public void click_OK_on_the_error_message_restore_original_value_verify_values() {
		CommonMethods.click(setUpPageElements.okButton);
		CommonMethods.click(instrumentConfigurationPageElements.enableN5532AB);
	
		CommonMethods.click(instrumentConfigurationPageElements.enableN5532AB);
		
		WebElement Low = instrumentConfigurationPageElements.textFromAllIntBox.get(0);
		String text1 = Low.getAttribute("Name");
		FiveHundredForFreguencyLowAfter = text1;
		Assert.assertEquals(FiveHundredForFreguencyLowAfter , FiveHundredForFreguencyLowBefore);
	    WebElement high = instrumentConfigurationPageElements.textFromAllIntBox.get(1);
		String text2 = high.getAttribute("Name");
		FiveHundredForFreguencyHighAfter = text2;
		Assert.assertEquals(FiveHundredForFreguencyHighAfter ,FiveHundredForFreguencyHighBefore);
		CommonMethods.click(instrumentConfigurationPageElements.enableN5532AB);
	}

	@Then("Verify changes are saved with no error.")
	public void verify_changes_are_saved_with_no_error() throws Throwable {
		Assert.assertFalse(CommonMethods.isElementEnabled(setUpPageElements.applyButton));
	
	}


	

}
