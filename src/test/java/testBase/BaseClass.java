package testBase;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;

import utils.ConfigsReader;
import utils.Constants;

public class BaseClass {

	public static WiniumDriver driver;
	public static DesktopOptions options;
	public static WebDriverWait wait;
	
	 
	
	public static void setUp() throws IOException {

		
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		
		String winiumPath = Constants.WINIUM_DesctopDriver; 
		String appPath = ConfigsReader.getPropValue("app.exe");
	    DesktopOptions options = new DesktopOptions();
	    options.setApplicationPath(appPath);
	    File driverPath = new File(winiumPath);
	    WiniumDriverService service = new WiniumDriverService.Builder().usingDriverExecutable(driverPath).usingPort(9999).buildDesktopService();
	        service.start();
	        driver = new WiniumDriver(service, options);
	        
	       // wait = new WebDriverWait(driver, Constants.IMPLICIT_WAIT_TIME);
	        PageInitializer.initializePageObjects();
	    }
		
	
	public static void tearDown() {
		if (driver != null) {
		driver.quit();
		
		
		}
	}
}
