package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class RecurringElemets extends BaseClass {
	
	@FindBy (className = "ComboBox")
	public List<WebElement>  comboBox;
	
	@FindBy (className = "ListBoxItem")
	public List<WebElement>  listBoxItem;
	
	@FindBy (className = "Thumb")
	public List<WebElement>  thumb;
	
	@FindBy (id = "IncreaseLarge")
	public List<WebElement>  increaseLarge;
	
	@FindBy (id= "DecreaseLarge")
	public List<WebElement> decreaseLarge;
	
	@FindBy (id = "PART_LineDownButton")
	public WebElement  DDSliderDown;
	
	@FindBy (id = "PART_LineUpButton")
	public WebElement  DDSliderUP;
	
	@FindBy (id = "PageDown")
	public WebElement  pageDown;
	
	@FindBy (id = "PageUp")
	public WebElement  pageUp;
	
	
	public	RecurringElemets() {
		
		PageFactory.initElements(driver, this);
			}
	}
