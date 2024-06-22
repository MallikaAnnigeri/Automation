package udemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input#checkBoxOption3")).click();

		String value = driver.findElement(By.xpath("//label[@for='honda']")).getText();
	
		WebElement address = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		 Select s=new Select(address);
		 s.selectByVisibleText(value);
		 driver.findElement(By.cssSelector("input#name")).sendKeys(value);
		 driver.findElement(By.cssSelector("input#confirmbtn")).click();
		System.out.println( driver.switchTo().alert().getText());
		
		 
		 



	}
}

