package udemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./soft/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement chk1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		Assert.assertFalse(chk1.isSelected());
		chk1.click();
		Assert.assertTrue(chk1.isSelected());
		chk1.click();
		Assert.assertTrue(chk1.isSelected());
		

}
}