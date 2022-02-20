package com.orangehrm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.qa.utilities.ElementUtil;
import com.orangehrm.qa.utilities.WaitUtil;

public class RecruitmentPage {
	WebDriver driver;
	ElementUtil util;
	WaitUtil wait;
	public RecruitmentPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		util=new ElementUtil();
	}

	
	@FindBy(xpath="//b[normalize-space()='Recruitment']")
	WebElement Recruitment;
	
	@FindBy(id="menu_recruitment_viewCandidates")
	WebElement candidate;
	
	
	@FindBy(id="candidateSearch_jobTitle")
	WebElement Title;
	
	
	@FindBy(xpath="//select[@id='candidateSearch_jobVacancy']")
	WebElement vacancy;
	
	
	@FindBy(id="candidateSearch_hiringManager")
	WebElement manager;
	
	@FindBy(id="leave_balance_leave_type")
	WebElement leavetype;
	
	@FindBy(id="period")
	WebElement period;
	
	@FindBy(id="leave_balance_job_title")
	WebElement title;
	
	@FindBy(id="candidateSearch_status")
	WebElement status;
	
	@FindBy(id="candidateSearch_candidateName")
	WebElement candidatename;
	
	@FindBy(id="candidateSearch_keywords")
	WebElement key;
	
	@FindBy(id="candidateSearch_fromDate")
	WebElement fromdate;
	
	@FindBy(id="candidateSearch_toDate")
	WebElement toDate;
	
	@FindBy(id="candidateSearch_modeOfApplication")
	WebElement method;
	
	@FindBy(xpath="//input[@id='btnSrch']")
	WebElement search;
	
	@FindBy(id="btnRst")
	WebElement reset;
	
	public void recruitment(){
		util.click(Recruitment);
		util.click(candidate);	
	}
	public void isButtonVisibility() {
		System.out.println(util.isVisible(Title));
	}
	
	public void recruitmentSearch(String name,String keyword) throws InterruptedException {
		util.click(Title);
		util.selectDropdown(Title, "visibletext", "All");
		util.click(vacancy);
		util.selectDropdown(vacancy, "visibletext", "All");
		util.click(manager);
		util.selectDropdown(manager, "visibletext", "All");
		util.click(status);
		util.selectDropdown(status, "visibletext", "All");
		util.click(candidatename);
		util.sendKeys(candidatename, name);
		util.click(key);
		util.sendKeys(key, keyword);
		util.click(fromdate);
		util.sendKeys(fromdate, "2022-02-10");
		util.click(toDate);
		util.sendKeys(toDate, "2022-02-17");
		util.click(key);
		util.click(method);
		util.selectDropdown(method, "visibletext", "All");
		util.click(candidatename);
		Thread.sleep(2000);
		util.click(search);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
