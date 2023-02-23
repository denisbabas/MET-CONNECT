package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.CommonMethods;
import utils.ConfigsReader;

public class LoginScreenTestDefinitions extends CommonMethods{

	
	@Given("Open METCAL Runtime and entel valid login and password")
	public void open_METCAL_Runtime_and_entel_valid_login_and_password() {
		
	    sendKeys(loginPageElements.loginField, ConfigsReader.getPropValue("username"));
	 
	    sendKeys(loginPageElements.passwordField, ConfigsReader.getPropValue("password"));
	}

	@Then("Click on the LogIn button")
	public void click_on_the_LogIn_button() {
		
	    CommonMethods.click(loginPageElements.logInButton);
	}

}
