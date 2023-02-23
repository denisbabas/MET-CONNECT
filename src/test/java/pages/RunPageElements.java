package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class RunPageElements extends BaseClass {

	//not working!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	@FindBy (xpath = "//*[text()='RUN']")
	public WebElement testButton;
	
	@FindBy (id = "Play")
	public WebElement launchProcedure;
	
	@FindBy (id = "ItemText")
	public WebElement workOrderNumberTextField;
	
	@FindBy (name = "OK")
	public WebElement okButton;
	
	@FindBy (name = "Cancel")
	public WebElement cancelButton;
	
	@FindBy (className = "TextBox")
	public List <WebElement> textField;
						
	@FindBy (className = "TextBox")
	public WebElement textField2;
						
	
	
	//input[@name='myName']
//	@FindBy (xpath = "//*[text()='RUN']")
//	public WebElement testButton;
//	
//	@FindBy (xpath = "//*[text()='RUN']")
//	public WebElement testButton;
//	
//	
//	@FindBy (xpath = "//*[text()='RUN']")
//	public WebElement testButton;
//	
//	@FindBy (xpath = "//*[text()='RUN']")                ////*[contains(text(),  'Humidity')]"
//	public WebElement testButton;							
//														//pane[@name='Humidity']/following-sibling::edit[@className='TextBoX']"));
//	@FindBy (xpath = "//*[text()='RUN']")
//	public WebElement testButton;
	
	
	//button[contains(text()
	//*[@id='elementId'][2]"
	//[@id='myElement'][2]
	
	
public RunPageElements() {
		
	    PageFactory.initElements(driver, this);
		}
}
