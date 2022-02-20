package com.orangehrm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.qa.constants.Constants;
import com.orangehrm.qa.pages.LoginPage;

public class LoginPageTest extends BasePageTest{
	
  @Test(priority=1,groups= {"sanity"})
	public void f() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.login(username, password);
		String title = driver.getTitle();
		Assert.assertEquals(title, Constants.pagetitle);
	}
}
