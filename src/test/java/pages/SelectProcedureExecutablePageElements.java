package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import testBase.BaseClass;

public class SelectProcedureExecutablePageElements extends BaseClass{
	
	@FindBy (xpath ="//*[@ControlType='ControlType.ListItem']")
	public List<WebElement> LISTs;
	
	
	
	@FindBy (name = "Line down")
	public WebElement sliderDownBottom;
	
	@FindBy (name = "FolderBandModuleInner")
	public WebElement sliderUpBottom;
	
	@FindBy (name = "ScrollBar")
	public WebElement maxScreenButton;
	
	@FindBy (name = "Open")
	public WebElement openButton;
	
	
	@FindBy (id = "1001")
	public WebElement pathField;
	
	
	
	
	
	
	

public SelectProcedureExecutablePageElements() {
		
	    PageFactory.initElements(driver, this);
		}
}