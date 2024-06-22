package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart1 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./sws/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		WebElement search = driver.findElement(By.className("Pke_EE"));
		search.sendKeys("mobile");
		search.sendKeys(Keys.ENTER);
		
		WebElement mobile = driver.findElement(By.xpath("//img[@loading='eager']"));
        Actions act = new Actions(driver);
        act.contextClick(mobile).perform();
        Robot r =new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
     Set<String> tabs = driver. getWindowHandles();
     ArrayList<String> arr=new ArrayList<>(tabs);
     
       String tab2 = arr.get(1);
      driver.switchTo().window(tab2); 
      driver.manage().window().maximize();
      
      WebElement cart = driver.findElement(By.xpath("//span[text()='Cart']"));
      act.contextClick(cart).perform();
       r.keyPress(KeyEvent.VK_DOWN);
       r.keyRelease(KeyEvent.VK_DOWN);
       r.keyPress(KeyEvent.VK_ENTER);
       r.keyRelease(KeyEvent.VK_ENTER);
       Thread.sleep(2000);
       
     Set<String> tabss = driver.getWindowHandles();
     arr.addAll(tabss);
  
     
       String lasttab = arr.get(4);
     driver.switchTo().window(lasttab);
      Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='Login']")).click();
     
     



        
        
        
		



}
}