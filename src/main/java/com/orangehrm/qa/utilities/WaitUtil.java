package com.orangehrm.qa.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangehrm.qa.constants.Constants;

public class WaitUtil {
	WebDriver driver;
	WebDriverWait wait;
public WaitUtil(WebDriver driver) {
	this.driver=driver;
	
}
public void waitForPageTitle(String Title)	{
	wait=new WebDriverWait(driver,Duration.ofSeconds(60));
	wait.until(ExpectedConditions.titleIs(Title));
			
}
public void waitForElementClick(WebElement element)	{
	new WebDriverWait(driver, Duration.ofSeconds(60));
	wait.until(ExpectedConditions.elementToBeClickable(element));
	
}

}
