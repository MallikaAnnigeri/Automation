package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup2 {
	

		public static void main(String[] args) throws InterruptedException {
				
				System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				
				driver.get("https://the-internet.herokuapp.com/javascript_alerts");
				Thread.sleep(2000);
			WebElement btn = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
			btn.click();
			Alert a1=driver.switchTo().alert();
			a1.sendKeys("mallika");
			a1.accept();
			
			
		}

}
