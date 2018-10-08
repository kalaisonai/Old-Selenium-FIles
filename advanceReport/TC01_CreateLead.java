package advanceReport;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ReadExcel;
import wdmethods.PSM;

public class TC01_CreateLead extends PSM {
	@BeforeTest
	public void setData() {
		testcaseName="TC01_CreateLead";
		testdesp="Create a new Lead";
		author="Gayatri";
		category="Smoke";
	}
	@Test (dataProvider="fetchData")
	public void createLead(String cname, String fname, String lname) {
		WebElement cl = locateElement("link", "Create Lead");
		click(cl); 
		type(locateElement("id","createLeadForm_companyName"), cname);
		type(locateElement("id","createLeadForm_firstName"), fname);
		type(locateElement("id","createLeadForm_lastName"), lname);
		click(locateElement("class", "smallSubmit"));
	}
	/*@DataProvider(name="fetchData")
	public String[][] dynamicData() {
		String[][] data = new String[2][3];
		   data[0][0] = "TL";
		   data[0][1] = "Koushik";
		   data[0][2] = "Ch";
		   
		   data[1][0] = "TL";
		   data[1][1] = "Gopi";
		   data[1][2] = "J";
		   return data;
	}*/
    @DataProvider(name="fetchData")
	public String[][] getData() throws IOException {
		String[][] data = ReadExcel.readExcel("CreateLead");
		   return data;
	}
	

}
