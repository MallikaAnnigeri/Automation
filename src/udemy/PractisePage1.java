package udemy;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractisePage1 {
	
	
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/windows']")).click();
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		Set<String> wins = driver.getWindowHandles();
		Iterator<String> win= wins.iterator();
		String parent = win.next();
		String child = win.next();
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.xpath("//h3[.='New Window']")).getText());
		
		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.xpath("//h3[.='Opening a new window']")).getText());
		
		

		

}
}
