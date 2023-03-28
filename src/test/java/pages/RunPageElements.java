package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class RunPageElements extends BaseClass {
	
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
						
	
/**
 * Elements from Post-Prompt
 */
	
	@FindBy (id = "PromptText")
	public WebElement notesTextField;
	
	
	@FindBy (className = "ComboBox")
	public WebElement assFoundAssLeftDD;
	
	/**
	 * END Elements from Post-Prompt
	 */
	
	

	@FindBy (className = "TextBlock")
	public WebElement textFromInfoPage;


	@FindBy (name = "No")
	public WebElement noButton;
	
	
public RunPageElements() {
		
	    PageFactory.initElements(driver, this);
		}
}
