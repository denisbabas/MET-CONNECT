package pages;

import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class RuntimeConfigurationPageElements extends BaseClass {

public RuntimeConfigurationPageElements() {
		
	    PageFactory.initElements(driver, this);
		}
}

