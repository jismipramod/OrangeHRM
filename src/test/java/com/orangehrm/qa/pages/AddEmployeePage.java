package com.orangehrm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.qa.utilities.ElementUtil;
import com.orangehrm.qa.utilities.WaitUtil;

public class AddEmployeePage {
	WebDriver driver;
	WaitUtil wait;
	com.orangehrm.qa.utilities.ElementUtil util;
	public AddEmployeePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		util=new ElementUtil();
	}
	@FindBy(id="firstName")
	WebElement firstname;
	@FindBy(id="middleName")
	WebElement middlename;
	@FindBy(id="lastName")
	WebElement lastname;
	@FindBy(id="employeeId")
	WebElement employeeid;
	@FindBy(id="chkLogin")
	WebElement checkbox;
	@FindBy(id="user_name")
	WebElement username;
	@FindBy(id="user_password")
	WebElement password;
	@FindBy(id="re_password")
	WebElement confpassword;
	@FindBy(id="status")
	WebElement statusdropdown;
	@FindBy(id="btnSave")
	WebElement buttonsave;
	

	public void adduserdata(String name, String midname, String lname, String id, String uname, String pas) 
{
	util.click(firstname);
	
	util.sendKeys(firstname,name);
	util.click(middlename);
	util.sendKeys(middlename, midname);
	util.click(middlename);
	util.sendKeys(lastname, lname);
	util.click(employeeid);
	util.sendKeys(employeeid, id);
	util.click(checkbox);
	util.click(username);
	util.sendKeys(username,uname);
	util.click(password);
	util.sendKeys(password, pas);
	util.click(confpassword);
	util.sendKeys(confpassword,pas);
	util.click(statusdropdown);
	util.selectDropdown(statusdropdown,"visibletext","Enabled");
	util.click(buttonsave);
	
	
}

}
