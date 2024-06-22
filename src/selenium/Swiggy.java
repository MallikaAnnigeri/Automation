package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Swiggy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("biryani");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@data-testid='autosuggest-item\']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='_1RPOp\']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[.='Cart']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='LOG IN']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("mobile")).sendKeys("8073654084");
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//a[.='Login']")).click();
		Thread.sleep(2000);
	}

}
