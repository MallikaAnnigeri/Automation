package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		WebDriverWait wt =new WebDriverWait(driver, 10);
		String url = driver.getCurrentUrl();
		wt.until(ExpectedConditions.urlContains("facebook"));
		System.out.println(url);
		

}
}