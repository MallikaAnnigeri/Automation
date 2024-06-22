package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script9 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.google.com/maps/@12.9794048,77.594624,12z?entry=ttu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("Bangalore");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input)[3]")).sendKeys("Hubli");
	    Thread.sleep(4000);
	   driver.findElement(By.xpath("(//input)[3]/../../following-sibling::button[1]")).click();
	  
	   
	
	}

}
