package stepDefinitions;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Then;
import utils.CommonMethods;


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
		
		
		Assert.assertEquals(windowName, setUpPageElements.assetNumberWindHeader.getAttribute("Name"));
		
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

		int count = selectProcedureExecutablePageElements.LISTs.size();
		System.out.println("Found " + count + " elements in the list");
	
		for (int i = 0; i < count; i++) {
			
	        WebElement element = selectProcedureExecutablePageElements.LISTs.get(i);
	       
	        System.out.println("Checking element " + i + ": " + element.getAttribute("Name"));
	  
	     
	        	if (element.getAttribute("Name").equals(pxe)) {
	        		 System.out.println("Found matching element: " + element.getAttribute("Name"));
	        		Actions act = new Actions(driver);
	        		act.doubleClick(element).perform();
	            break;} }
 
	}

	@Then("navigate to the Run window and click run button")
	public void navigate_to_the_Run_window_and_click_run_button() throws AWTException{
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_TAB);
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
			 
			 textField.sendKeys(humidity);
			 
			 Robot rb = new Robot();
			 rb.keyPress(KeyEvent.VK_TAB);
			 
		 }
	     
		CommonMethods.sendKeys(runPageElements.textField2, temperature);
			CommonMethods.click(runPageElements.okButton);
			CommonMethods.click(runPageElements.okButton);
	}
	@Then("on the Post-Prompt screen select {string} dropdown and enter {string} to the textbox")
	public void on_the_Post_Prompt_screen_select_dropdown_and_enter_to_the_textbox(String asFoundAsLeft, String notes) {
		
		runPageElements.assFoundAssLeftDD.click();
		runPageElements.assFoundAssLeftDD.findElement(By.name(asFoundAsLeft)).click(); //DD SELECT!!!
		CommonMethods.sendKeys(runPageElements.notesTextField, notes);
		 CommonMethods.click(runPageElements.okButton);
	}
	
	@Then("get text from the MetCal Information and asssert {string}")
	public void get_text_from_the_Met_call_Information_and_asssert(String text  ) {
	System.out.println(runPageElements.textFromInfoPage.getAttribute("Name") + "this is text");
		Assert.assertTrue(runPageElements.textFromInfoPage.getAttribute("Name").contains(text));
	
		
				


CommonMethods.click(runPageElements.noButton);
	}




}
