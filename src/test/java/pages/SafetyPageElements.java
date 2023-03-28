package pages;

import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class SafetyPageElements extends BaseClass {

public SafetyPageElements() {
		
	    PageFactory.initElements(driver, this);
		}
}

