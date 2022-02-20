package com.orangehrm.qa.pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.qa.utilities.ElementUtil;

public class AdminPage {
	
	WebDriver driver;
	ElementUtil util;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement adminTab;
	
	@FindBy(xpath = "//a[@class='toggle tiptip']")
	WebElement sysToggleActive;
	
	@FindBy(id = "btnAdd")
	WebElement addBtn;
	
	@FindBy(id = "btnDelete")
	WebElement deleteBtn;
	
	@FindBy(id = "searchBtn")
	WebElement searchBtn;
	
	@FindBy(id = "resetBtn")
	WebElement resetBtn;
	
	@FindBy(id = "searchSystemUser_userName")
	WebElement username;
	
	@FindBy(id = "searchSystemUser_userType")
	WebElement userRoleDropdown;
	
	@FindBy(id = "searchSystemUser_status")
	WebElement statusDropdown;
	
	@FindBy(id = "ohrmList_chkSelectAll")
	WebElement checkAllUser;
	
	@FindBy(xpath ="//*[@id=\"systemUser-information\"]/div[1]/h1")
	WebElement title;
	@FindBy(id="dialogDeleteBtn")
	WebElement deleteokbtn;
	
	public AdminPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		util=new ElementUtil();
	}
	
	public void adminTabElements() {
		util.click(adminTab);
		util.isEnable(adminTab);
	}
	
	public boolean isButtonVisible()
	{
		return util.isVisible(deleteBtn) &&
				util.isVisible(searchBtn)&&
				util.isVisible(resetBtn);
	}
	
	public void userAction() {
		util.selectDropdown(userRoleDropdown, "index", "1");
		util.selectDropdown(statusDropdown, "index", "1");
		
		
	}
	public void searchUserAndDelete() {
		util.click(username);
		util.sendKeys(username, "harry");
		util.click(searchBtn);
		util.click(checkAllUser);
		util.click(deleteBtn);
		util.click(deleteokbtn);
		
		
	
	}
	public void clickAddUser() {
		util.click(addBtn);
	}
	public String getTitle() {
		return util.getValue(title);
	}
	
}
