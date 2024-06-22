package udemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rahulshetty {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./sws/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	
	
}
}


