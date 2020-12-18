package listpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;

public class BaseCLass {
	
	public static WebDriver driver;
	
	//public static WebDriver driver;
	@BeforeSuite
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/search?q=way2automation&oq=way2automation&aqs=chrome..69i57j46i175i199j69i59j0l4.6424j0j1&sourceid=chrome&ie=UTF-8");
		
	}
	@AfterSuite
	public void teardown() {
		driver.quit();
	}
	
	
	

}
