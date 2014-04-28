package com.sample.automation.tests;


import com.sample.automation.data.SfdcDataProvider;

import com.sample.automation.manager.SfdcManager;

import com.sample.automation.utils.SeleniumTestCase;

import com.thoughtworks.selenium.SeleniumException;
import java.util.Properties;
import org.testng.annotations.Test;

public class SfdcReportTc extends SeleniumTestCase {


@Test(dataProvider = "reportDetails", dataProviderClass = SfdcDataProvider.class)

public void Test2(String Uname,String Pwd,String reportName) throws Exception {

//Properties sc = site.getScreenResources();

SfdcManager.login1(driver,Uname,Pwd,reportName);

}





}

