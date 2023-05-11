package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigsReader;

public class InvalidCredentialsSteps extends CommonMethods {
	
	@Given("Open METCAL Runtime and enter invalid {string}")
	public void open_METCAL_Runtime_and_enter_invalid(String logIn) {
	   CommonMethods.sendKeys(loginPageElements.loginField, logIn);
	}

	@When("Enter valid password")
	public void Enter_valid_password() {
		sendKeys(loginPageElements.passwordField, ConfigsReader.getPropValue("passwordMC"));
	}
	
	@Given("Open METCAL Runtime and enter valid login")
	public void open_METCAL_Runtime_and_enter_valid_login() {
		sendKeys(loginPageElements.loginField, ConfigsReader.getPropValue("usernameMC"));
	}
	
	@When("Enter invalid {string}")
	public void enter_invalid(String password) {
		 CommonMethods.sendKeys(loginPageElements.passwordField, password);
	}
	@Then("Verify Invalid setting {string} message is displayed")
	public void verify_Invalid_setting_message_is_displayed(String string) {
		Assert.assertEquals( string, loginPageElements.textFromErrorWindow.getAttribute("Name"));
		
	
	}
}
