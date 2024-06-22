package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script16 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/drag-and-drop-circles");
		WebElement scr1= driver.findElement(By.className("red"));
		Thread.sleep(2000);
	    WebElement dst1 = driver.findElement(By.id("target"));
	    Thread.sleep(2000);
	    Actions act=new Actions(driver);
	    act.dragAndDrop(scr1, dst1).perform();
	    
	    WebElement scr2= driver.findElement(By.className("green"));
	    WebElement dst2 = driver.findElement(By.id("target"));
	    act.dragAndDrop(scr2, dst2).perform();
	    
	    WebElement scr3= driver.findElement(By.className("blue"));
	    WebElement dst3 = driver.findElement(By.id("target"));
	    act.dragAndDrop(scr3, dst3).perform();
	    

	    
}
}