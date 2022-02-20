package com.orangehrm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://erp.buffalocart.com/login");
		WebElement name=driver.findElement(By.name("user_name"));
		name.click();
		name.sendKeys("admin");
		WebElement pass=driver.findElement(By.name("password"));
		pass.click();
		pass.sendKeys("123456");
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		driver.findElement(By.xpath("//a[@title='Tasks']")).click();
		
		
	}

}
