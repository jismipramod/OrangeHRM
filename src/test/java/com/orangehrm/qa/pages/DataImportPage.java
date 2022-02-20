package com.orangehrm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.qa.constants.Constants;
import com.orangehrm.qa.utilities.ElementUtil;

public class DataImportPage {
	WebDriver driver;
	ElementUtil util;
	
	@FindBy(id="menu_pim_Configuration")
	WebElement configuration;
	
	@FindBy(id = "menu_admin_pimCsvImport")
	WebElement dataImport;
	
	@FindBy(id = "pimCsvImport_csvFile")
	WebElement choose;
	
	@FindBy(id = "btnSave")
	WebElement upload;
	public DataImportPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		util=new ElementUtil();
	}
	public void choosefile(WebDriver driver) {
		
		util.mousehover(configuration, dataImport,driver);
		
		util.sendKeys(choose,Constants.uploadfile);
		util.click(upload);
	}
	
}
