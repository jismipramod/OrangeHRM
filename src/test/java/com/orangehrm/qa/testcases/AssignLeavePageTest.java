package com.orangehrm.qa.testcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangehrm.qa.constants.Constants;
import com.orangehrm.qa.pages.AssignLeavePage;
import com.orangehrm.qa.pages.LoginPage;
import com.orangehrm.qa.utilities.ExcelRead;





public class AssignLeavePageTest extends BasePageTest {
	@Test(priority = 1,groups= {"sanity","regression"})
	public void login() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username, password);
	}
@Test(dataProvider="assignData",priority=2)
public void assignFunction(String emp,String comment)
{
	AssignLeavePage assign= new AssignLeavePage(driver);
	assign.assignLeave(emp, comment);
}
@DataProvider()

public Object[][] assignData() throws InvalidFormatException, IOException{

	Object[][] data=ExcelRead.getDataFromExcel(Constants.dataprovider_filepath3, "leaveassign");

	return data;
}

}