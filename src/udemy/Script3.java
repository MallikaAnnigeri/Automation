
package udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script3 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./sws/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.navigate().to("https://www.flipkart.com");
		driver.navigate().back();
		driver.navigate().forward();
		
		
	}

}
