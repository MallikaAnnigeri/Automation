package JavaStream;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./sf/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Dell/Desktop/Facebook/CHK.html");
	
		List<WebElement> ck=driver.findElements(By.xpath("//input[@type='checkbox']"));
		ck.forEach(ele->ele.click());
		

	}
}
