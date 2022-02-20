package com.orangehrm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.qa.utilities.ElementUtil;
import com.orangehrm.qa.utilities.WaitUtil;

public class LeaveReportPage {
	WebDriver driver;
	ElementUtil util;
	WaitUtil wait;
	public LeaveReportPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		util=new ElementUtil();
	}
	@FindBy(id="menu_leave_viewLeaveModule")
	WebElement leave;
	
	@FindBy(id="menu_leave_Reports")
	WebElement report;
	
	
	@FindBy(id="menu_leave_viewLeaveBalanceReport")
	WebElement leaveent;
	
	
	@FindBy(xpath="//select[@id='leave_balance_report_type']")
	WebElement type;
	
	
	@FindBy(id="leave_balance_report_type")
	WebElement generatefor;
	
	@FindBy(id="leave_balance_leave_type")
	WebElement leavetype;
	
	@FindBy(id="period")
	WebElement period;
	
	@FindBy(id="leave_balance_job_title")
	WebElement title;
	
	@FindBy(xpath="//select[@id='leave_balance_location']")
	WebElement location;
	
	@FindBy(id="leave_balance_sub_unit")
	WebElement unit;
	
	@FindBy(id="viewBtn")
	WebElement view;
	
	@FindBy(id="leave_balance_include_terminated")
	WebElement checkbox;
public void leavereport( ) throws InterruptedException {
		util.click(leave);
		util.click(report);
		util.mousehover(report, leaveent,driver);
		Thread.sleep(200);
		util.click(type);
		util.selectDropdown(type, "byvalue", "1");
}
public void reportview() throws InterruptedException {
	
	Thread.sleep(2000);
	util.click(generatefor);
	util.selectDropdown(generatefor, "index", "2");
	util.selectDropdown(leavetype, "byvalue", "8");
	util.selectDropdown(period, "byvalue", "2020-01-01$$2020-12-31");
	util.selectDropdown(title, "byvalue", "0");
	util.selectDropdown(unit, "byvalue", "0");
	Thread.sleep(2000);
	//util.click(location);
	//util.selectDropdown(location, "byvalue", "1");
	util.click(checkbox);
	util.click(view);
	
	
	
	
	
	
	
	
	
}
		

}
