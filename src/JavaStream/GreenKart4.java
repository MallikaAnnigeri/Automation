package JavaStream;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GreenKart4 {

        @Test
        public void run()
        {
		
		System.setProperty("webdriver.chrome.driver", "./sf/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.xpath("//a[.='Top Deals']")).click();
		Set<String> win = driver.getWindowHandles();
		Iterator<String> wins = win.iterator();
		String parentwin = wins.next();
		String childwin = wins.next();
		driver.switchTo().window(childwin);
		driver.findElement(By.cssSelector("input[type='search']")).sendKeys("Rice");
		List<WebElement> products = driver.findElements(By.xpath("//td[1]"));
		List<WebElement> filteredlist = products.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		
		Assert.assertEquals(products.size(),filteredlist.size());
		driver.quit();


}
}