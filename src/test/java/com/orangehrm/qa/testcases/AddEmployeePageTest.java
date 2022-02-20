package com.orangehrm.qa.testcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangehrm.qa.constants.Constants;
import com.orangehrm.qa.pages.AddEmployeePage;
import com.orangehrm.qa.pages.AddUserPage;
import com.orangehrm.qa.pages.AdminPage;
import com.orangehrm.qa.pages.LoginPage;
import com.orangehrm.qa.pages.PIMPage;
import com.orangehrm.qa.utilities.ExcelRead;

public class AddEmployeePageTest extends BasePageTest {
	@Test(priority = 1, groups = {"sanity"})
	public void login() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username, password);
	}
	@Test(priority = 2)
	public void pimPage() {
		PIMPage pimPage = new PIMPage(driver);
		pimPage.PIMTabElements();
		pimPage.clickAddEmployee();
		}
	@Test(dataProvider="userdata", priority = 3)
	public void AddEmpAction(String name,String midname,String lname,String id,String uname,String pas) throws InterruptedException {
		AddEmployeePage addemp=new AddEmployeePage(driver);
		addemp.adduserdata(name,midname,lname,id,uname,pas);
		Thread.sleep(10000);
		//Assert.assertEquals(driver.getCurrentUrl(),Constants.adduser);
	}
	@DataProvider(name="userdata")
	public Object[][] userData() throws InvalidFormatException, IOException{

		Object[][] data=ExcelRead.getDataFromExcel(Constants.dataprovider_filepath, "Addemployee");
		return data;
	}
 
}