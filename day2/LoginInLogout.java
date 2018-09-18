package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginInLogout {

	public static void main(String[] args) {
	//set driver path
	System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//launch browser
	ChromeDriver driver = new ChromeDriver();
    //load URL
	driver.get("http://leaftaps.com/opentaps");
	//maximize
	driver.manage().window().maximize();
	//Enter username
	driver.findElementById("username1").sendKeys("DemoSalesManager");
	//Enter password
	driver.findElementById("password").sendKeys("crmsfa");
	//click login
	driver.findElementByClassName("decorativeSubmit").click();
	//click logout
	driver.findElementByClassName("decorativeSubmit").click();
	
	}
}






