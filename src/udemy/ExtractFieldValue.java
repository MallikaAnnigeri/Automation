package udemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtractFieldValue {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./sf/geckodriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("mallika");
		Thread.sleep(2000);
		Object value = js.executeScript("return arguments[0].value;", email);// String value =(String) js.executeScript("return arguments[0].value;",email);
//So, overall, this line of code is executing JavaScript to retrieve the value of the email element on the web page, and then casting that value to a Java String type and assigning it to the variable value.




		System.out.println(value);// mallika
		driver.quit();

	}
}
