package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart3 {

public static void main(String[] args) throws InterruptedException, AWTException, IOException {
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
  Thread.sleep(2000);
  WebElement scr = driver.findElement(By.xpath("(//img)[3]"));
  
    File temp = scr.getScreenshotAs(OutputType.FILE);
    File perm= new File("C:\\Users\\Dell\\Desktop\\sel\\d1.jpeg");
  	FileHandler.copy(temp, perm); 
  	Thread.sleep(2000);
    String tab1 = arr.get(0);
    driver.switchTo().window(tab1);


}


}
