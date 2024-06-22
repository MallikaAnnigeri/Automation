package selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFromField {


		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			driver.get("file:///C:/Users/Dell/Desktop/Facebook/Disabled.html");
			JavascriptExecutor js=(JavascriptExecutor)driver;

			js.executeScript("document.getElementById('i1'). value='abcd'");
			Thread.sleep(2000);

		
		
		
		
}
}