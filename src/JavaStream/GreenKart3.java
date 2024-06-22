package JavaStream;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart3 {
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "./sf/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

	driver.findElement(By.xpath("//a[.='Top Deals']")).click();
	Set<String> win = driver.getWindowHandles();
	Iterator<String> wins = win.iterator();
	String parentwin = wins.next();
	String childwin = wins.next();
	driver.switchTo().window(childwin);
	driver.findElement(By.xpath("//span[.='Veg/fruit name']")).click();

	
	List<WebElement> products = driver.findElements(By.xpath("//td[1]"));
	List<String> productList = products.stream().filter(s -> s.getText().contains("Beans")).map(s -> getVeggies(s)).collect(Collectors.toList());
	productList.forEach(System.out::println);
	driver.quit();
}
	

public static String getVeggies(WebElement s) {
	String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
	return price;

}
}
