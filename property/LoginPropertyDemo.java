package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class LoginPropertyDemo extends ProjectMethods {

	@BeforeTest(groups="common")
	public void setData() {
		testCaseName = "Login";
		testDescription ="Property file demo";
		category = "Smoke";
		authors= "koushik";
		testNodes = "Leads";
//		dataSheetName="login";
	}
	@Test(/*dataProvider="fetchData"*/)
	public  void createLead()   {
     new LoginPage()
     .typeUsername("DemoSalesManager")
     .typePassword("crmsfa")
     .clickLogin()
     .clickCrmsfa();

	}


}
