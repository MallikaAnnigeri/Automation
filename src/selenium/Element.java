package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Element {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///C:/Users/Dell/Desktop/Facebook/Malika.html");
		Thread.sleep(2000);
		WebElement tf=driver.findElement(By.xpath("(//input)[1]"));
		boolean res = tf.isDisplayed();
		if(res)
		{
			System.out.println("displayed");
			
		}
		else
		{
			System.out.println("not displayed");
		}
	


}
}