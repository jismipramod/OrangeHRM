package com.orangehrm.qa.testcases;

import org.testng.annotations.Test;

import com.orangehrm.qa.pages.DataImportPage;
import com.orangehrm.qa.pages.LoginPage;
import com.orangehrm.qa.pages.PIMPage;

public class DataImportPageTest extends BasePageTest{
	@Test(priority = 1, groups = {"sanity"})
	public void login() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username, password);
	}
	@Test(priority = 2)
	public void pimPage() {
		PIMPage pimPage = new PIMPage(driver);
		pimPage.PIMTabElements();
		}
  @Test(priority=3)
  public void fileimport() throws InterruptedException {
	  DataImportPage dataImport=new DataImportPage(driver);
	  
	  dataImport.choosefile(driver);
	  Thread.sleep(3000);
  }
}
