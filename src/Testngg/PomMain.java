package Testngg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PomMain {
	
	
	@Test
	public void Application() throws InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver", "./sf/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Pom p=new Pom(driver);
	p.enterUsn("admin");
	Thread.sleep(2000);
	p.enterpwd("admin2123");
	p.clickLogin();
	

}
}