package dataProvider;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ReadExcel;
import wdmethods.PSM;

public class TC01_CreateLead extends PSM {
	@Test(groups= {"smoke"}, /*dataProviderClass=GetData.class,*/
			dataProvider="fetchData")
	public void createLead(String cname, String fname, String lname) {
		WebElement cl = locateElement("link", "Create Lead");
		click(cl);
		type(locateElement("createLeadForm_companyName"), cname);
		type(locateElement("createLeadForm_firstName"), fname);
		type(locateElement("createLeadForm_lastName"), lname);
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