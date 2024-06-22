package udemy;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
public static void main(String[] args)throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.xpath("//textarea[@name='q']"));
		search.sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@role='presentation']/span"));
       for(WebElement suggestion:suggestions)
       {
    	  if(suggestion.getText().equalsIgnoreCase("selenium download"))
    	  {
    	    suggestion.click();
    	  }
    	  // String value = suggestion.getText();
    	  //System.out.println(value);
       }
}

}
