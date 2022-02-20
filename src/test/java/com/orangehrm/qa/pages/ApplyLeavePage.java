package com.orangehrm.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.qa.utilities.ElementUtil;

public class ApplyLeavePage {
	WebDriver driver;
	public ElementUtil util;
	public ApplyLeavePage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		util=new ElementUtil();
		
	}
	@FindBy(xpath="//b[normalize-space()='Leave']")
	WebElement Leave;
	
	@FindBy(id="menu_leave_applyLeave")
	WebElement apply;
	
	@FindBy(id="applyleave_txtLeaveType")
	WebElement typedropdown;
	
	@FindBy(id="applyleave_txtFromDate")
	WebElement from;
	
	@FindBy(id="applyleave_txtToDate")
	WebElement to;
	
	@FindBy(id="applyleave_txtComment")
	WebElement cmnt;
	
	@FindBy(id="applyBtn")
	WebElement applybtn;
	
	@FindBy(xpath="//form[@id='frmLeaveApply']//fieldset//ol")
	WebElement page;
	
	@FindBy(id="applyleave_duration_duration")
	WebElement duration;
	
	@FindBy(id="leaveBalance_details_link")
	WebElement balance;
	
	@FindBy(xpath="//div[@id='balance_details']//input[@id='closeButton']")
	WebElement alertok;
	
	public void applyleave() throws InterruptedException{
		util.click(Leave);
		util.click(apply);
		
		util.click(typedropdown);
		util.selectDropdown(typedropdown, "visibletext", "CAN - Bereavement");
		util.click(from);
		util.sendKeys(from, "2022-02-05");
		util.click(typedropdown);
		util.click(to);
		util.sendKeys(to, "2022-02-25");
		util.click(typedropdown);
		util.click(cmnt);
		util.sendKeys(cmnt, "sick");
		util.isVisible(page);
		util.click(applybtn);
		
			
		
	}		
}
