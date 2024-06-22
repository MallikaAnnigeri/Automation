package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script5 {
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("name")).sendKeys("Mallika");
		driver.findElement(By.id("email")).sendKeys("mallikaannigeri12@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Mallika@98");
		Thread.sleep(1000);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("btn2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("btn4")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("btn5")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("btn6")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("btn7")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("btn8")).click();
		
		
		
	}

}
