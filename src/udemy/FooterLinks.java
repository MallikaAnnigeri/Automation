package udemy;

import java.awt.Window;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FooterLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./soft/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.Flipkart.com");

		WebElement fs1 = driver.findElement(By.xpath("//div[@class='_1ZMrY_']/div[1]"));

	List<WebElement> aboutus = fs1.findElements(By.tagName("a"));
		for(int i=0;i<aboutus.size();i++)
		{
			String tab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			fs1.findElements(By.tagName("a")).get(i).sendKeys(tab);
			
		}
		Thread.sleep(3000);
		Set<String> wins = driver.getWindowHandles();
		Iterator<String> win = wins.iterator();
		while(win.hasNext())
		{
			driver.switchTo().window(win.next());
			Thread.sleep(4000);
			System.out.println(driver.getTitle());
			
		}
		driver.quit();
		

	}
}