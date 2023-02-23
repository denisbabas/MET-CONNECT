package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class SetUpPageElements extends BaseClass{
	
	@FindBy (id  = "ToggleSimulationMode")
	public WebElement runModeSlider;
	
	@FindBy (id = "tbMode")
	public WebElement tbModeInfo;
	
	@FindBy (id  = "SelectAssetViaUI")
	public WebElement selectAssetViaUIButton;
	
	@FindBy (id  = "tbMode")
	public WebElement live;
	
	@FindBy (className = "TextBlock")
	public WebElement assetNumberWindHeader;
	
	@FindBy(className = "TextBox")
	public WebElement assetNumberField;
	
	@FindBy (name = "OK")
	public WebElement okButton;
	
	@FindBy (name ="Save")
	public WebElement saveButton;
	
	@FindBy(id = "BtnSelectProcedureDropDown")
	public WebElement selectPXT;
	
	
	public SetUpPageElements() {
		
	    PageFactory.initElements(driver, this);
		}
}



