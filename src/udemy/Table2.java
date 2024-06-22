package udemy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {
	
	
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","./sf/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;//it an inteface
		js.executeScript("window.scrollBy(0,500)");
		
		System.out.println (driver.findElements(By.cssSelector(".table-display th")).size());
		System.out.println (driver.findElements(By.cssSelector(".table-display tr")).size());
		
		List<WebElement> values = driver.findElements(By.cssSelector(".table-display tr:nth-child(3) td"));
		for(int i=0;i<values.size();i++)
		{
			
			String row=values.get(i).getText();
			Thread.sleep(1000);
			System.out.print(row+"    ");
		}

		
		

}
}