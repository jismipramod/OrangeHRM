package com.orangehrm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.qa.utilities.ElementUtil;

public class PIMPage  {
	WebDriver driver;
	ElementUtil util;
	@FindBy(id="empsearch_employee_name_empName")
	WebElement employename;
	@FindBy(id="empsearch_id")
	WebElement employeeid;
	@FindBy(id="empsearch_employee_status")
	WebElement employeestatusdropdown;
	@FindBy(id="empsearch_termination")
	WebElement includedropdown;
	@FindBy(id="empsearch_supervisor_name")
	WebElement supervisorname;
	@FindBy(id="empsearch_job_title")
	WebElement jobtitledropdown;
	@FindBy(id="empsearch_sub_unit")
	WebElement subunitdropdown;
	@FindBy(id="searchBtn")
	WebElement searchbutton;
	@FindBy(id="resetBtn")
	WebElement resetbutton;
	@FindBy(id="btnAdd")
	WebElement addbutton;
	@FindBy(id="btnDelete")
	WebElement deletebutton;
	@FindBy(id="menu_pim_viewPimModule")
	WebElement PIMtab;
	@FindBy(xpath ="//*[@id=\"employee-information\"]/a")
	WebElement title;

	public PIMPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		util=new ElementUtil();
	}
	
	public void PIMTabElements() {
		util.click(PIMtab);
		util.isEnable(PIMtab);
	}
	
	public boolean isButtonVisible()
	{
		return util.isVisible(employename) &&
				util.isVisible(employeeid)&&
				util.isVisible(employeestatusdropdown)&&
				util.isVisible(includedropdown) &&
				util.isVisible(supervisorname)&&
				util.isVisible(jobtitledropdown)&&
				util.isVisible(subunitdropdown) &&
				util.isVisible(searchbutton)&&
				util.isVisible(resetbutton)&&
				util.isVisible(addbutton)&&
				util.isVisible(deletebutton)
				;
	}
	public void userAction() {
		util.selectDropdown(jobtitledropdown, "index", "1");
		util.selectDropdown(includedropdown, "index", "1");
		util.selectDropdown(subunitdropdown, "index", "1");
		util.selectDropdown(employeestatusdropdown, "index", "1");
		
		
		
	}
	public void searchUserAndReset() {
		util.click(employename);
		util.sendKeys(employename, "Lisa Andrews");
		util.click(searchbutton);
		util.click(resetbutton);
	}
	public void clickAddEmployee() {
		util.click(addbutton);
	}
	public String getTitle() {
		return util.getValue(title);
	}
}
