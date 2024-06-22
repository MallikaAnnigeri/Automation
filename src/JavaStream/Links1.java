package JavaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Links1 {
	
public static void main(String[] args) {
	

		
	
	System.setProperty("webdriver.chrome.driver", "./sf/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.get("http://www.ebay.com");
	driver.manage().window().maximize();
	System.out.println(driver.findElements(By.tagName("a")).size());
	WebElement footer = driver.findElement(By.xpath("//footer[@id='glbfooter' and @class='gh-w']"));
	List<WebElement> links = footer.findElements(By.tagName("a"));
	List<String> linkstext=new ArrayList<>();
	links.forEach(ele-> linkstext.add(ele.getText()));
	boolean text=linkstext.stream().anyMatch(s->s.equalsIgnoreCase("eBay Money Back Guarantee"));//checking whether list contains this linktext are not
	Assert.assertTrue(text);
	
	
	System.out.println("--------------------------------------------------------------");
	//fetching the first link text setting limit =1 
	linkstext.stream().limit(1).forEach(System.out::println);
	
	
	driver.quit();
	
	 
	 
	 
}

}
