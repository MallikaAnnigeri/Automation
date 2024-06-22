package udemy;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart {
	
	
	
	public static void  products(WebDriver driver,String[] arr) {
		   List<String> itemsneeded = Arrays.asList(arr);
			List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));
			  int j=0;  
			for(int i=0;i<items.size();i++)
			{
				String names = items.get(i).getText();
				String item = names.split("-")[0].trim();
				
			
				if(itemsneeded.contains(item))
				{
				 driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				}
			     
			
				
			}

	
	}
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    String[] arr= {"Cucumber","Brocolli","Beetroot"};

   
	products(driver,arr);
	driver.findElement(By.cssSelector(".cart-icon")).click();
    driver.findElement(By.xpath("//button[.='PROCEED TO CHECKOUT']")).click();
	
		
	}
}

