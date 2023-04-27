package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class InstrumentsPageElements extends BaseClass {
	
	@FindBy (name = "Add")
	public WebElement addInstrumentButton;
	
	@FindBy (className = "TextBox")
	public WebElement filterTextField;

	//This element from Add Instrument Window
	@FindBy (id = "btnAdd")
	public WebElement addInstrumentButtonFromAddInstrument;
	
	@FindBy (name  = "IEEE, EPM, SCPI")
	public WebElement FSCinfo;
	
	@FindBy (id = "assetNumber")
	public WebElement BurcodeNumberTextField;
	
	@FindBy(id = "assetNumBtn")
	public WebElement assetInfoButton;
	
	//This is element from the AssetInformation window
	@FindBy(id =  "assetNum")
	public WebElement assetNumberFromTheAssetInfoPage;
	
	//This is element from the AssetInformation window
	@FindBy(id =  "Cancel")
	public WebElement cancelButtonFromTheAssetInfoPage;
	
	@FindBy(name = "Option 003")
	public WebElement option003checkBox;
	
	@FindBy(name = "Option 103, 105, 106, 108, 109, or 167")
	public WebElement optionOption103and105and106and108and109and167checkBox;
	
	@FindBy(name = "Cancel")
	public WebElement cancelButton;
	
	
	@FindBy(xpath = "//*[starts-with(@AutomationId, 'RemoteInterface:')]")
	public WebElement removeInterfaceOptionsDD;
	
	
	@FindBy (xpath = "//*[starts-with(@AutomationId, 'IEEEAddress')]")
	public WebElement ieee488AdressDD;
	
	@FindBy (name = "Test77")
	public WebElement testAlias;
	
	@FindBy (name = "EPM")
	public WebElement EPMAlias;
	
	
	@FindBy(id = "IEEEAddress")
	public List<WebElement> ieee488AdressDDOptions;

	
	//this element from the Instrument Alias windo
	@FindBy (name = "Instrument Alias")
	public WebElement aliasesLabel;
	
	@FindBy (name = "Add")
	public WebElement addAliases;
	
	@FindBy (name = "Delete")
	public WebElement deleteAliases;
	
	
	//this element from the Instrument Alias window
	@FindBy(id = "ItemText")
	public WebElement textFieldInstrumentAlias;
	
	//this element from the Instrument Alias window
	@FindBy(id = "Ok")
	public WebElement okButton;
	
	//this element from the Instrument Alias window
	@FindBy(id = "Cancel")
	public WebElement cancelAliasButton;
	
	//this element from the Instrument Alias window
	@FindBy(className = "TextBlock")
	public WebElement textFromInfoErrorAlias;
	
	//this element from the Instrument Alias 
	@FindBy(id = "btnButton1")
	public WebElement okButtonFromInfoAlertPage;
	

	@FindBy(xpath= "//*[@ClassName='TextBlock']")
	public List<WebElement>listAliases;
	
	
	@FindBy (id = "assetNumber")
	public List<WebElement> BurcodeNumberTextFieldList;
	
	

	@FindBy (id = "cmboModGroupAsset1:None")
	public List<WebElement>powerSensorListDD ;

	@FindBy(name = "Option 103, 105, 106, 108, 109, or 167")
	public WebElement USBportCheckBox;
	
	@FindBy(name = "+")
	public List<WebElement> plusButton;
	
	@FindBy(name = "-")
	public List<WebElement> minusButton;
	
	

	@FindBy (id = "assetNumBtn")
	public List<WebElement>assetNumBtn;
	
	
	@FindBy(name = "Agilent E4412A")
	public WebElement AgilentE4412A;
	                 
	@FindBy (xpath = "//*[starts-with(@Name, 'Agilent E930')]")
	public WebElement AgilentList;
	
	
	@FindBy (name = "Help")
	public WebElement helpButton;
	
	//this element from the "Help" page
	@FindBy (name = "System Instrument Dialog")
	public WebElement systemInstrumentDialogHeader;
	
	
	@FindBy (name = "Close")
	public WebElement closeButton;
	
	@FindBy (id = "lstConfiguredInstruments")
	public List<WebElement> listConfiguredInstruments;
	
	@FindBy(name= "OK")
	public WebElement okButtonMain;
	
	
	//this element from the "Confirm" deleting page
	@FindBy(name= "_Yes")
	public WebElement yesButton;
	
	public InstrumentsPageElements() {
		
	    PageFactory.initElements(driver, this);
		}
}
