package com.orangehrm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.qa.utilities.ElementUtil;
import com.orangehrm.qa.utilities.WaitUtil;

public class MyInformationPage {
	WebDriver driver;
	ElementUtil util;
	WaitUtil wait;
	public MyInformationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		util=new ElementUtil();
	}
	

	@FindBy(xpath="//b[normalize-space()='My Info']")
	WebElement myinfo;
	
	@FindBy(xpath="//input[@id='personal_txtEmpFirstName']")
	WebElement fullname;
	
	
	@FindBy(xpath="//input[@id='personal_txtEmpMiddleName']")
	WebElement middlename;
	
	
	@FindBy(xpath="//input[@id='personal_txtEmpLastName']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='personal_txtEmployeeId']")
	WebElement idemp;
	
	@FindBy(xpath="//input[@id='personal_txtOtherID']")
	WebElement otherid;
	
	
	@FindBy(xpath="//input[@id='personal_txtLicenNo']")
	WebElement licensenum;
	
	
	@FindBy(xpath="//input[@id='personal_txtNICNo']")
	WebElement ssnnum;
	
	@FindBy(xpath="//input[@id='personal_txtSINNo']")
	WebElement sinnum;
	
	@FindBy(xpath="//input[@id='personal_optGender_1']")
	WebElement male;
	
	
	@FindBy(xpath="//input[@id='personal_txtEmpNickName']")
	WebElement nickname;
	
	
	@FindBy(xpath="//input[@id='personal_chkSmokeFlag']")
	WebElement smoker;
	
	@FindBy(xpath="//input[@id='personal_txtMilitarySer']")
	WebElement military;
	
	@FindBy(xpath="//input[@id='personal_txtLicExpDate']")
	WebElement licenseExp;
	
	
	@FindBy(xpath="//select[@id='personal_cmbMarital']")
	WebElement maritals;
	
	
	@FindBy(xpath="//input[@id='personal_DOB']")
	WebElement dateofbirth;
	
	@FindBy(name="custom1")
	WebElement blood;
	
	
	@FindBy(xpath="//input[@id='btnSave']")
	WebElement edit1;
	
	
	@FindBy(xpath="//input[@id='btnEditCustom']")
	WebElement edit2;
	
	@FindBy(xpath="//input[@id='btnSave']")
	WebElement save;
	

	@FindBy(xpath="//a[normalize-space()='Personal Details']")
	WebElement personalinfo;
	
public void personalinfoClick() {
	util.click(myinfo);
	util.click(personalinfo);
}
}
