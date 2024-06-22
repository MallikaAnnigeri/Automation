package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='enter your number']")).sendKeys("9764449098");
		Thread.sleep(2000);
		WebElement d1 = driver.findElement(By.xpath("//select[@id='select2']"));
		Select s1 = new Select(d1);

		s1.selectByIndex(2);

		Thread.sleep(2000);

		WebElement d2 = driver.findElement(By.xpath("//select[@id='select3']"));
		Select s2 = new Select(d2);

		s2.selectByIndex(7);

		Thread.sleep(2000);

		WebElement d3 = driver.findElement(By.xpath("//select[@id='select5']"));
		Select s3 = new Select(d3);

		s3.selectByVisibleText("Karnataka");

		Thread.sleep(2000);

		WebElement d4 = driver.findElement(By.xpath("(//select)[6]"));
		Select s4 = new Select(d4);

		s4.selectByVisibleText("Belgaum");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
}