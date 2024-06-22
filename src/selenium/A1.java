package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.className("_55r1"));
		email.sendKeys("mallikaannigeri12@gmail.com");
	    WebElement pwd= driver.findElement(By.name("pass"));
	    pwd.sendKeys("Mallika@98");
	    Thread.sleep(2000);
	    WebElement login=driver.findElement(By.name("login"));
	    login.click();
	    
	}

}
