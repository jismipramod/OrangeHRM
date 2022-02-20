package com.orangehrm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.qa.constants.Constants;
import com.orangehrm.qa.pages.AdminPage;
import com.orangehrm.qa.pages.LoginPage;

public class AdminPageTest extends BasePageTest {

	@Test(priority = 1,groups= {"sanity","regression"})
	public void login() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username, password);

	}

	@Test(priority = 2,groups= {"sanity","regression"})
	public void validatePageTitle() {
		AdminPage adminPage = new AdminPage(driver);
		adminPage.adminTabElements();
		Assert.assertEquals(adminPage.getTitle(), "System Users");
	}

	@Test(priority = 3)
	public void buttonVisibleCheck() {
		AdminPage adminPage = new AdminPage(driver);
		adminPage.adminTabElements();
		Assert.assertTrue(adminPage.isButtonVisible());
		//adminPage.searchUserAndDelete();
	}
	@Test(priority=4)
	public void verifyAdminPageAddUser() {
		AdminPage adminPage = new AdminPage(driver);
		adminPage.adminTabElements();
		adminPage.clickAddUser();
		
		String userUrl=driver.getCurrentUrl();
		Assert.assertEquals(userUrl, Constants.adduserurl);	
	}
	
}
