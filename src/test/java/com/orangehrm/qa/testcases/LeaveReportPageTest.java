package com.orangehrm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.qa.pages.AdminPage;
import com.orangehrm.qa.pages.LeaveReportPage;
import com.orangehrm.qa.pages.LoginPage;

public class LeaveReportPageTest extends BasePageTest {

	@Test(priority = 1,groups= {"sanity","regression"})
	public void login() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username, password);

	}

	@Test(priority = 2,groups= {"sanity","regression"})
	public void reportgen() throws InterruptedException {
		LeaveReportPage reportPage = new LeaveReportPage(driver);
		reportPage.leavereport();
		reportPage.reportview();
	}

}
