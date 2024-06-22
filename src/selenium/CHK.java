package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CHK {
public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.get("file:///C:/Users/Dell/Desktop/Facebook/CHK.html");
	Thread.sleep(2000);
	List<WebElement> ck=driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	for(WebElement cb:ck)
	{
		cb.click();
		
	}
	int count=ck.size();
	for(int i=count-1;i>=0;i--)
	{
       WebElement c= ck.get(i);
       c.click();
	}
 


}
}
