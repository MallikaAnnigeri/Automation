package udemy;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractisePage {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//a[@href='https://rahulshettyacademy.com/documents-request']")).click();
		Set<String> wins = driver.getWindowHandles();
		Iterator<String> it = wins.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
     	String value = driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
	 String v1 = value.split("at")[1].trim().split(" ")[0];
	 System.out.println(v1);
	 driver.switchTo().window(parentId);
		driver.findElement(By.cssSelector("input#username")).sendKeys(v1);

	 

	}
}
