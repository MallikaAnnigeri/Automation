package Testngg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericTestCase {
 public	WebDriver driver;
	@BeforeMethod
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver","./soft/chromedriver.exe");
		driver =new ChromeDriver();
		
	}
	
	@AfterMethod
	public void CloseBrowser()
	{
	driver.close();;
	}

}
