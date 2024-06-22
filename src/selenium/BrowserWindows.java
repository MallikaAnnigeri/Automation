package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindows {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
		driver.findElement(By.xpath("//button[text()='Click to open multiple popup windows']")).click();
        Set<String> windows = driver.getWindowHandles();
     int count = windows.size();
     for(String win:windows)
     {
    	 System.out.println(win);
      }
     driver.quit();
   }
	}
