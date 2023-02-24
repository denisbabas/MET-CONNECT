package testBase;


import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import utils.ConfigsReader;
import utils.Constants;

public class BaseClass {

	public static WebDriver driver;
	public static DesktopOptions options;
	public static WebDriverWait wait;
	
	 
	
	public static void setUp()  throws Exception {

		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);

		 options = new DesktopOptions();
	
		 options.setApplicationPath(ConfigsReader.getPropValue("app.exe"));
		
		 
		 driver = new WiniumDriver(new URL("http://localhost:9999"), options);
		// driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		
	        //wait = new WebDriverWait(driver, 15);
		
	     
		 PageInitializer.initializePageObjects();
		 
		
		 
		 
    }
	
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		
		
		}
	}
}
