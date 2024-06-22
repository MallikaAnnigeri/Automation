package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script7 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("Mallikaannigeri12@gmal.com");
		WebElement pwd=driver.findElement(By.xpath("//input[@id='pass']"));
		pwd.sendKeys("Mallika@98");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}

}
