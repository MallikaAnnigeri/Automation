package JavaStream;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "./sf/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.xpath("//footer[@id='glbfooter' and @class='gh-w']"));
		List<WebElement> links = footer.findElements(By.tagName("a"));
		List<String> linkstext=new ArrayList<>();
		links.forEach(ele-> linkstext.add(ele.getText()));
		linkstext.forEach(System.out::println);
		
		
		System.out.println("-------------------------------------------");
		
		
		
		
		
		
		
		//other way
		
		
		WebElement footer1 = driver.findElement(By.xpath("//footer[@id='glbfooter' and @class='gh-w']"));

		 footer1.findElements(By.tagName("a")).stream().forEach(ele-> linkstext.add(ele.getText()));
		 linkstext.forEach(System.out::println);

		 
		 
		
	}
}
