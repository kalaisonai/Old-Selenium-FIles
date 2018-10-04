package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdmethods.PSM;

public class TC03_DeleteLead extends PSM {
	@Test(groups="reg")
	public void deleteLead() {
		WebElement cl = locateElement("link", "Create Lead");
		click(cl);
		type(locateElement("createLeadForm_companyName"), "TL");
		type(locateElement("createLeadForm_firstName"), "Koushik");
		type(locateElement("createLeadForm_lastName"), "Chatterjee");
		click(locateElement("class", "smallSubmit"));
		
	}

	

}