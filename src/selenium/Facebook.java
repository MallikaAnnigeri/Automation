package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement s=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		  int ht=s.getSize().getHeight();
		  System.out.println(ht);
		    
		int i=  s.getSize().getWidth();
		System.out.println(i);
		

}
}