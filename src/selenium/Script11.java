package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script11 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#login-username")).sendKeys("mallikaannigeri12@yahoo.com");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("Mallika@2541998");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='login-signin']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='ybarMailLink']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='/d/compose/']")).click();
		driver.findElement(By.cssSelector("input[id='message-to-field']")).sendKeys("mallikaannigeri12@gmail.com");
		driver.findElement(By.xpath("//input[@id='compose-subject-input']")).sendKeys("Dear Mallika");
	    driver.findElement(By.cssSelector("div[aria-label='Message body']")).sendKeys("Hello, its me mallika");
	    driver.findElement(By.xpath("//button[.='Send']")).click();
		
	}
	

}
