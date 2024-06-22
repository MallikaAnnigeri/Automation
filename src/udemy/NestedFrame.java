package udemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) {
     
      
		System.setProperty("webdriver.chrome.driver", "./sf/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[.='Nested Frames']")).click();
		System.out.println(driver.findElements(By.tagName("frame")).size());
	
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.xpath("//div[.='MIDDLE']")).getText());
		driver.switchTo().frame("frame-right");
		
		
	}
}
