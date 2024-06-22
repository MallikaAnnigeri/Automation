package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDown {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=1;i<=3;i++)
		{
			js.executeScript("window.scrollBy(0,300)");
			Thread.sleep(2000);
		}
		
		Thread.sleep(2000);
		for(int i=1;i<=3;i++)
		{
			js.executeScript("window.scrollBy(0,-300)");
			Thread.sleep(2000);
		}
}

}
