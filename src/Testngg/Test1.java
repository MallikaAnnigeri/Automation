package Testngg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test(dataProvider="TestData",dataProviderClass=DataProvider2.class)
	public void Open(String usn,String pwd)
	{
		System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	
		driver.findElement(By.id("email")).sendKeys(usn);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		

}
}