package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		WebElement btn = driver.findElement(By.name("submit"));
		btn.click();
		Alert a1=driver.switchTo().alert();
		//a1.accept();
		Thread.sleep(2000);
		a1.dismiss();

}


}
