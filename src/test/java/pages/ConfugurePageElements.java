package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class ConfugurePageElements extends BaseClass {


	@FindBy (name = "Instrument Configuration")
	public WebElement instrimentConfigurationMenu;
	
	@FindBy (name = "Instrument Configuration (Continued)")
	public WebElement instrimentConfigurationMenuContinued
	;
	
	public ConfugurePageElements() {
		
	    PageFactory.initElements(driver, this);
		}
}
