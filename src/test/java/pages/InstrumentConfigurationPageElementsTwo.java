package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class InstrumentConfigurationPageElementsTwo extends BaseClass {
	
	
	@FindBy(name = "Near Cal Due SRQ")
	public WebElement nearCalDueSRQCkeckBox;
	
	@FindBy(name = "Past Cal Due SRQ")
	public WebElement pastCalDueSRQCkeckBox;
	
	@FindBy(xpath = "//*[starts-with(@AutomationId, 'cmbo9500Manufacturer:')]")
	public WebElement ManufacturerDD;
	
	@FindBy(name = "Fluke")
	public WebElement flukeValueManufacturerDD;
	
	@FindBy(id = "cmbo9500Manufacturer")
	public WebElement blankValueManufacturerDD;
	
	@FindBy(name = "Enable")
	public List <WebElement> enableCheckBox;
	
	@FindBy(id = "cmbo504FreqLowUnits:kHz")
	public WebElement cmbo504FreqLowUnitskHz;

	@FindBy(id = "cmbo504FreqHighUnits:GHz")
	public WebElement cmbo504FreqHighUnitsGHz;
	
	@FindBy(id = "504_FreqLowValue")
	public WebElement freq504LowValue;
	
	@FindBy(id = "504_FreqHighValue")
	public WebElement freg504HighValue;
	
	@FindBy(id = "chk518Enable")
	public WebElement Enable518checkBox;
	
	@FindBy(id = "cmbo518FreqLowUnits:MHz")
	public WebElement cmbo518FreqLowUnitsMHz;

	@FindBy(id = "cmbo518FreqHighUnits:GHz")
	public WebElement cmbo518FreqHighUnitsGHz;
	
	@FindBy(id = "518_FreqLowValue")
	public WebElement freq518LowValue;
	
	@FindBy(id = "518_FreqHighValue")
	public WebElement freq518HighValue;
	
	
	@FindBy(id = "cmbo526FreqLowUnits:MHz")
	public WebElement cmbo526FreqLowUnitsMHz;

	@FindBy(id = "cmbo526FreqHighUnits:GHz")
	public WebElement cmbo526FreqHighUnitsGHz;
	
	@FindBy(id = "526_FreqLowValue")
	public WebElement freq526LowValue;
	
	@FindBy(id = "5526_FreqHighValue")
	public WebElement freq526HighValue;
	
	@FindBy(id = "cmbo550FreqLowUnits:MHz")
	public WebElement cmbo550FreqLowUnitsMHz;

	@FindBy(id = "cmbo550FreqHighUnits:GHz")
	public WebElement cmbo550FreqHighUnitsGHz;
	
	@FindBy(id = "550_FreqLowValue")
	public WebElement freq550LowValue;
	
	@FindBy(id = "550_FreqHighValue")
	public WebElement freq550HighValue;
	
	@FindBy(xpath = "//*[starts-with(@Name, 'Invalid setting on')]")
	public WebElement textFromError;
	
 
	public InstrumentConfigurationPageElementsTwo() {

		PageFactory.initElements(driver, this);
	}
}