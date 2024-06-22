

package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script13 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		String url=driver.getCurrentUrl();
		if(url.equals("https://www.flipkart.com/"))
		{
			System.out.println("url is currect");
		}
	
		
	

		
	}

}
