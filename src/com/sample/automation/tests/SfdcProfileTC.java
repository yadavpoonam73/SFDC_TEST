package com.sample.automation.tests; 

import com.sample.automation.data.SfdcDataProvider;
import com.sample.automation.manager.SfdcManager;
import com.sample.automation.utils.SeleniumTestCase;
import com.thoughtworks.selenium.SeleniumException;

import java.util.Properties;

 

 

import org.testng.annotations.Test;
public class SfdcProfileTC extends SeleniumTestCase {
 
@Test(dataProvider = "logindetails", dataProviderClass = SfdcDataProvider.class)
    public void Test3(String Uname,String Pwd,String uname) throws Exception {
//Properties sc = site.getScreenResources();
  SfdcManager.profileSearch(driver,Uname,Pwd,uname);
  }
 
}

