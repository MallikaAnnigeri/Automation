package task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecommerce {
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "./sws/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://admin-demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebDriverWait w=new WebDriverWait(driver,10);
		WebElement custbtn = driver.findElement(By.xpath("(//i)[25]"));
		w.until(ExpectedConditions.visibilityOf(custbtn));
		custbtn.click();
		WebElement customer = driver.findElement(By.xpath("//a[@href='/Admin/Customer/List']"));
		w.until(ExpectedConditions.visibilityOf(customer));

		customer.click();
		
		
		WebElement addcust = driver.findElement(By.xpath("//a[@href='/Admin/Customer/Create']"));
		w.until(ExpectedConditions.visibilityOf(addcust));

		addcust.click();
		
		

		WebElement email = driver.findElement(By.name("Email"));
		w.until(ExpectedConditions.visibilityOf(email));

		email.sendKeys("mallika@12gmail.com");
		
		
		WebElement fn = driver.findElement(By.name("FirstName"));
		w.until(ExpectedConditions.visibilityOf(fn));

		fn.sendKeys("Mallika");
		
		
		WebElement ln = driver.findElement(By.name("LastName"));
		w.until(ExpectedConditions.visibilityOf(ln));

		ln.sendKeys("Annigeri");
		
		driver.findElement(By.xpath("//button[@name='save']")).click();




		


}
}