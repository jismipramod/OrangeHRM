package com.orangehrm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.qa.utilities.ElementUtil;
import com.orangehrm.qa.utilities.WaitUtil;

public class AddUserPage {
WebDriver driver;
WaitUtil wait;
com.orangehrm.qa.utilities.ElementUtil util;
public AddUserPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	util=new ElementUtil();
}
@FindBy(id="systemUser_employeeName_empName")
WebElement employeename;
@FindBy(id="systemUser_userName")
WebElement usernameadd;
@FindBy(id="systemUser_password")
WebElement passwordadd;
@FindBy(id="systemUser_confirmPassword")
WebElement confirmadd;
@FindBy(id="btnAdd")
WebElement adduser;
@FindBy(id="systemUser_userType")
WebElement role;
@FindBy(id="systemUser_status")
WebElement status;
@FindBy(id="btnSave")
WebElement save;


public void adduserdata(String em,String user,String pass)
{
	util.click(role);
	util.selectDropdown(role,"visibletext","Admin");
	util.sendKeys(employeename,em);
	util.sendKeys(usernameadd, user);
	util.click(status);
	util.selectDropdown(status,"visibletext","Enabled");
	util.sendKeys(passwordadd, pass);
	util.sendKeys(confirmadd, pass);
	util.click(save);
	
}
}


