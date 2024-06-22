package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWait {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	
		driver.get("https://www.facebook.in");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	   WebElement usn = driver.findElement(By.id("email"));
	   usn.sendKeys("mallika");

	   WebElement pwd = driver.findElement(By.id("pass"));
	   pwd.sendKeys("mallika@123");

	   WebElement log = driver.findElement(By.name("login"));
	   log.click();

	   
	  

	   
	   
		
		

}
}