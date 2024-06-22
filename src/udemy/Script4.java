package udemy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script4 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./sws/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s=new Select(dropdown);
        List<WebElement> op = s.getOptions();
        for(WebElement opts:op)
        {
        	String text = opts.getText();
        	System.out.println(text);
		
         }
        //imp script how to get Selected option text
        
          s.selectByIndex(2) ;
        String st = s.getFirstSelectedOption().getText();
        System.out.println(st);
        

}
}