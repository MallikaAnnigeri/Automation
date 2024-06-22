package Testngg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Data {

	@DataProvider(name="TestData")

	public Object[][] Data()
	{
		Object[][] d1=new Object[2][2];
		d1[0][0]="admin";
		d1[0][1]="admin@123";
		d1[1][0]="xyz";
		d1[1][1]="xyz@123";
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


