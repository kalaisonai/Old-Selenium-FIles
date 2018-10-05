package dataProvider;

import org.testng.annotations.DataProvider;

public class GetData {

	/*@Test(invocationCount=2,dataProvider="fetchData")
	public void showData(String cname, String fname, String lname) {
    	System.out.println(cname);
    	System.out.println(fname);
    	System.out.println(lname);
	}*/
	@DataProvider(name="fetchData")
	public String[][] dynamicData() {
		String[][] data = new String[2][3];
		   data[0][0] = "TL";
		   data[0][1] = "Koushik";
		   data[0][2] = "Ch";
		   
		   data[1][0] = "TL";
		   data[1][1] = "Gopi";
		   data[1][2] = "J";
		   return data;
	}
	
	
	
	
	
	
}
