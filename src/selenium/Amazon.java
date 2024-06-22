package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		
	    WebElement sc = driver.findElement(By.xpath("//div[text()='Get to Know Us']"));
	   Point loc = sc.getLocation();
	   int x=loc.getX();
	   int y=  loc.getY();
	   System.out.println(x);
	   System.out.println(y);
	   
	   
	     JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy("+x+","+y+")");
			Thread.sleep(2000);
	   
	   
	   
}

}
