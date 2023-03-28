package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class InstrumentConfigurationPageElements extends BaseClass {
	
	/**
	 * Beginning Elements from Instrument Configuration 
	 */
	//@FindBy (name = "")
	//public WebElement InstrumentConfiguration;
	
	/**
	 * Beginning Elements from Instrument Configuration
	 */
	
	
	
	/**
	 * Beginning Elements from Instrument Configuration (Continued)
	 */

	@FindBy (name = "Instrument Configuration (Continued)")
	public WebElement InstrumentConfigurationContinuedTab;
	
	@FindBy (name = "Enable")
	public WebElement enableN5532AB;
		     
	@FindBy (className = "Text")
	public List<WebElement> textFromAllIntBox; // list of the elements size is 8 
	
	@FindBy (id = "504_FreqLow")
	public WebElement Freq504LowSlider;
	
	@FindBy (id ="IncreaseLarge")// list of the 9 elements
	public List<WebElement> sliderUp;
	
	
	@FindBy (id ="DecreaseLarge")// list of the 9 elements
	public List<WebElement> sliderDown;
	

	
	@FindBy (id = "504_FreqLowUnits")
	public WebElement comboBoxMeasurementFrequencyLow;

	@FindBy (id = "504_FreqHighUnits")
	public WebElement comboBoxMeasurementFrequencyHigh;
	

	@FindBy (className = "TextBlock")
	public WebElement textFromErrorWindow;
	
	
	@FindBy (className = "Button")
	public WebElement buttonFromErrorWindow;
	
	/**
	 * End Elements from Instrument Configuration (Continued)
	 */
	
	
	
public InstrumentConfigurationPageElements() {
		
	    PageFactory.initElements(driver, this);
		}
}

