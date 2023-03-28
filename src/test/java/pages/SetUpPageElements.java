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
	
	
	@FindBy (name =  "SETUP")
	public WebElement setupButton;
	
	@FindBy (name = "CONFIGURE")
	public WebElement configureButton;
	
	@FindBy(id = "BtnSelectProcedureDropDown")
	public WebElement selectPXT;
	
	@FindBy (name = "APPLY")
	public WebElement applyButton;

	@FindBy (name = "CONFIGURE")
	public WebElement textFromConfugureTab ;
	
	@FindBy (name = "RUN")
	public WebElement textFromRunTab;
	
	
	public SetUpPageElements() {
		
	    PageFactory.initElements(driver, this);
		}
}



