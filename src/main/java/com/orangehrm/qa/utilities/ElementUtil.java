package com.orangehrm.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.orangehrm.qa.constants.Constants;

public class ElementUtil {
	WebElement driver;
	static Properties pro = new Properties();

	public ElementUtil() {

		File src = new File(Constants.configpath);

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);

		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}

	}

	public ElementUtil(WebDriver driver) {
		this.driver = (WebElement) driver;
	}

	public String getUsername() {

		String username = pro.getProperty("username");
		return username;

	}

	public String getPassword() {

		String password = pro.getProperty("password");
		return password;

	}

	public String getBaseurl() {

		String baseurl = pro.getProperty("baseUrl");
		return baseurl;

	}

	public void click(WebElement e) {
		e.click();
	}
	
	public String getValue(WebElement e) {
		return e.getText();
	}

	public void sendKeys(WebElement s, String i) {
		s.clear();
		s.sendKeys(i);
	}

	public static String getPropertyValue(String key) {

		String propertyFile = System.getProperty("user.dir") + "/Configuration/config.properties";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(propertyFile);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		try {
			pro.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}
		String value = pro.get(key).toString();
		return value;
	}
	public void selectDropdown( WebElement element,String type,String value) {
		Select sel= new Select(element);
		switch(type) {
		case "index":
			sel.selectByIndex(Integer.parseInt(value));
			break;
		case "Visibletext":
			sel.selectByVisibleText(value);
			break;
		case "byvalue":
		sel.selectByValue(value);
		break;
		}
		
	}
	public boolean isVisible(WebElement e) {
		
		return e.isDisplayed();
	}
	
public boolean isEnable(WebElement e) {
		
		return e.isEnabled();
	}
public void mousehover(WebElement element, WebElement element1,WebDriver driver){
	Actions act=new Actions(driver);
	act.moveToElement(element).moveToElement(element1).click().perform();
	
}



}
