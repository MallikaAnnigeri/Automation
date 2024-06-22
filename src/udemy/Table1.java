package udemy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","./sf/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;//it an inteface
		js.executeScript("window.scrollBy(0,500)");
		List<WebElement> clm3 = driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
		int no=clm3.size();
		int sum=0;
		for(int i=0;i<no;i++)
		{
			sum=sum+Integer.parseInt(clm3.get(i).getText());
		}
		System.out.println(sum);
		driver.close();
		

		

}
}