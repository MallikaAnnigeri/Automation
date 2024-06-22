package udemy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Script6 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./soft/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement chk = driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));
		System.out.println(chk.isSelected());
		chk.click();
	    Assert.assertTrue(chk.isSelected());
	
		
		
}
}