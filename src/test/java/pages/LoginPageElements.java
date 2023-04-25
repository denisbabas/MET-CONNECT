package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class LoginPageElements extends BaseClass {
	
	/**
	 * Beginning Elements from LoginPage
	 */

		@FindBy (className = "TextBox")
		public WebElement loginField;
		                
		@FindBy(className  = "PasswordBox")
		public WebElement passwordField;
		
		@FindBy (name ="Log In")
		public WebElement logInButton;
		
		@FindBy (id = "btnHelp")
		public WebElement helpButton;
		
		@FindBy (name = "MET/CONNECT Overview")
		public WebElement headerFromHelpPage;
		
		@FindBy (name = "Cancel")
		public WebElement cancelButton;
		
		@FindBy(name = "MET/CAL™")
		public WebElement headerFromLoginPage;
		
		public LoginPageElements() {
			
		    PageFactory.initElements(driver, this);
			}
	}
