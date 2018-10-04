package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdmethods.PSM;

public class TC01_CreateLead extends PSM {
	@Test(groups= {"smoke"})
	public void createLead() {
		WebElement cl = locateElement("link", "Create Lead1");
		click(cl);
		type(locateElement("createLeadForm_companyName"), "TL");
		type(locateElement("createLeadForm_firstName"), "Koushik");
		type(locateElement("createLeadForm_lastName"), "Chatterjee");
		click(locateElement("class", "smallSubmit"));
		
	}

	

}