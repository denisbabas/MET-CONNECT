package stepDefinitions;



import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class ConfigureAgilentN1914Atest extends CommonMethods {

	@Then("Add Agilent {string}, assert {string} and verify Asset info button disabled")
	public void add_Agilent_assert_and_verify_Asset_info_button_disabled(String instrument, String FSC) {
		setUpPageElements.configureButton.click();
		instrumentsPageElements.addInstrumentButton.click();
	CommonMethods.sendKeys(instrumentsPageElements.filterTextField, instrument);
		instrumentsPageElements.addInstrumentButtonFromAddInstrument.click();
		
		
		Assert.assertEquals(FSC, instrumentsPageElements.FSCinfo.getAttribute("Name"));
		Assert.assertTrue(instrumentsPageElements.assetInfoButton.isDisplayed());
	}
	
	
	@Then("Add barcode {string} and Verify Asset Info button is enabled")
	public void add_barcode_and_Verify_Asset_Info_button_is_enabled(String barcode) {
	 CommonMethods.sendKeys(instrumentsPageElements.BurcodeNumberTextField, barcode);
	Assert.assertTrue(instrumentsPageElements.assetInfoButton.isEnabled());
	}

	@Then("Click Asset Info button and assert {string}")
	public void click_Asset_Info_button_and_assert(String barcode) {
	   CommonMethods.click(instrumentsPageElements.assetInfoButton);
	   Assert.assertEquals(barcode, instrumentsPageElements.assetNumberFromTheAssetInfoPage.getText().toString());
	   CommonMethods.click(instrumentsPageElements.cancelButtonFromTheAssetInfoPage);
	}

	@Then("Assert {string} is pre-selected and Verify Address {string} is pre-selected in the IEEE488 Adress")
	public void Assert_is_pre_selected_and_Verify_Address_is_pre_selected_in_the_IEEE488_Adress(String string, String string2){
	Assert.assertEquals(string, instrumentsPageElements.removeInterfaceOptionsDD.getAttribute("AutomationId"));
	Assert.assertEquals(string2, instrumentsPageElements.ieee488AdressDD.getAttribute("AutomationId"));
	}
	
	
	
	@Then("change IEEE488 Adress {string}  and verify adress is selected properly {string}")
	public void change_IEEE488_Adress_and_verify_adress_is_selected_properly(String string, String string2) {
	
		CommonMethods.clickThenSelectOptionFromDropdownByText(instrumentsPageElements.ieee488AdressDD, instrumentsPageElements.ieee488AdressDDOptions, string);
		Assert.assertEquals(string2, instrumentsPageElements.ieee488AdressDD.getAttribute("AutomationId"));
	}

  @Then("Select Option003 check box and verify is selected")
   public void select_Option003_check_box_and_verify_is_selected() {
	  CommonMethods.click(instrumentsPageElements.option003checkBox);
	  Assert.assertTrue(instrumentsPageElements.option003checkBox.isSelected());
  }
  
  
	
	@Then("Click Aliases Add button and Assert Instrument Alias {string}")
	public void click_Aliases_Add_button_and_Assert_Instrument_Alias(String string) {
		 instrumentsPageElements.addAliases.click();
	    Assert.assertEquals(string, instrumentsPageElements.aliasesLabel.getAttribute("Name"));
	}
	
	@Then("Enter {string} alias and Assert {string} and {string} are present")
	public void enter_alias_and_Assert_and_are_present(String string, String string2, String string3) {
		instrumentsPageElements.addAliases.click();
	 CommonMethods.sendKeys(instrumentsPageElements.textFieldInstrumentAlias, string );
	 instrumentsPageElements.okButton.click();
	
	 
	Assert.assertEquals(string2, instrumentsPageElements.testAlias.getAttribute("Name"));
	Assert.assertEquals(string3, instrumentsPageElements.EPMAlias.getAttribute("Name"));
	}
	
	@Then("Add Alias number {string} and assert text from info page {string}")
	public void add_Alias_number_and_assert_text_from_info_page(String string, String string2) {
	 instrumentsPageElements.addAliases.click();
	 CommonMethods.sendKeys(instrumentsPageElements.textFieldInstrumentAlias, string);
	 instrumentsPageElements.okButton.click();
	 Assert.assertEquals( string2, instrumentsPageElements.textFromInfoErrorAlias.getAttribute("Name"));
	 CommonMethods.click(instrumentsPageElements.okButtonFromInfoAlertPage);
		
		
	}
	
	

	@Then("Select {string} alias, click Delete and Assert only {string} is present")
	public void select_alias_click_Delete_and_Assert_only_is_present(String string, String string2) {
		
		instrumentsPageElements.testAlias.click();
		instrumentsPageElements.deleteAliases.click();
		CommonMethods.verifyElementSuccesfullyDeletedOrNotPresentOnThePage(instrumentsPageElements.testAlias);
	}
	@Then("discard all changes")
	public void discard_all_changes() {
	   CommonMethods.click(instrumentsPageElements.cancelButton);
	     
	}
	@Then("Verify Channel A and Channel B barcode fields are disabled")
	public void verify_Channel_A_and_Channel_B_barcode_fields_are_disabled() {
	    
	    
	}

	@Then("Verify Channel C and Channel D barcode fields are disabled")
	public void verify_Channel_C_and_Channel_D_barcode_fields_are_disabled() {
	    
	    
	}
	@Then("Verify Power Sensors Drop Down is enabled for Chanel A and Chanel B")
	public void verify_Power_Sensors_Drop_Down_is_enabled_for_Chanel_A_and_Chanel_B() {
		
	}

	@Then("Verify + buttons for all channels are enabled and - buttons for all channels are disabled")
	public void verify_buttons_for_all_channels_are_enabled_and_buttons_for_all_channels_are_disabled() {
	    
	    
	}

	@Then("Verify Barcode fields for all channels are disabled and Asset Info buttons are disabled for all channels Barcode fields")
	public void verify_Barcode_fields_for_all_channels_are_disabled_and_Asset_Info_buttons_are_disabled_for_all_channels_Barcode_fields() {
	    
	    
	}

	@Then("Select any power sensor for Channel A and Verify Barcode field for that sensor is enabled")
	public void select_any_power_sensor_for_Channel_A_and_Verify_Barcode_field_for_that_sensor_is_enabled() {
	    
	    
	}
	@Then("select USB Ports check box")
	public void select_USB_Ports_check_box() {
	    
	    
	}

	@Then("Enter barcode for that sensor and Verify corresponding Asset Info button is enabled")
	public void enter_barcode_for_that_sensor_and_Verify_corresponding_Asset_Info_button_is_enabled() {
	    
	    
	}

	@Then("Select all available power sensors for Channel A with their barcodes and Verify power sensor dropdowns are disabled for Channel B, C and D")
	public void select_all_available_power_sensors_for_Channel_A_with_their_barcodes_and_Verify_power_sensor_dropdowns_are_disabled_for_Channel_B_C_and_D() {
	    
	    
	}

	@Then("Delete one power sensor from Channel A by clicking \\{string} button and Verify power sensor dropdowns are enabled for all channels")
	public void delete_one_power_sensor_from_Channel_A_by_clicking_button_and_Verify_power_sensor_dropdowns_are_enabled_for_all_channels() {
	    
	    
	}

	@Then("Click Help button and verify help page is opened assert header \\{string} and click ok button")
	public void click_Help_button_and_verify_help_page_is_opened_assert_header_and_click_ok_button() {
	    
	    
	}

	@Then("Click ok button")
	public void click_ok_button() {
	    
	    
	}

	@Then("Verify {string} is present on the instrument page")
	public void verify_is_present_on_the_instrument_page(String string) {
	    
	    
	}

	@Then("Click on the instrument and click Delete button and verify instrument succesfully deleted")
	public void click_on_the_instrument_and_click_Delete_button_and_verify_instrument_succesfully_deleted() {
	    
	    
	}





}
