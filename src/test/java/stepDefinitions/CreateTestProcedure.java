package stepDefinitions;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import utils.CommonMethods;
import utils.ConfigsReader;

public class CreateTestProcedure extends CommonMethods {
	@Then("move slider to simulation mode")
	public void move_slider_to_simulation_mode() throws InterruptedException {
		
		if(setUpPageElements.live.getAttribute("Name").equals("LIVE")) {
		CommonMethods.click(setUpPageElements.runModeSlider);}
		else {
			System.out.println("SIMULATION MODE");
		}
		
	   }

	@Then("click on the Select DUT button")
	public void click_on_the_Select_DUT_button() throws Throwable {
		CommonMethods.click(setUpPageElements.selectAssetViaUIButton);
	   
	}
	@Then("verify the {string}")
	public void verify_the(String windowName) {
		
		String a = setUpPageElements.assetNumberWindHeader.getAttribute("Name");
		Assert.assertEquals(windowName, a);
		
	}
	@Then("enter the {string} and click ok button")
	public void enter_the_and_click_ok_button(String AssetNumber) throws Throwable {
		sendKeys(setUpPageElements.assetNumberField, AssetNumber +" " + CommonMethods.getTimeStamp());
	
		Thread.sleep(3000);
		setUpPageElements.okButton.click();
		
	}

	@Then("click save button")
	public void click_save_button() {
		
	 click(setUpPageElements.saveButton);
	  
	}
	
	@Then("select {string} from the PC")
	public void select_from_the_PC(String pxe)  throws Throwable {
		click(setUpPageElements.selectPXT);
		
	
		selectProcedureExecutablePageElements.pathField.sendKeys(ConfigsReader.getPropValue("folderWithPXE"));
		
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);

		int count = selectProcedureExecutablePageElements.LISTs.size();
		System.out.println("Found " + count + " elements in the list");
	
		for (int i = 0; i < count; i++) {
			
	        WebElement element = selectProcedureExecutablePageElements.LISTs.get(i);
	       
	        System.out.println("Checking element " + i + ": " + element.getAttribute("Name"));
	  
	     
	        	if (element.getAttribute("Name").equals(pxe)) {
	           
	        
	          System.out.println("Found matching element: " + element.getAttribute("Name"));
	            element.click();
	          
	            break;
	        }
	    }CommonMethods.click(selectProcedureExecutablePageElements.openButton);
	    
	    
	   
 
	}

	@Then("navigate to the Run window and click run button")
	public void navigate_to_the_Run_window_and_click_run_button() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		runPageElements.launchProcedure.click();
		}
	@Then("enter {string} click ok button")
	public void enter_click_ok_button(String workOrderNum)  {
	     
	    CommonMethods.sendKeys(runPageElements.workOrderNumberTextField, workOrderNum + " " + CommonMethods.getTimeStamp());
	    CommonMethods.click(runPageElements.okButton);
	  
	}

	@Then("enter {string} and {string} and click ok button")
	public void enter_and_and_click_ok_button(String temperature, String humidity) throws Throwable {
		
		for (WebElement textField : runPageElements.textField) {
			 
			
			 
			 textField.click();
			 textField.sendKeys(humidity);
			 
			 Robot rb = new Robot();
			 rb.keyPress(KeyEvent.VK_TAB);
			 
		 }
	     
		CommonMethods.sendKeys(runPageElements.textField2, temperature);
			CommonMethods.click(runPageElements.okButton);
	}

	@Then("click advance button on Test information1 screen")
	public void click_advance_button_on_Test_information1_screen() {
	
	}

	@Then("click advance button on Test information2 screen")
	public void click_advance_button_on_Test_information2_screen() {
	    
	}

	@Then("click advance button on Test information3 screen")
	public void click_advance_button_on_Test_information3_screen() {
	     
	    
	}

	@Then("click advance button on Test information4 screen")
	public void click_advance_button_on_Test_information4_screen() {
	     

	}

	@Then("click advance button on Test information5 screen")
	public void click_advance_button_on_Test_information5_screen() {
	   
	}

	@Then("click advance button on Test information6 screen")
	public void click_advance_button_on_Test_information6_screen() {
	     
	 
	}

	@Then("click advance button on Test information7 screen")
	public void click_advance_button_on_Test_information7_screen() {
	     
	    
	}

	@Then("click advance button on Test information8 screen")
	public void click_advance_button_on_Test_information8_screen() {
	     
	    
	}

	@Then("click ok button on the Please Remove All connection screen")
	public void click_ok_button_on_the_Please_Remove_All_connection_screen() {
	     
	    	}




}
