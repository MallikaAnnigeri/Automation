package udemy;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google1 {


public static void main(String[] args)throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.xpath("//textarea[@name='q']"));
		search.sendKeys("selenium",Keys.ENTER);
	
		
		WebDriverWait w=new WebDriverWait(driver,10);
		WebElement element = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h3)[1]")));
        element.click();
}
}