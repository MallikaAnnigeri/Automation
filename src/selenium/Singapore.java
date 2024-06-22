package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Singapore {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./sws/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");


		WebDriver driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.singaporeair.com");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(int i=0;i<5;i++)
		{
			js.executeScript("window.scrollBy(0,600)");
			

		}

		WebDriverWait w=new WebDriverWait(driver,10);
	   WebElement date = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='departureMonth']")));
		date.click();

		driver.findElement(By.xpath("//li[text()='30' and @data-num='30']")).click();
		driver.findElement(By.xpath("//input[@name='returnMonth']")).click();

	
	
		driver.findElement(By.xpath("//li[@date-data='2024-05-02']")).click();
		WebElement from = driver.findElement(By.xpath("//input[@name='origin']"));
		from.click();
		driver.findElement(By.xpath("//span[@class='icon icon--close-circle']")).click();
		from.sendKeys("Dubai");
		from.sendKeys(Keys.ENTER);
		WebElement to = driver.findElement(By.xpath("//input[@name='destination']"));
		to.sendKeys("America");
		Thread.sleep(2000);
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ARROW_DOWN);

		Thread.sleep(2000);
		to.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary js-open-loading']")).click();
	   
		
		
		
		
		
		
		
	
	
		


}
}