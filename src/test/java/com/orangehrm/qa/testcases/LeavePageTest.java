package com.orangehrm.qa.testcases;

import org.testng.annotations.Test;

import com.orangehrm.qa.pages.LeavePage;
import com.orangehrm.qa.pages.LoginPage;

public class LeavePageTest extends BasePageTest {
	@Test(priority = 1,groups= {"sanity","regression"})
	public void login() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username, password);

	}

  @Test(priority=2)
  public void leavelist() {
	  LeavePage leavepage= new LeavePage(driver);
	  leavepage.leaveTabElements();
	  leavepage.isButtonVisible();
	  leavepage.leaveList();
  }
}
