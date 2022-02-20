package com.orangehrm.qa.testcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangehrm.qa.constants.Constants;
import com.orangehrm.qa.pages.AssignLeavePage;
import com.orangehrm.qa.pages.LoginPage;

import com.orangehrm.qa.pages.RecruitmentPage;
import com.orangehrm.qa.utilities.ExcelRead;

public class RecruitmentPageTest extends BasePageTest {
	@Test(priority = 1, groups = {"sanity"})
	public void login() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username, password);
	}
	@Test(priority = 2)
	public void recPage() throws InterruptedException {
		RecruitmentPage recPage = new RecruitmentPage(driver);
		recPage.recruitment();
		Thread.sleep(2000);
		recPage.isButtonVisibility();
		
		}
	@Test(dataProvider="candidaterecruit",priority=3)
	public void recruitmentSearch(String name,String keyword) throws InterruptedException
	
	{
		RecruitmentPage assign= new RecruitmentPage(driver);
		assign.recruitmentSearch(name, keyword);
			
	}
	@DataProvider(name="candidaterecruit")

	public Object[][] assignData() throws InvalidFormatException, IOException{

		Object[][] data=ExcelRead.getDataFromExcel(Constants.dataprovider_filepath, "candidaterecruit");

		return data;
	}

	}

