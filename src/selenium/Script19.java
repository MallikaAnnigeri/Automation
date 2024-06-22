package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script19 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait w=new WebDriverWait(driver,10);
		WebElement usn = driver.findElement(By.name("username"));
		w.until(ExpectedConditions.visibilityOf(usn));
		usn.sendKeys("Admin");

	    WebElement pwd = driver.findElement(By.name("password"));
		w.until(ExpectedConditions.visibilityOf(pwd));
		pwd.sendKeys("admin123");

	  WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
	  w.until(ExpectedConditions.visibilityOf(submit));
	  submit.click();

	
		WebElement button = driver.findElement(By.xpath("(//a)[3]"));
		w.until(ExpectedConditions.visibilityOf(button));
		button.click();
		
		WebElement tab = driver.findElement(By.xpath("//a[text()='Add Employee']"));
		  w.until(ExpectedConditions.visibilityOf(tab));
		  tab.click();
		  
		WebElement fn = driver.findElement(By.name("firstName"));
		w.until(ExpectedConditions.visibilityOf(fn));
		fn.sendKeys("Mallika");
		
		WebElement mn = driver.findElement(By.name("middleName"));
		w.until(ExpectedConditions.visibilityOf(mn));
		mn.sendKeys("Abdul");
		
		WebElement ln = driver.findElement(By.name("lastName"));
		w.until(ExpectedConditions.visibilityOf(ln));
		ln.sendKeys("Annigeri");
		
		WebElement sm = driver.findElement(By.xpath(" //button[@type='submit']"));
		w.until(ExpectedConditions.visibilityOf(sm));
		sm.click();
		

		
		






		



		
		
	}
}
