package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.CommonMethods;
import utils.ConfigsReader;

public class LoginScreenTestDefinitions extends CommonMethods{

	@Given("Open METCAL Runtime and enter valid login and password for MC user")
	public void open_METCAL_Runtime_and_enter_valid_login_and_password_for_MC_user() {
		
	    sendKeys(loginPageElements.loginField, ConfigsReader.getPropValue("usernameMC"));
	 
	    sendKeys(loginPageElements.passwordField, ConfigsReader.getPropValue("passwordMC"));
	}

	@Then("Click on the LogIn button")
	public void click_on_the_LogIn_button() {
		
	    CommonMethods.click(loginPageElements.logInButton);
	}
	@Then("verify that for MC user {string} and {string} tabs is enabled")
	public void verify_that_for_MC_user_and_tabs_is_enabled(String run, String configure) {
		
		Assert.assertEquals(run, setupMainPageElements.textFromRunTab.getAttribute("Name"));
		Assert.assertEquals(configure, setupMainPageElements.textFromConfugureTab.getAttribute("Name"));
	}
	
	@Given("Open METCAL Runtime and enter valid login and password for Admin user")
	public void open_METCAL_Runtime_and_enter_valid_login_and_password_for_Admin_user() {

	    sendKeys(loginPageElements.loginField, ConfigsReader.getPropValue("usernameAdmin"));
	 
	    sendKeys(loginPageElements.passwordField, ConfigsReader.getPropValue("passwordAdmin"));
	}

	@Then("verify that for MC user RUN and CONFIGURE tabs is disabled")
	public void verify_that_for_MC_user_RUN_and_CONFIGURE_tabs_is_disabled() {
		String element1 = null;
		String element2 = null;
		
        try {
            element1 =  setupMainPageElements.textFromRunTab.getAttribute("Name");
            element2 = setupMainPageElements.textFromConfugureTab.getAttribute("Name");
        } catch (Exception e) {
           
        }
        Assert.assertNull(element1);
        Assert.assertNull(element2);
}
	
	
	
	

}
