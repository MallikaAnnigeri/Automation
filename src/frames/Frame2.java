package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./sws/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("file:///C:/source%20code/MainPage1.html");
		driver.manage().window().maximize();
		WebElement usn = driver.findElement(By.id("i3"));
		usn.sendKeys("mallika");
		driver.switchTo().frame("frame1");// switching to frame1 by name attribute value
		WebElement email = driver.findElement(By.id("i1"));
		email.sendKeys("Mallika@98gmail.com");

		driver.switchTo().frame(0);// switching to  frame2 by passing index and it is always 0
		WebElement pwd = driver.findElement(By.id("i2"));
		pwd.sendKeys("1234");
		pwd.clear();
		driver.switchTo().parentFrame();
		email.clear();
		
		driver.switchTo().parentFrame();
		usn.clear();
		

		


		

		

}

}
