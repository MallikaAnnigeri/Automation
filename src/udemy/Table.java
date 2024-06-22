package udemy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Table {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","./sf/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	JavascriptExecutor js=(JavascriptExecutor)driver;//it an inteface
	js.executeScript("window.scrollBy(0,500)");
	js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
	List<WebElement> clm4= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
	int no=clm4.size();
	int sum=0
			;
	for(int i=0;i<no;i++)
	{
		sum=sum+Integer.parseInt(clm4.get(i).getText());
	}
	System.out.println(sum);
	
	int actual=Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim());
    Assert.assertEquals(actual, sum,"Assertion fail"); 
    
    driver.quit();

}
}