package udemy;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	driver.findElement(By.cssSelector("input#username")).sendKeys("rahulshettyacademy");
	driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("learning");
	driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button#okayBtn")).click();

	driver.findElement(By.xpath("//select/option[3]")).click();
	driver.findElement(By.cssSelector("input[type='checkbox']")).click();
	driver.findElement(By.id("signInBtn")).click();
	String[] arr= {"iphone","Samsung","Nokia","Blackberry"};
	List<String> items = Arrays.asList(arr);
	
	
	List<WebElement> products = driver.findElements(By.xpath("//h4[@class='card-title']"));
	
	
	for(int i=0;i<products.size();i++)
	{
	    WebElement product = products.get(i);
	    String text = product.getText();
		String p1 = text.split(" ")[0];
		if(items.contains(p1))
			
		{
			driver.findElements(By.xpath("//div[@class='card-footer']")).get(i).click();
			Thread.sleep(2000);
		}
	}
	driver.findElement(By.xpath("(//a)[5]")).click();
	driver.findElement(By.cssSelector("button.btn.btn-success")).click();
	
	
	
	
	
	

	
	

}
}