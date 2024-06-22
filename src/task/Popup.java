package task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");

		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert a1 = driver.switchTo().alert();
		Thread.sleep(2000);
		String text=a1.getText();
		System.out.println(text);
		a1.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		a1.accept();
}
}