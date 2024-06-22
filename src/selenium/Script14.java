package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script14 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///C:/Users/Dell/Desktop/Facebook/txt.html");
		Thread.sleep(2000);
		List<WebElement> txt=driver.findElements(By.xpath("//input[@type='text']"));
      for(WebElement cl:txt)
      {
    	  cl.clear();
      }
      int count=txt.size();
      for(int i=count-1;i>0;i--)
      {
    	  Thread.sleep(2000);
        WebElement c= txt.get(i);
        c.sendKeys("Mallika");
      }
}
}