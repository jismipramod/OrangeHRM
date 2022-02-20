package com.orangehrm.qa.testcases;

import org.testng.annotations.Test;


import com.orangehrm.qa.pages.LoginPage;
import com.orangehrm.qa.pages.MyInformationPage;

public class MyInformationPageTest extends BasePageTest {
	@Test(priority = 1, groups = {"sanity"})
	public void login() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username, password);
	}
	@Test(priority = 2)
	public void myinfoPage() {
		MyInformationPage myinfoPage = new MyInformationPage(driver);
		myinfoPage.personalinfoClick();
	}
}
		