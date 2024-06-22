package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame3 {
	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "./sws/chromedriver.exe");
   WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.get("file:///C:/Udemy/MainPage1.html");
	driver.manage().window().maximize();
	WebElement Email= driver.findElement(By.id("i2"));
	Email.sendKeys("mallika@98gmail.com");
	driver.switchTo().frame("frame1");//witching by name attribute value

	WebElement USN= driver.findElement(By.name("n1"));
	USN.sendKeys("Mallika");
	driver.switchTo().parentFrame();
	driver.switchTo().frame("frame2");//switching by name attribute value
	WebElement pwd= driver.findElement(By.name("n2"));
	pwd.sendKeys("1234");

	

	
	
	

}
}