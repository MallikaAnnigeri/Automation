package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "./sws/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.get("file:///C:/Udemy/MainPage.html");
	driver.manage().window().maximize();
	driver.findElement(By.id("i1")).sendKeys("Mallika");
	WebElement fm = driver.findElement(By.xpath("//iframe[@src='Frame.html']"));
	driver.switchTo().frame(fm);
	driver.findElement(By.xpath("//input[@id='i2']")).sendKeys("Annigeri");
	
	

}
}