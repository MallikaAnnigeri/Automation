package udemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.get("https://www.amazon.com/");
		WebElement search = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		search.sendKeys("mallika");
		Thread.sleep(2000);
		search.sendKeys(Keys.CONTROL+"a",Keys.DELETE);

}
}