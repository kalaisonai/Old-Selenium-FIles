package advanceReport;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Report;
import wdmethods.WdMethods;

public class SeMethods extends Report implements WdMethods {

	RemoteWebDriver driver = null;
	@Override
	public void startApp(String browser, String url) {

		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.get(url);
			driver.manage().window().maximize();
			//System.out.println("The browser "+browser+" launched successfully");
		    reportStep("Pass", "The browser "+browser+" launched successfully");
		} catch (WebDriverException e) {
			System.err.println("WebDriverException");
			reportStep("Fail", "Browser not launched");
			throw new RuntimeException();
		}
	}

	@Override
	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id": return driver.findElementById(locValue); 
			case "class": return  driver.findElementByClassName(locValue);
			case "link": return driver.findElementByLinkText(locValue);
			case "name": return driver.findElementByName(locValue);
			}
		} catch (NoSuchElementException e) {
			System.err.println("Element not found");
			//throw new RuntimeException();
		}catch (WebDriverException e) {
			System.err.println("WebDriverException "+e.getMessage());
			//throw new RuntimeException();
		}
		return null;
	}

	@Override
	public WebElement locateElement(String locValue) {
		driver.findElementById(locValue);
		return null;
	}

	@Override
	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);	
			//System.out.println("The data "+data+" entered successfully");
		    reportStep("Pass", "The data "+data+" entered successfully");
		}catch (WebDriverException e) {
			System.err.println("WebDriverException occured");
			reportStep("Fail", "The data "+data+" not entered");
			throw new RuntimeException();
		}finally {
			takeSnap();
		}
	}

	@Override
	public void click(WebElement ele) {
		try {
			ele.click();
			//System.out.println("The element "+ele+ "click successfully");
		    reportStep("Pass", "The element "+ele+ "click successfully");
		} catch (WebDriverException e) {
			reportStep("Fail", "The element "+ele+ "click successfully");
		}
		takeSnap();
	}
	public void clickWithOutSnap(WebElement ele) {
		ele.click();
		System.out.println("The element "+ele+ "click successfully");
	}

	@Override
	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {
		Select sel = new Select(ele);
		sel.selectByVisibleText(value);
		System.out.println("The value "+value+" entered successfully");
	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToWindow(int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void takeSnap()  {
		// TODO Auto-generated method stub
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dec = new File("./snaps/img.png");
		try {
			FileUtils.copyFile(src, dec);
		} catch (IOException e) {
			System.err.println("IO exception occured");
		}
	}

	@Override
	public void closeBrowser() {
		driver.close();
	}

	@Override
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
       driver.quit();
	}

}
