package pages;

import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class InstrumentsPageElements extends BaseClass {


	public InstrumentsPageElements() {
		
	    PageFactory.initElements(driver, this);
		}
}
