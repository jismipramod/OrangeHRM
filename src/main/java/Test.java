import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	public static void main(String[] args) {
		/*System.setProperty("webdriver.edge.driver", "C:\\Users\\jismi\\OneDrive\\Desktop\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://affiliate.flipkart.com/");
		// TODO Auto-generated method stub*/
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		System.out.println("url"+driver.getCurrentUrl());
		System.out.println("title"+driver.getTitle());
		WebElement search=driver.findElement(By.id("small-searchterms"));
		System.out.println(search.isDisplayed());
		System.out.println(search.isEnabled());
		
		
	}

}
