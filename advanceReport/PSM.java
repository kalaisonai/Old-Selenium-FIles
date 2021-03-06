package advanceReport;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PSM extends SeMethods {
	@BeforeMethod
	public void login()  {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUsername = locateElement("id", "username");
		type(eleUsername, "DemoSalesManager");
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		click(locateElement("link", "CRM/SFA"));
		click(locateElement("link", "Leads"));
	}
	@AfterMethod
	public void close() {
		closeAllBrowsers();
	}

}
