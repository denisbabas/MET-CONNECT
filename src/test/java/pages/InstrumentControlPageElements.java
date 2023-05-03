package pages;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class InstrumentControlPageElements extends BaseClass{


	
	
	/**
	 * Beginning Elements from Instrument Control
	 */

	@FindBy (name = "None (Default)")
	public WebElement DefaultRS232Port;
	
	@FindBy (id = "cmboDefaultRS232Port:COM2")
	public WebElement DefaultRS232PortCom2Value;
	
	
	@FindBy (id = "cmboIEEENumBoards:None (Default)")
	public WebElement IEEE488NumBoards; 
	
	@FindBy (id = 	"cmboIEEEPort0SRQ:Prompt (Default)")
	public WebElement IEEE488Port0SRQ;
	
	@FindBy (id = 	"cmboIEEEPort1SRQ:Prompt (Default)")
	public WebElement IEEE488Port1SRQ;
	
	@FindBy (xpath = "//*[starts-with(@Name, 'COM')]")
	public List<WebElement> ADefaultRS232PortList;
	
	///
	// IEEE-488 Num. Boards values
	@FindBy (name = "None (Default)")
	public WebElement defaultValueIEEE488NumBoards;
	
	@FindBy (name = "1")
	public WebElement oneValueIEEE488NumBoards;
	
	@FindBy (name = "2")
	public WebElement twoValueIEEE488NumBoards;

	
	//IEEE-488 Port 0 SRQ values
	@FindBy (name = "Prompt (Default)")
	public WebElement defaultValueForEEE488Port0SRQ;
	
	@FindBy (name = "Clear")
	public WebElement clearValueForEEE488Port0SRQ;
	
	@FindBy (name = "Error")
	public WebElement errorValueForEEE488Port0SRQ;
	
	//IEEE-488 Port 1 SRQ values
	@FindBy (name = "Prompt (Default)")
	public WebElement defaultValueForEEE488Port1SRQ;
	
	@FindBy (name = "clear")
	public WebElement clearValueForEEE488Port1SRQ;
	
	@FindBy (name = "Error")
	public WebElement errorValueForIEEE488Port1SRQ;
	
	@FindBy (id = 	"IEEE_ListenerDelayValue")
	public WebElement IEEE_ListenerDelayValue;
	
	@FindBy (id = 	"IEEE_SCPI_QueryDelayValue")
	public WebElement IEEE_SCPI_QueryDelayValue;
	
	@FindBy (id = 	"8902_SerialPollSlowValue")
	public WebElement SerialPollSlowValue;
	
	@FindBy (id = 	"PreSerialPollDelayValue")
	public WebElement PreSerialPollDelayValue;
	
	@FindBy (id = 	"PostSerialPollDelayValue")
	public WebElement PostSerialPollDelayValue;
	
	@FindBy (id = 	"SerialPollRetriesValue")
	public WebElement SerialPollRetriesValue;
	
		
	public	InstrumentControlPageElements() {
		
	PageFactory.initElements(driver, this);
		}
}




