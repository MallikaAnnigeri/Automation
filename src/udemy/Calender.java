package udemy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calender {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		String date="6";
		String month="8";
		String year="2024";
		String[] Expected= {month,date,year};
		driver.findElement(By.cssSelector("div.react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText ")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText ")).click();
		driver.findElement(By.xpath("//button[.='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
		driver.findElement(By.xpath("//abbr[.='"+date+"']")).click();
		List<WebElement> date1 = driver.findElements(By.cssSelector("input.react-date-picker__inputGroup__input"));
		for(int i=0;i<date1.size();i++)
		{
			String actualdate = date1.get(i).getAttribute("value");
			Assert.assertEquals(actualdate,Expected[i]);
			
		}
		driver.quit();




		
	}
}
