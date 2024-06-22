package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://letcode.in/dropdowns");
		Thread.sleep(2000);
		WebElement dd = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select s= new Select(dd);
		s.selectByIndex(4);
		
		WebElement d1 = driver.findElement(By.xpath("//select[@id='superheros']"));
		Select s1=new Select(d1);
		s1.selectByIndex(1);
		s1.selectByIndex(2);
		s1.selectByIndex(3);
		Thread.sleep(2000);
		
		
		WebElement d2 = driver.findElement(By.xpath("//select[@id='lang']"));
		Select s2=new Select(d2);
		s1.selectByVisibleText("C#");
		
		
		WebElement d3 = driver.findElement(By.xpath("//select[@id='country']"));
		Select s3=new Select(d3);
		s1.selectByVisibleText("Argentina");
		
		

		
		

}

}
