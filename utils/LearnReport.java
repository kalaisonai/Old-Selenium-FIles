package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnReport {

	public static void main(String[] args) {
	//ClassName obj = new ClassName();
	//path of report
		//Before suite 
		
	ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
	html.setAppendExisting(true);
	ExtentReports extent = new ExtentReports();
	//attach report
	extent.attachReporter(html);
	//Before Class
    ExtentTest test = extent.createTest("TC001_Login", "Login into Leaftaps");
    test.assignAuthor("Gayatri");
    test.assignCategory("Smoke");
    //syso statement 
    test.pass("Enter username successfully");
    test.pass("Enter password successfully");
    test.fail("Click login not successfully");
    //generate report
    //After suite
    extent.flush();
	}

}





