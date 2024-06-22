package udemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Script5 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./sws/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.id("divpaxinfo")).click();
        WebElement plus = driver.findElement(By.id("hrefIncAdt"));
        for(int i=1;i<=6;i++)
        {
        plus.click();
        }
     
        driver.findElement(By.className("buttonN")).click();
        String adult = driver.findElement(By.id("divpaxinfo")).getText();
        
       Assert.assertEquals(adult,"6 Adult","the count is not 6");
        
     

}
}