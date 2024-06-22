package Testngg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	
	@DataProvider(name="TestData")

	public String[][] Data()
	{
		String[][] d1={ {"admin","admin@123"},{"xyz","xyz@123"}};
		return d1;
	
	}
	
	
	
	@Test(dataProvider="TestData")
	public void Open(String usn,String pwd)
	{
		System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	
		driver.findElement(By.id("email")).sendKeys(usn);
		driver.findElement(By.id("pass")).sendKeys(pwd);

		

	
	}

}
