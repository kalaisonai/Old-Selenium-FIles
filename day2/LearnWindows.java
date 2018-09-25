package week2.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {

	public static void main(String[] args) {
		//set driver path
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launch browser
		ChromeDriver driver = new ChromeDriver();
	    //load URL
		driver.get("http://legacy.crystalcruises.com/");
		//maximize
		driver.manage().window().maximize();
		driver.findElementByLinkText("GUEST CHECK-IN").click();
		System.out.println(driver.getTitle());
		Set<String> allWindows = driver.getWindowHandles();
	    /*for (String eachWin : allWindows) {
			driver.switchTo().window(eachWin);
		}*/
		List<String> list = new ArrayList<String>();
		list.addAll(allWindows);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getTitle());
		driver.findElementByLinkText("View Offer»").click();
		allWindows = driver.getWindowHandles();
		List<String> list1 = new ArrayList<String>();
		list1.addAll(allWindows);
		driver.switchTo().window(list1.get(2));
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
	}

}






