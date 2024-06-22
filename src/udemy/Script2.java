package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script2 {
	
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Forgot your password?']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String text = driver.findElement(By.cssSelector("form p")).getText();
		String[] text1 = text.split("'");
		String text2 = text1[1].split("'")[0];
		return text2;
		
		     
        
		
	}
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		String name="rahul";
	    String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//button[.='Sign In']")).click();
	
}

}
