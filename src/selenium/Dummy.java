package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dummy {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///C:/Users/Dell/Desktop/Facebook/Dummy.html");
		Thread.sleep(2000);
		WebElement t1=driver.findElement(By.id("i1"));
		t1.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		t1.sendKeys(Keys.CONTROL+"x");
		Thread.sleep(2000);
		
		WebElement t3=driver.findElement(By.className("c1"));
		t3.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		WebElement t2=driver.findElement(By.name("n1"));
		
		t2.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		t2.sendKeys(Keys.CONTROL+"x");
		
		t1.sendKeys(Keys.CONTROL+"v");
		
		t3.sendKeys(Keys.CONTROL+"a");
		t3.sendKeys(Keys.CONTROL+"x");
		t2.sendKeys(Keys.CONTROL+"v");
		
		
		
		
		
		
		
		
	
		
		
	   
	  
}
}