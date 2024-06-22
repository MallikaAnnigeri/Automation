package udemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Script7 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./soft/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Mallika");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Mallikaannigeri12@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Mallika@98");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		WebElement dd = driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		
		Select s=new Select(dd);
		s.selectByIndex(1);
		
		
		driver.findElement(By.cssSelector("#inlineRadio1")).click();
		
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("15-5-2024");
		
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		
		String text = driver.findElement(By.cssSelector(".alert-success")).getText();
		System.out.println(text);
		
	
}
}
		