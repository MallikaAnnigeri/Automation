package JavaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./sf/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.findElement(By.xpath("//a[.='Top Deals']")).click();
		Set<String> win = driver.getWindowHandles();
		Iterator<String> wins = win.iterator();
		String parentwin = wins.next();
		String childwin = wins.next();
		driver.switchTo().window(childwin);
		driver.findElement(By.xpath("//span[.='Veg/fruit name']")).click();
	
		List<WebElement> products=driver.findElements(By.xpath("//td[1]"));
	   List<String> originallist=products.stream().map(s-> s.getText()).collect(Collectors.toList());
	   
	   
	  List<String> sortedList= originallist.stream().sorted().collect(Collectors.toList());
	  
	  Assert.assertTrue(originallist.equals(sortedList));
	
	  driver.quit();
	   
		
		/*
		 * String[] arr = { "Cucumber", "Brocolli", "Beetroot" };
		 * 
		 * List<String> itemsneeded = Arrays.asList(arr); List<WebElement> items =
		 * driver.findElements(By.cssSelector("h4.product-name"));
		 * 
		 * for (int i = 0; i < items.size(); i++) { String names =
		 * items.get(i).getText(); String item = names.split("-")[0].trim();
		 * 
		 * if (itemsneeded.contains(item)) {
		 * driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i)
		 * .click(); }
		 * 
		 * }
		 * 
		 * 
		 * driver.findElement(By.cssSelector(".cart-icon")).click();
		 * driver.findElement(By.xpath("//button[.='PROCEED TO CHECKOUT']")).click();
		 * 
		 */
	}
	
	

 
	
	
	}

