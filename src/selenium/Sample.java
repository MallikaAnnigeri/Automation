package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		
		String key="webdriver.chrome.driver";
		String value="./software/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.close();
		
		String key1="webdriver.gecko.driver";
		String value1="./software/geckodriver.exe";
		System.setProperty(key1, value1);
		FirefoxDriver driver1=new FirefoxDriver();
		Thread.sleep(2000);
		driver1.quit();
		
	}

}
