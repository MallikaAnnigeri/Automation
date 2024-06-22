package udemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MakeMyTrip {
	
	
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "./sf/chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	Thread.sleep(2000);
	driver.get("https://www.makemytrip.com/");
	Thread.sleep(6000);
	String month="June 2024";
	String date="15";
	driver.findElement(By.xpath("//span[text()='Departure']")).click();
	driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='"+date+"']")).click();
			
	//div[text()='June 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='23']

}
}