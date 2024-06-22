package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
   WebElement sr= driver.findElement(By.className("Pke_EE"));
   String a= sr.getAttribute("name");
   System.out.println(a);
}
}