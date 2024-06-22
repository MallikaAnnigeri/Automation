package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script17 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/tooltips");
		WebElement b1 = driver.findElement(By.id("btn1"));
		Actions act=new Actions(driver);
		act.moveToElement(b1).perform();
		
		WebElement b2 = driver.findElement(By.id("btn2"));
		WebElement b3 = driver.findElement(By.id("btn3"));
		WebElement b4 = driver.findElement(By.xpath("(//button)[5]"));
		WebElement b5 = driver.findElement(By.xpath("(//button)[6]"));
		
		act.moveToElement(b2).perform();
		Thread.sleep(1000);
		act.moveToElement(b3).perform();
		Thread.sleep(1000);
		act.moveToElement(b4).perform();
		Thread.sleep(1000);
		act.moveToElement(b5).perform();


}
}