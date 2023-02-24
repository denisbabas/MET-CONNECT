package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class SetupMainPageElements extends BaseClass{
	
	
	
	@FindBy (name = "CONFIGURE")
	public WebElement textFromConfugureTab ;
	
	@FindBy (name = "RUN")
	public WebElement textFromRunTab;
	

public SetupMainPageElements() {
		
	    PageFactory.initElements(driver, this);
		}
}
