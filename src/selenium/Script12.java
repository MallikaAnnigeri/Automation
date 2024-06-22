package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script12 {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.jio.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@aria-label='Explore Mobile']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@cust-url='/selfcare/recharge/mobility/?entrysource=Mobilepage%20header']")).click();
		driver.findElement(By.xpath("//input[@id='submitNumber']")).sendKeys("8073654084");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='j-button j-button-size__medium primary']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='Details_buttonStyle__2tLpO j-button j-button-size__small primary']")).click();
		
		
		
	}
	

}
