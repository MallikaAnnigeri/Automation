package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Script6 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Mallika");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Mallika@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[name='login']")).click();

		
		
	}

}
