package com.orangehrm.qa.testcases;

import org.testng.annotations.Test;

import com.orangehrm.qa.constants.Constants;
import com.orangehrm.qa.pages.AdminPage;
import com.orangehrm.qa.pages.LoginPage;
import com.orangehrm.qa.pages.PIMPage;

import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class PIMPageTest extends BasePageTest {
	@Test(priority = 1,groups= {"sanity","regression"})
	public void login() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username, password);

	}
	@Test(priority = 2,groups= {"sanity","regression"})
	public void validatePageTitle() {
		PIMPage pimPage = new PIMPage(driver);
		pimPage.PIMTabElements();
		//Assert.assertEquals(pimPage.getTitle(), "Employee Information");
	}
	@Test(priority = 3)
	public void buttonVisibleCheck() {
		PIMPage pimPage = new PIMPage(driver);
		pimPage.PIMTabElements();
		
		Assert.assertTrue(pimPage.isButtonVisible());
		//adminPage.searchUserAndDelete();
	}
	@Test(priority=4)
	public void verifyPIMPageAddUser() {
		PIMPage pimPage = new PIMPage(driver);
		pimPage.PIMTabElements();
		
		
		pimPage.clickAddEmployee();
		
		String userUrl=driver.getCurrentUrl();
		Assert.assertEquals(userUrl, Constants.addemployeeurl);	
	}
	
 
}
