package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {
	public static void main(String[] args)  {
		
		String key="webdriver.chrome.driver";
		String value="./software/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
		driver.close();
		
		
		String key1="webdriver.gecko.driver";
		String value1="./software/geckodriver.exe";
		System.setProperty(key1, value1);
		FirefoxDriver driver1=new FirefoxDriver();
		
		driver1.close();
	}

}
