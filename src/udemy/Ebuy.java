package udemy;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Ebuy {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.get("http://www.ebay.com");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.xpath("//footer[@id='glbfooter' and @class='gh-w']"));
	    System.out.println(footer.findElements(By.tagName("a")).size());//count of links present in the footer
	//WebElement row1 = driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
	   WebElement row1 = driver.findElement(By.xpath("(//td)[12]/ul"));
	    int Buy = row1.findElements(By.tagName("a")).size();
	   
	    for(int i=0;i<Buy;i++)
	    {
	    String newTab = Keys.chord(Keys.CONTROL,Keys.ENTER);//imp

	    
	    	row1.findElements(By.tagName("a")).get(i).sendKeys(newTab);
	    }
	    	Thread.sleep(5000);
	    	Set<String> wins = driver.getWindowHandles();
	    	Iterator<String> win = wins.iterator();
	    	
	    	while(win.hasNext())
	    	{
	    		driver.switchTo().window(win.next());
	    		System.out.println(driver.getTitle());
	    	}
	    }

	 
		
		
		
	}

