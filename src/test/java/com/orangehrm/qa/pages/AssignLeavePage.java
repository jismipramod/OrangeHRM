package com.orangehrm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.qa.utilities.ElementUtil;

public class AssignLeavePage {
	WebDriver driver;
	public ElementUtil util;
	public AssignLeavePage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		util=new ElementUtil();
		
	}
	@FindBy(xpath="//b[normalize-space()='Leave']")
	WebElement Leave;
	@FindBy(id="assignleave_txtEmployee_empName")
	WebElement empl;

	@FindBy(xpath="//a[@id='menu_leave_assignLeave']")
	WebElement assign;
	@FindBy(id="assignleave_txtLeaveType")
	WebElement leavetype;;
	@FindBy(id="assignleave_txtFromDate")
	WebElement frdate;
	@FindBy(id="assignleave_txtToDate")
	WebElement todate ;
	@FindBy (xpath="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[3]/a")
	WebElement date;
	@FindBy(id="assignleave_txtComment")
	WebElement comment;
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")
	WebElement mnth;
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")
	WebElement yr;
	@FindBy(id="assignleave_partialDays")
	WebElement partial;
	@FindBy(id="assignleave_duration_duration")
	WebElement duration;
	@FindBy(id="assignBtn")
	WebElement submit;
	public void assignLeave(String employname,String cmnt)
	{   util.click(Leave);
		util.click(assign);
		util.click(empl);
		util.sendKeys(empl, employname);
		util.selectDropdown(leavetype, "index", "2");
		util.click(frdate);
		util.sendKeys(frdate, "2022-02-02");
		util.click(empl);
		util.click(todate);
		util.sendKeys(todate, "2022-02-03");
		util.click(empl);
		util.selectDropdown(partial, "index", "2");
		util.sendKeys(comment,cmnt);
		util.click(submit);
		
		
		
	}


	}

