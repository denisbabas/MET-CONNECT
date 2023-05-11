package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class InstrumentConfigurationPageElementsOne extends BaseClass {

	/**
	 * Beginning Elements from Instrument Configuration
	 */
	@FindBy(name = "4000(A), 4200(A), 47xx, 48xx(A) SRQ SDC")
	public WebElement fourThousand_SRQ_SDC_checkBox;

	@FindBy(name = "34401A SRQ SDC")
	public WebElement thirtyFourThousandFourHundredOne_SRQ_SDC_checkBox;

	@FindBy(name = "34420A SRQ SDC")
	public WebElement thirtyFourThousandFourHundredTwenty_SRQ_SDC_checkBox;

	@FindBy(name = "2000 SRQ SDC")
	public WebElement twoThousand_SRQ_SDC_checkBox;

	@FindBy(name = "2001/2002 SRQ SDC")
	public WebElement twoThousandOne_2woThousandTwo_SRQ_SDC_checkBox;

	// 8903 Model Suffix
	@FindBy(xpath = "//*[starts-with(@AutomationId, 'cmbo8903ModelSuffix:')]")
	public WebElement eightthousandNinehundredThreeDD;

	// 8903 Model Suffix value
	@FindBy(name = "A")
	public WebElement valueAfROM8903ModuleSuffix;

	// 8903 Model Suffix value
	@FindBy(name = "E")
	public WebElement valueEfROM8903ModuleSuffix;

	// 8903 Model Suffix value
	@FindBy(name = "B (Default)")
	public WebElement valueBfROM8903ModuleSuffix;

	@FindBy(id = "8901DataAvailTimeoutValue")
	public WebElement valueFrom8901abSlider;

	// elements from 525A/B section
	@FindBy(name = "525A IEEE-488")
	public WebElement _525AIEEE488checkBox;

	@FindBy(name = "CR")
	public WebElement CRValueFromTheTerminatorieee488DD;

	@FindBy(name = "LF")
	public WebElement LFValueFromTheTerminatorieee488DD;

	@FindBy(name = "EOI (Default)")
	public WebElement EOIValueFromTheTerminatorieee488DD;

	@FindBy(xpath = "//*[starts-with(@AutomationId, 'cmboTerminatorIEEEToRS232Converter:')]")
	public WebElement terminatorIEEE488toRS232ConverterDD;

	@FindBy(id = "PressureModuleTimeoutValue")
	public WebElement pressureModuleTimeoutValue;

	// elements from 9100 section
	@FindBy(name = "Near Cal Due SRQ")
	public WebElement nearCalDueSRQcheckBox;

	@FindBy(name = "Past Cal Due SRQ")
	public WebElement pastCalDueSRQcheckBox;

	@FindBy(xpath = "//*[starts-with(@AutomationId, 'cmbo9100Manufacturer:')]")
	public WebElement manufacturerDD;

	@FindBy(name = "Fluke")
	public WebElement flukeValueManufacturedDD;

	@FindBy(name = "Datron-Yokogawa")
	public WebElement datronYokogawaValueDD;

	@FindBy(id = "cmbo9100Manufacturer")
	public WebElement defaultManufacturer;

	/**
	 * End Elements from Instrument Configuration
	 */

	/**
	 * Beginning Elements from Instrument Configuration (Continued)
	 */

	@FindBy(name = "Instrument Configuration (Continued)")
	public WebElement InstrumentConfigurationContinuedTab;

	@FindBy(name = "Enable")
	public WebElement enableN5532AB;

	@FindBy(className = "Text")
	public List<WebElement> textFromAllIntBox; // list of the elements size is 8

	@FindBy(id = "504_FreqLow")
	public WebElement Freq504LowSlider;

	@FindBy(id = "IncreaseLarge") // list of the 9 elements
	public List<WebElement> sliderUp;

	@FindBy(id = "DecreaseLarge") // list of the 9 elements
	public List<WebElement> sliderDown;

	@FindBy(id = "504_FreqLowUnits")
	public WebElement comboBoxMeasurementFrequencyLow;

	@FindBy(id = "504_FreqHighUnits")
	public WebElement comboBoxMeasurementFrequencyHigh;

	@FindBy(className = "TextBlock")
	public WebElement textFromErrorWindow;

	@FindBy(className = "Button")
	public WebElement buttonFromErrorWindow;

	/**
	 * End Elements from Instrument Configuration (Continued)
	 */

	public InstrumentConfigurationPageElementsOne() {

		PageFactory.initElements(driver, this);
	}
}
