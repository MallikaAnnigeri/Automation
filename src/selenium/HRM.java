package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HRM {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("(//a)[3]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("Mallika");
		
		WebElement dd = driver.findElement(By.xpath("(//i)[8]"));
		dd.click();
		Thread.sleep(2000);

	   WebElement d2 = driver.findElement(By.xpath("//div[text()='-- Select --']"));
	
	
	    
		d2.sendKeys(Keys.ARROW_DOWN);
		d2.sendKeys(Keys.ARROW_DOWN);
		

		

		d2.sendKeys(Keys.ENTER);
		
	
		
	
		
		

	
	
		
		
	
	    
		


		

		
	}

}
