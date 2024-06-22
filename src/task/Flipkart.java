package task;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {
	
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "./sws/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.Flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
		WebElement element = driver.findElement(By.xpath("//h2[.='Realme smartphones']"));
	     Point loc = element.getLocation();
	    int x= loc.getX();
	    int y=loc.getY();
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy("+x+","+y+")");
		driver.findElement(By.xpath("//a[.='realme P1 5G (Phoenix Red, 128 GB)']")).click();
		Thread.sleep(2000);
	
		Set<String> wins = driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<>(wins);
        String win1 = arr.get(1);
        driver.switchTo().window(win1);
		WebElement btn = driver.findElement(By.xpath("//button[text()='Buy Now']"));
		btn.click();


		

}
}