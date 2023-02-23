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
		
		
		public LoginPageElements() {
			
		    PageFactory.initElements(driver, this);
			}
	}
