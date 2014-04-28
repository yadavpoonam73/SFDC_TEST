package com.sample.automation.data;

import org.testng.annotations.DataProvider;



public class SfdcDataProvider {

	@DataProvider(name = "logindetails")
	public static Object[][] extract() throws Exception{
      
		TableData l=new TableData();
		Object[][] retObjArr=l.getTableArray("D:\\Allegis SFDC\\Allegis\\SFDC_TEST_Sandbox-master\\resources\\data\\testdata.xls",
              "userlogin", "Credentials");
      return(retObjArr);
	}
	
	@DataProvider(name = "reportDetails")
	public static Object[][] extract1() throws Exception{
      
		TableData l1=new TableData();
		Object[][] retObjArr1=l1.getTableArray("D:\\Allegis SFDC\\Allegis\\SFDC_TEST_Sandbox-master\\resources\\data\\testdata.xls",
              "userlogin", "Report");
      return(retObjArr1);
	}
}