package webTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ErailWebTable {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://erail.in/");
		WebElement from = driver.findElementById("txtStationFrom");
		from.clear();
		from.sendKeys("MAS", Keys.TAB);
		WebElement to = driver.findElementById("txtStationTo");
		to.clear();
		to.sendKeys("SBC", Keys.TAB);
		driver.findElementById("chkSelectDateOnly").click();

		WebElement table = 
				driver.findElementByXPath("//table[@class='DataTable TrainList']");

		List<WebElement> trs = table.
				findElements(By.tagName("tr"));
		System.out.println(trs.size());
		for (WebElement rows : trs) {
			List<WebElement> cols = rows.
					findElements(By.tagName("td"));
			System.out.println(cols.get(1).getText());
		}
	}

}







