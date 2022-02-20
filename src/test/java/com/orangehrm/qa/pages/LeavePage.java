package com.orangehrm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.qa.utilities.ElementUtil;
import com.orangehrm.qa.utilities.WaitUtil;

public class LeavePage {
	WebDriver driver;
	ElementUtil util;
	WaitUtil wait;
	
	@FindBy(id="menu_leave_viewLeaveModule")
	WebElement leave;
	
	@FindBy(id="leaveList_chkSearchFilter_2")
	WebElement check;
	
	@FindBy(id="calFromDate")
	WebElement from;
	
	@FindBy(name = "leaveList[calToDate]")
	WebElement to;
	
	@FindBy(id = "checkbox")
	WebElement allcheckbox;
	
	@FindBy(name = "leaveList[txtEmployee][empName]")
	WebElement employee;
	
	@FindBy(id = "leaveList_cmbSubunit")
	WebElement subunitDropdown;
	
	@FindBy(name = "leaveList[cmbWithTerminated]")
	WebElement pastemployee;
	
	@FindBy(id = "btnSearch")
	WebElement searchbutton;
	
	@FindBy(id = "leaveList_chkSearchFilter_3")
	WebElement takenbutton;
	
	@FindBy(id = "btnReset")
	WebElement resetbutton;
	
	@FindBy(id = "btnSave")
	WebElement savebutton;
	public LeavePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		util=new ElementUtil();
	}
	public void leaveTabElements() {
		util.click(leave);
		util.isEnable(leave);
	}
	
	public boolean isButtonVisible()
	{
		return util.isVisible(searchbutton) &&
				util.isVisible(resetbutton)&&
				util.isVisible(from)&&
				util.isVisible(employee);
	}
	public void leaveList(){
		util.click(from);
		util.sendKeys(from, "2022-01-01");
		util.click(check);
		util.click(to);
		util.sendKeys(to, "2023-12-31");
		util.click(takenbutton);
		
		util.click(employee);
		util.sendKeys(employee, "Jasmine Morgan");
		util.selectDropdown(subunitDropdown, "index", "2");
		util.click(pastemployee);
		util.click(searchbutton);
		util.click(resetbutton);
	}
}
