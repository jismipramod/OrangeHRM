package com.orangehrm.qa.testcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangehrm.qa.constants.Constants;
import com.orangehrm.qa.pages.AddUserPage;
import com.orangehrm.qa.pages.AdminPage;
import com.orangehrm.qa.pages.LoginPage;
import com.orangehrm.qa.utilities.ExcelRead;
import com.orangehrm.qa.utilities.WaitUtil;

public class AddUserPageTest extends BasePageTest{
	@Test(priority = 1, groups = {"sanity"})
	public void login() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username, password);
	}
	@Test(priority = 2)
	public void adminPage() {
		AdminPage adminPage = new AdminPage(driver);
		adminPage.adminTabElements();
		adminPage.clickAddUser();
		
	}
	@Test(dataProvider="userdata", priority = 3)
	public void AddUserAction(String em,String user,String pass) throws InterruptedException {
		AddUserPage adduser=new AddUserPage(driver);
		adduser.adduserdata(em,user,pass);
		Thread.sleep(10000);
		Assert.assertEquals(driver.getCurrentUrl(),Constants.adduser);
	}
	@DataProvider(name="userdata")
	public Object[][] userData() throws InvalidFormatException, IOException{

		Object[][] data=ExcelRead.getDataFromExcel(Constants.dataprovider_filepath, "Adduser");
		return data;
	}

}
		
		
	
	
	
	
	


