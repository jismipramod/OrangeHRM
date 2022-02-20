package com.orangehrm.qa.testcases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.orangehrm.qa.constants.Constants;
import com.orangehrm.qa.pages.LoginPage;
import com.orangehrm.qa.utilities.ElementUtil;

public class BasePageTest {

	WebDriver driver;
	ElementUtil util = new ElementUtil();
	public String url = util.getBaseurl();

	public String username = util.getUsername();
	public String password = util.getPassword();

	public LoginPage loginpage;

	@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void setUp(String browsername) {
		String path = System.getProperty("user.dir");
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", path + ElementUtil.getPropertyValue("chromepath"));
			driver = new ChromeDriver();
		}
		else if(browsername.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", path + ElementUtil.getPropertyValue("firefoxpath"));
				driver = new FirefoxDriver();
		}
		else if(browsername.equals("edge")) {
			System.setProperty("webdriver.edge.driver", path + ElementUtil.getPropertyValue("edgepath"));
			driver = new EdgeDriver();
	}
		driver.get(url);

	}
	@AfterMethod(alwaysRun=true)
	public void takeScreenShotOnFailure(ITestResult iTestResult) throws IOException {
	if (iTestResult.getStatus() == iTestResult.FAILURE) {
		takeScreenShotOnFailure(iTestResult.getName());

	}
}

public String takeScreenShotOnFailure(String name) throws IOException {
	String dateName = new SimpleDateFormat("yyyy_MM_dd_hh_mm").format(new Date());


	File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	String destination =Constants.screenShot_path + name + dateName + ".png";

	File finalDestination = new File(destination);

	FileUtils.copyFile(source, finalDestination);
	return destination;
}

	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
