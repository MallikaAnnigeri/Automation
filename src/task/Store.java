package task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Store {
	
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "./sws/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
	  WebElement login = driver.findElement(By.xpath("//a[@href='/login?returnUrl=%2F']"));
	  login.click();
		
	   WebDriverWait w= new WebDriverWait(driver,10);
	   WebElement email = driver.findElement(By.xpath("//input[@name='Email']"));

	   email.sendKeys("mallikaannigeri12@gmail.com");

	 
	   WebElement pwd = driver.findElement(By.xpath("//input[@name='Password']"));
	   pwd.sendKeys("Mallika@98");
	  
	   driver.findElement(By.xpath("//button[text()='Log in']")).click();
	   Thread.sleep(2000);
	  
	   WebElement elect = driver.findElement(By.xpath("//a[@href='/electronics'][1]"));
	   w.until(ExpectedConditions.visibilityOf(elect));
	 
	   Actions a=new Actions(driver);
	   a.moveToElement(elect).perform();

		
	    WebElement opt1 = driver.findElement(By.xpath("//a[@href='/camera-photo'][1]"));
        opt1.click();
        
        
        JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,400)");
		
        driver.findElement(By.xpath("//a[@href='/leica-t-mirrorless-digital-camera']")).click();
		j.executeScript("window.scrollBy(0,400)");
		
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		
		driver.findElement(By.xpath("//a[@href='/cart']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='termsofservice']")).click();
		
		driver.findElement(By.xpath("//button[text()=' Checkout ']")).click();

	 
	 
	 
	 
	 

}
}