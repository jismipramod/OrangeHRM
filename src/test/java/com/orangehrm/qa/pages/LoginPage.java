package com.orangehrm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.qa.testcases.BasePageTest;
import com.orangehrm.qa.utilities.ElementUtil;

public class LoginPage extends BasePageTest {
	
	WebDriver driver;
	ElementUtil util;
	
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id = "txtPassword")
	WebElement password;
	
	@FindBy(id = "btnLogin")
	WebElement login;
	
	@FindBy(id = "divLogo")
	WebElement logo;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		util=new ElementUtil();
	}
	
	public void login(String a,String b) {
		util.sendKeys(username,a);
		util.sendKeys(password,b);
		util.click(login);
	}

}
