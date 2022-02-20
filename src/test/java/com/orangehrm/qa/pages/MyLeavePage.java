package com.orangehrm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.qa.utilities.ElementUtil;
import com.orangehrm.qa.utilities.WaitUtil;

public class MyLeavePage {
	WebDriver driver;
	ElementUtil util;
	WaitUtil wait;
	public MyLeavePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		util=new ElementUtil();
	}
	@FindBy(xpath="//label[normalize-space()='Taken']")
	WebElement taken;
	
	@FindBy(id="menu_leave_viewMyLeaveList")
	WebElement myleave;
	
	@FindBy(id="calFromDate")
	WebElement from;
	
	@FindBy(id="calToDate")
	WebElement to;
	
	@FindBy(xpath="//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")
	WebElement allcheck;
	
	@FindBy(id="btnSearch")
	WebElement search;
	
	@FindBy(id="menu_leave_viewLeaveModule")
	WebElement leave;

	@FindBy(id="select_leave_action_69")
	WebElement drpdownsel;
	
	@FindBy(id="btnSave")
	WebElement savebtn;
	
	@FindBy(id="btnReset")
	WebElement reset;
	
	public void myleaveSearch() {
		util.click(leave);
		util.click(myleave);
		util.click(from);
		util.sendKeys(from, "2022-01-01");
		util.click(taken);
		util.click(to);
		util.sendKeys(to, "2023-12-31");
		util.click(taken);
		util.click(allcheck);
		util.click(search);
		util.click(drpdownsel);
		util.selectDropdown(drpdownsel, "visibletext","Cancel");
		util.click(savebtn);
		util.click(reset);
	}
	
	
}
