package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.PageInitializer;

public class CommonMethods extends PageInitializer {

	/**
	 * Use this method in need of clicking on a WebElement by selenium WebDriver.
	 * 
	 * @param element Pass the desired WebElement to be clicked.
	 */
	public static void click(WebElement element) {
		element.click();
	}

	/**
	 * Use this method in need of double clicking on a WebElement by selenium
	 * WebDriver.
	 * 
	 * @param element Pass the desired WebElement to be clicked two times.
	 */

	public static void doubleClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).build().perform();
	}

	/**
	 * This method perform enter click
	 * 
	 * @param element
	 */
	public static void pressEnter(WebElement element) {
		element.sendKeys(Keys.ENTER);
	}

	/**
	 * This method perform TAB click
	 * 
	 * @param element
	 */
	public static void pressTAB(WebElement element) {
		element.sendKeys(Keys.TAB);
	}

	/**
	 * This method replace all characters except Alphabets
	 * 
	 * @param yourValue
	 */
	public static String getAlphabeticAharactersOnly(String yourValue) {
		return yourValue.replaceAll("[^a-zA-Z", "");
	}

	/**
	 * 
	 * @param This method replace all characters except Numbers;
	 * @return
	 */

	public static String getNumChrtr(String yourValue) {
		return yourValue.replaceAll("[^0-9]", "");
	}

	/**
	 * Use this method in need of entering value to a text box through selenium
	 * WebDriver.
	 * 
	 * @param element Pass the element to which the text needs to be entered.
	 * @param value   Pass the desired text/value in the second parameter.
	 */
	public static void sendKeys(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}

	/**
	 * Use this method in need of entering keyboard keys into a WebElement by
	 * selenium WebDriver.
	 * 
	 * @param element     Pass the element to which the key needs to be entered.
	 * @param keyboardKey Pass the desired keyboardKey to be entered to an element.
	 */
	public static void sendKeys(WebElement element, Keys keyboardKey) {
		element.sendKeys(keyboardKey);
	}

	/**
	 * Use this method in need of retrieving the text of an element through selenium
	 * WebDriver.
	 * 
	 * @param element Pass the element from which the text to be retrieved.
	 * @return This method returns a string object.
	 */
	public static String getText(WebElement element) {
		return element.getText();
	}

	/**
	 * Use this over loaded method in need of selecting an element of dropDown by
	 * VisbleText.
	 * 
	 * @param dropDownElement Pass the WebElement of the desired dropDown.
	 * @param ValueOfDropDown Pass the Visible text of DropDown to be selected.
	 */
	public static void selectDropDownValue(String VisibleTextOfDD, WebElement dropDownWebEl) {
		Select select = new Select(dropDownWebEl);
		select.selectByVisibleText(VisibleTextOfDD);
	}

	/**
	 * Use this over loaded method in need of selecting an element of dropDown by
	 * Value.
	 * 
	 * @param dropDownElement Pass the value to be selected.
	 * @param ValueOfDropDown Pass the WebElement of the dropDown.
	 */
	public static void selectDropDownValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	/**
	 * Use this over loaded method in need of selecting an element of dropDown by
	 * index.
	 * 
	 * @param dropDownElement      WebElement of the dropDown.
	 * @param indexOfDropDownValue Pass the index
	 */
	public static void selectDropDownValue(WebElement dropDownElement, int index) {
		Select select = new Select(dropDownElement);
		select.selectByIndex(index);
	}

	/**
	 * This method will determine if element is present on ui or not.
	 * 
	 * @param element
	 * @return
	 */
	public static boolean isElementDisplayed(WebElement element) {
		try {
			return element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * This method will determine if the element is enabled or disabled.
	 * 
	 * @param element
	 * @return
	 */
	public static boolean isElementEnabled(WebElement element) {
		try {
			return (element.isDisplayed() && element.isEnabled());
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * 
	 * Denys winium
	 */

	public static void waitForElementToBeClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void waitForClickability(WebElement element) {
		getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	public static WebDriverWait getWaitObject() {
		return new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);
	}

	public static void waitForVisib(WebElement element) {
		getWaitObject().until(ExpectedConditions.visibilityOfAllElements(element));
	}

	/**
	 * Method that will take a screenshot and store with name in specified location
	 * with .png extension
	 * 
	 * @param fileName
	 */

	public static byte[] takeScreenshot(String fileName) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] bytes = ts.getScreenshotAs(OutputType.BYTES);

		File src = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(Constants.SCREENSHOT_FILEPATH + fileName + getTimeStamp() + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return bytes;

	}

	/**
	 * This method will generate timeStamp
	 * 
	 * @return
	 */
	public static String getTimeStamp() {

		Date date = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH_mm_ss");

		return sdf.format(date);
	}

	/**
	 * Use this method to select a checkbox value
	 */
	public static void selectCheckbox(List<WebElement> checkboxList, String attribute, String value) {
		for (WebElement checkbox : checkboxList) {
			if (checkbox.isEnabled()) {
				String checkboxText = checkbox.getAttribute(attribute);
				if (checkboxText.equals(value)) {
					checkbox.click();

					break;
				}
			}
		}
	}

	/**
	 * Use this method to pass date as a string. You can concatinate with any String
	 * and get unique name
	 */
	public static String getDateAsString() {
		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateAsString = formatter.format(ts).toString();
		dateAsString = dateAsString.replaceAll("[^A-Za-z0-9]", "");
		return dateAsString;
	}

	/**
	 * Use this method to select a drop down value from a ServiceNow drop down menu
	 * when Select class will not work NOTE: Before using, first you must click on
	 * the drop down, then store elements in a list
	 */
	public static void selectValueFromBootStrapDropDownByName(List<WebElement> values, String value) {

		for (WebElement dropDownValues : values) {

			if (dropDownValues.getAttribute("Name").contentEquals(value)) {
				dropDownValues.click();
				break;
			}
		}

	}

	/**
	 * This Method print from the list of elements from the list
	 * 
	 * @param values
	 */
	public static void printFromTheList(List<WebElement> values) {
		for (WebElement i : values) {
			System.out.println(i.getAttribute("Name"));
		}
	}

	public static void clickThenSelectOptionFromDropdownByText(WebElement valueClick, List<WebElement> values,
			String value) {
		valueClick.click();
		for (WebElement dropDownValues : values) {
			if (dropDownValues.getAttribute("Name").equals(value)) {
				dropDownValues.click();
				break;
			}
		}
	}

	public static void verifyElementSuccesfullyDeletedOrNotPresentOnThePage(WebElement element) {
		try {

			if (element.isDisplayed()) {
				assert false : "Element was not successfully deleted.";
			} else {
				System.out.println("Element was successfully deleted.");
			}
		} catch (NoSuchElementException e) {
			System.out.println("Element was successfully deleted.");
		}
	}

}
